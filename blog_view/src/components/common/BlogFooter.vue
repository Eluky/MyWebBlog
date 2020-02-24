<template>
  <div id="footer">
    <br>
    <p>Welcome to my magic world!</p>
    <div style="height: 60px;background-color: rebeccapurple;margin-top: 20px">
      <Row>
        <Col span="6" style="margin-top: 20px">
          <a v-on:click="gotoIndex" style="color: white;text-decoration: none">
            <span class="fa fa-home"></span>
            返回首页
          </a>
        </Col>
        <Col span="6" style="margin-top: 20px">
          <a v-on:click="gotoBoard" style="color: white;text-decoration: none">
            <span class="fa fa-edit"></span>
            留言板
          </a>
        </Col>
        <Col span="6" style="margin-top: 20px">
          <a href="/messageboard" style="color: white;text-decoration: none">
            <span class="fa fa-moon-o"></span>
            空间管理员
          </a>
        </Col>
        <Col span="6" style="margin-top: 20px">
          <a v-on:click="gotoContents" style="color: white;text-decoration: none;">
            <span class="fa fa-youtube-play"></span>
            内容总览
          </a>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
    export default {
        name: 'BlogFooter',
        methods: {
            gotoIndex() {
                window.location.href='/index'
            },
            gotoContents() {
                this.$router.replace('/contents')
            },
            gotoBoard() {
                this.$router.replace('/messageboard')
            }
        }
    }
</script>

<style scoped>
#footer {
  font-family: "Impact";
  font-size: 15px;
  text-align: center;
  color: white;
  padding: 0;
  width: 70%;
  bottom: 0;
  margin-left: 15%;

}
</style>
