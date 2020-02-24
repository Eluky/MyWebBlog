import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import BlogLogin from '@/components/user/Login.vue'
import BlogIndex from '@/components/home/BlogIndex.vue'
import BlogAnimation from "@/components/menu/BlogAnimation";
import BlogContents from "@/components/home/BlogContents";
import BlogEdit from "@/components/edit/BlogEdit";
import BlogMessageBoard from "@/components/menu/BlogMessageBoard";


Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/index',
      meta: {
        requireAuth: true
      }
    },
    {
      path: '/index',
      name: 'index',
      component: BlogIndex,
      meta: {
        requireAuth: true
      }
    },
    {
      path: '/login',
      name: 'login',
      component: BlogLogin
    },
    {
      path: '/contents',
      name: 'contents',
      component: BlogContents,
    },
    {
      path: '/animation',
      name: 'animation',
      component: BlogAnimation
    },
    {
      path: '/messageboard',
      name: 'messageboard',
      component: BlogMessageBoard
    },
    {
      path: '/edit',
      name: 'edit',
      component: BlogEdit,
      meta: {
        requireAuth: true
      }
    }
  ]
})
