<template>
  <div>
    <blog-header></blog-header>
    <Row class="row" style="width: 100%;margin-top: 50px">
      <Col span="12">
        <div id="loginPic">
          <img style="max-width: 100%;box-shadow: 2px 2px 5px rebeccapurple" src="../../assets/bg.jpg">
          <p style="font-family: Impact;font-size: 20px;color: white;text-align: right;margin-top: 5px">Under the SKY.</p>
        </div>
      </Col>
      <Col span="12">
        <div id="login">
          <div style="margin: 0 auto;margin-top:5px;width: 90%">
            <p style="border-bottom: mediumpurple;border-bottom-style: solid;border-bottom-width: 1px;padding-bottom: 20px;color: mediumpurple">魔法通行证</p>
          </div>
          <p id="alertP" style="color: mediumpurple;font-size: 5px;display:none;margin-top: 10px">喵～阁下的魔法名或者钥匙是不是错了呢～</p>
          <p id="alertP1" style="color: mediumpurple;font-size: 5px;display:none;margin-top: 10px">输入不能为空哦</p>
          <Form id="loginForm">
            <FormItem>
              <Input prefix="md-star-outline" class="form-control" v-model="loginInfo.username" placeholder="魔之本名" />
            </FormItem>
            <FormItem>
              <Input type="password" prefix="md-key" class="form-control" v-model="loginInfo.password" placeholder="钥匙" />
            </FormItem>
            <FormItem>
              <Button id="loginBtn" shape="circle" class="btn btn-default" v-on:click="login" style="color: mediumpurple;border-color: mediumpurple;font-family: Impact;font-size: 15px">ENTER</Button>
            </FormItem>
          </Form>
        </div>
      </Col>
    </Row>
    <blog-footer style="position: absolute;bottom: 0"></blog-footer>
  </div>
</template>

<script>
    import blogHeader from '@/components/common/BlogHeader.vue'
    import blogFooter from '@/components/common/BlogFooter.vue'

    export default {
        name: 'Login',
        components: { blogHeader, blogFooter },
        data () {
            return {
                loginInfo: { username: '', password: '' },
                responseResult: []
            }
        },
        methods: {
            login () {
                var name = this.loginInfo.username;
                var pwd = this.loginInfo.password;
                if(!name){
                    $("#loginForm").css("margin-top","5px");
                    $("#alertP1").fadeIn()
                }else if(!pwd){
                    $("#loginForm").css("margin-top","5px");
                    $("#alertP1").fadeIn()
                }else{
                    this.$axios
                        .post('/login', {
                            username: this.loginInfo.username,
                            password: this.loginInfo.password
                        })
                        .then(successResponse => {
                            this.responseResult = JSON.stringify(successResponse.data);
                            if (successResponse.data.code === 200) {
                                this.$router.replace({path: '/index'});
                                window.sessionStorage.setItem('loginInfo',this.loginInfo.username);
                                this.$tool.isLogin = true;
                                window.location.href='/index'
                            }
                            else {
                                $(function () {
                                    $("#loginForm").css("margin-top","5px");
                                    $("#alertP").fadeIn()
                                })
                            }
                        })
                        .catch(failResponse => {})
                }
            },

        },
    }
    $(function(){
        $(".ivu-input").focus(function () {
            $("#alertP").css("display","none");
            $("#alertP1").css("display","none");
            $("#loginForm").css("margin-top","30px");
        })
    })
</script>

<style scoped>
#login {
  width: 50%;
  background-color: rgba(255, 255, 255, 1);
  margin-left: 20%;
  padding: 15px;
  box-shadow: 3px 3px 5px rebeccapurple;
  font-family: "Georgia";
  color: mediumpurple;
  font-size: 20px;
  font-weight: 800;
  border-radius: 0 10px 10px 0;
  border-left: rebeccapurple solid 10px;
}
#loginPic {
  width: 63%;
  margin-left: 30%;
  margin-top: 0;
}
#loginForm {
  margin: 0 auto;
  width: 90%;
  margin-top: 30px;
  margin-bottom: 10px;
  text-align: center;
}
>>>.ivu-input:focus {
  box-shadow: none;
  border-color: mediumpurple;
}
>>>.ivu-input:hover {
  box-shadow: none;
  border-color: mediumpurple;
}
</style>
