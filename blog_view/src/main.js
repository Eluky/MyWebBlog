// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import 'element-ui/lib/theme-chalk/index.css'
import 'font-awesome/css/font-awesome.css'
import $ from 'jquery'
import iView from 'iview';
import '../node_modules/iview/dist/styles/iview.css';
import VueResource from 'vue-resource';
import tool from './api/index';

Vue.prototype.$tool = tool;

Vue.use(VueResource);
axios.defaults.baseURL = 'http://localhost:8443/api';
Vue.prototype.$axios=axios;

Vue.config.productionTip = false;
Vue.use(iView);

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});

window.router=router;

router.beforeEach((to, from, next) => {
  if (to.matched.some(res=>res.meta.requireAuth)){  // 判断该路由是否需要登录权限
    if (window.sessionStorage.getItem('loginInfo')) {  // 判断当前用户的登录信息loginInfo是否存在
      next();
    } else {
      next({
        path: '/login'
      })
    }
  }else {
    next();
  }
})


