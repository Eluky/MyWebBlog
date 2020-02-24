<template>
  <div>
    <blog-navbar></blog-navbar>
    <Row style="width: 70%;margin: 0 auto;margin-top: 30px">
      <blog-navbar2></blog-navbar2>
      <Col span="20" style="height: 600px">
        <div class="" style="height: 600px;width: 100%;margin-left: 15px;background-color: white">

        </div>
      </Col>
    </Row>
    <blog-footer></blog-footer>
  </div>
</template>

<script>
    import blogNavbar2 from '@/components/common/BlogNavbar2'
    import blogFooter from '@/components/common/BlogFooter'
    import blogNavbar from '@/components/common/BlogNavbar'
    export default {
        name: 'BlogAnimation',
        components: {blogNavbar, blogFooter, blogNavbar2}
    }
</script>
