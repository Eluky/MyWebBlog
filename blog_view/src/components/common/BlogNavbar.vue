<template>
  <div style="width: 70%;margin-left: 15%;text-align: left;margin-top: 40px;margin-bottom: 30px;">
    <Row>
      <Col span="16">
        <p style="color: white;font-size: 30px;font-family: Impact">ELUKY's SPACE</p>
      </Col>
      <Col span="5">
        <Form role="search" inline>
          <FormItem>
            <Input type="text" placeholder="look look"></Input>
          </FormItem>
          <FormItem>
            <Button shape="circle" icon="ios-search"></Button>
          </FormItem>
        </Form>
      </Col>
      <Col span="3">
        <Button v-if="!isLogin" id="loginBtn" shape="circle" class="btn btn-default" @click="gotoLogin" style="float: right">login</Button>
        <Button v-else id="adminBtn" shape="circle" class="btn btn-default" @click="gotoLogout" style="float: right">主人</Button>
      </Col>
    </Row>
  </div>
</template>

<script>
  export default {
      name: 'BlogNarbar',
      data(){
          return{
              isLogin: '',
          }
      },
      methods:{
          gotoLogin(){
              this.$router.replace('/login')
              alert(isLogin)
          },
          gotoLogout(){

          }
      },
      mounted() {
          isLogin = this.$tool.isLogin;
      }
  }
</script>

<style scoped>
  #searchInput {
    width: 70%;
    background: rgba(0,0,0,0);
    border-radius:0;
    border-top-width: 0;
    border-right-width:0;
    border-left-width:0;
    border-bottom-color: rebeccapurple;
  }
  >>>.ivu-btn {
    border-color: rebeccapurple;
  }
  >>>.ivu-btn:hover {
    border-color: rebeccapurple;
    color: mediumpurple;
  }
  >>>.ivu-input{
    border-radius: 40px;
    box-shadow: none;
    border-color: mediumpurple;
  }
  >>>.ivu-input:hover {
    box-shadow: none;
    border-color: mediumpurple;
  }
</style>
