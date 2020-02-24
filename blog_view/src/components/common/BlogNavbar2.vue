<template>
    <Col span="4" style="padding: 0;">
      <Menu theme="light" width="auto" style="text-align: left">
        <Submenu name="1">
          <template slot="title" class="menu-list">
            <Icon type="ios-planet"></Icon>
            Animation
          </template>
          <MenuItem name="1-1">Option 1</MenuItem>
          <MenuItem name="1-2">Option 2</MenuItem>
          <MenuItem name="1-3">Option 3</MenuItem>
        </Submenu>
        <Submenu name="2">
          <template slot="title" class="menu-list">
            <Icon type="ios-images"></Icon>
            Daily
          </template>
          <MenuItem name="2-1">Option 1</MenuItem>
          <MenuItem name="2-2">Option 2</MenuItem>
        </Submenu>
        <Submenu name="3">
          <template slot="title">
            <Icon type="ios-home"></Icon>
            Home
          </template>
          <MenuItem name="3-1">Option 1</MenuItem>
          <MenuItem name="3-2">Option 2</MenuItem>
        </Submenu>
        <Submenu name="4">
          <template slot="title">
            <Icon type="ios-bowtie" />
            Lolita
          </template>
          <MenuItem name="4-1">Option 1</MenuItem>
          <MenuItem name="4-2">Option 2</MenuItem>
        </Submenu>
      </Menu>
    </Col>
</template>

<script>
  export default {
      name: 'BlogNavbar'
  }

</script>

<style>
  #navbar2{
    margin: 0 auto;
    margin-top: 0px;
  }
  .nav2{
    text-align: left;
    margin-top: 10px;
  }
  .menu-list{
    border-radius: 0px;
    list-style: none;
    background-color: white;
    color: rebeccapurple;
  }
  >>>.ivu-menu-submenu:hover{
    color: mediumpurple;
  }

  >>>.ivu-menu-submenu-title:hover{
    color: mediumpurple;
  }

</style>
