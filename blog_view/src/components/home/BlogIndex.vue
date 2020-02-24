<template>
  <div>
    <blog-navbar></blog-navbar>
    <div class="menuZone" style="width: 70%;margin:0 auto">
      <Row :gutter="16">
        <Col span="12" id="menu1">
          <img class="img_div" src="../../assets/liweier.jpeg" style="max-width: 100%;max-height: 100%;box-shadow: 2px 2px 5px rebeccapurple;"/>
          <div class="mask1" v-on:click="gotoAnimation">
            <p class="maskP1">Animation</p>
          </div>
        </Col>
        <Col span="12">
          <Row :gutter="16">
            <Col span="12">
              <div style="width: 100%" id="menu2">
                <img class="img_div" src="../../assets/luffy.jpeg" style="max-width: 100%;max-height: 100%;box-shadow: 2px 2px 5px rebeccapurple;"/>
                <div class="mask2">
                  <p class="maskP2">Daily</p>
                </div>
              </div>
            </Col>
            <Col span="12">
              <div style="width: 100%" id="menu3">
                <img class="img_div" src="../../assets/meiqin.jpeg" style="max-width: 100%;max-height: 100%;box-shadow: 2px 2px 5px rebeccapurple;"/>
                <div class="mask3">
                  <p class="maskP3">Home</p>
                </div>
              </div>
            </Col>
            <Col span="24">
              <div style="width: 100%" id="menu4">
                <img class="img_div" src="../../assets/miku.jpeg" style="width: 100%;height: 100%;box-shadow: 2px 2px 5px rebeccapurple;"/>
                <div class="mask4">
                  <p class="maskP4">Lolita</p>
                </div>
              </div>
            </Col>
          </Row>
        </Col>
      </Row>

      <div>

      </div>
      <div>

      </div>
    </div>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
    import blogHeader from '@/components/common/BlogHeader'
    import blogFooter from '@/components/common/BlogFooter'
    import blogNavbar from '@/components/common/BlogNavbar'

    export default {
        name: 'BlogIndex',
        // blogHeader/blogFooter组件给申明到components里面然后在template里面使用
        components: { blogHeader, blogFooter, blogNavbar},
        data () {
            return {
            }
        },
        methods:{
            gotoLogin(){
                this.$router.replace('/login')
            },
            gotoAnimation(){
                this.$router.replace('/animation')
            }
        },
        activated(){
            window.reload()//跳转到该页面后需要进行的操作
        },
    }

    $(function () {
        var w1 = $("#menu1").width();
        var w2 = $("#menu2").width();
        var w4 = $("#menu4").width();
        var m1 = parseInt($(".menuZone").css("margin-left"));
        $("#menu1").css("height",w1);
        $("#menu2").css("height",w2);
        $("#menu3").css("height",w2);
        $("#menu4").css("height",w1 - w2 - 16);
        $(".mask1").css("width",w1);
        $(".mask1").css("height",w1);
        $(".maskP1").css("margin-top",w1 * 0.5 - 30);
        $(".mask2").css("width",w2);
        $(".mask2").css("height",w2);
        $(".maskP2").css("margin-top",w2 * 0.5 - 30);
        $(".mask3").css("width",w2);
        $(".mask3").css("height",w2);
        $(".maskP3").css("margin-top",w2 * 0.5 - 30);
        $(".mask4").css("width",w4);
        $(".mask4").css("height",w1 - w2 - 16);
        $(".maskP4").css("margin-top",(w1 - w2 - 30) * 0.5 - 30);
        $(window).bind('resize',function() {
            var w1 = $("#menu1").width();
            var w2 = $("#menu2").width();
            var w3 = $("#menu3").width();
            var w4 = $("#menu4").width();
            $("#menu1").css("height",w1);
            $("#menu2").css("height",w2);
            $("#menu3").css("height",w2);
            $("#menu4").css("height",w1 - w2 - 16);
            $(".mask1").css("width",w1);
            $(".mask1").css("height",w1);
            $(".maskP1").css("margin-top",w1 * 0.5 - 30);
            $(".mask2").css("width",w2);
            $(".mask2").css("height",w2);
            $(".maskP2").css("margin-top",w2 * 0.5 - 30);
            $(".mask3").css("width",w2);
            $(".mask3").css("height",w2);
            $(".maskP3").css("margin-top",w2 * 0.5 - 30);
            $(".mask4").css("width",w4);
            $(".mask4").css("height",w1 - w2 - 16);
            $(".maskP4").css("margin-top",(w1 - w2 - 30) * 0.5 - 30);
        })
        $("#menu1").mouseover(function () {
            $(".mask1").show();
        })
        $("#menu1").mouseout(function () {
            $(".mask1").hide();
        })
        $("#menu2").mouseover(function () {
            $(".mask2").show();
        })
        $("#menu2").mouseout(function () {
            $(".mask2").hide();
        })
        $("#menu3").mouseover(function () {
            $(".mask3").show();
        })
        $("#menu3").mouseout(function () {
            $(".mask3").hide();
        })
        $("#menu4").mouseover(function () {
            $(".mask4").show();
        })
        $("#menu4").mouseout(function () {
            $(".mask4").hide();
        })
    })
</script>

<style>
#loginBtn {
  background-color: white;
  border-color: rebeccapurple;
}
#searchBtn {
}
#menu1 {
  position: relative;
}
#menu2 {
  position: relative;
}
#menu3 {
  position: relative;
}
#menu4 {
  margin-top: 16px;
  position: relative;
}
.form-control:focus {
  box-shadow: none;
  border-color: mediumpurple;
}

.mask1 {
  position: absolute;
  top: 0;
  background: rgba(101, 101, 101, 0.6);
  color: #ffffff;
  display: none;
}
.mask2 {
  position: absolute;
  top: 0;
  left: 0;
  background: rgba(69, 28, 36, 0.6);
  color: #ffffff;
  display: none;
}
.mask3 {
  position: absolute;
  top: 0;
  left: 0;
  background: rgba(249, 194, 157, 0.6);
  color: #ffffff;
  display: none;
}
.mask4 {
  position: absolute;
  top: 0;
  left: 0;
  background: rgba(245, 178, 211, 0.6);
  color: #ffffff;
  display: none;
}
.maskP1 {
  font-size: 30px;
  font-family: Impact;
}
.maskP2 {
   font-size: 30px;
   font-family: Impact;
 }
.maskP3 {
  font-size: 30px;
  font-family: Impact;
}
.maskP4 {
  font-size: 30px;
  font-family: Impact;
}
</style>
