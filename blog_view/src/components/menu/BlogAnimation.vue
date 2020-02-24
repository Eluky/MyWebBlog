<template>
  <div>
    <blog-navbar></blog-navbar>
    <div style="width: 70%;margin: 0 auto;margin-top: 30px;">
      <div style="width: 100%;position: relative">
        <img class="head-img" src="../../assets/onepiece.jpeg" style="max-width: 100%;max-height: 100%;border-radius: 10px;" />
        <div class="a-mask">
          <p class="maskP">Animation world!</p>
        </div>
      </div>
    </div>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
    import blogFooter from '@/components/common/BlogFooter'
    import blogNavbar from '@/components/common/BlogNavbar'
  export default {
      name: 'BlogAnimation',
      components: {blogNavbar, blogFooter},
  }
    $(function(){
        var h1 = $(".a-mask").height() * 0.5;
        $(".a-mask").css("line-height",h1)
    })
</script>

<style>
  .a-mask{
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    background: rgba(0, 0, 0, 0.4);
    color: #ffffff;
    line-height: 100px;
    font-family: Impact;
    font-size: 50px;
    border-radius: 10px;
  }
</style>
