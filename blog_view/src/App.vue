<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
  *{margin: 0; padding: 0;}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  background-size: 100% 100%;
  background-color: mediumpurple;
  overflow: auto;
  position: absolute;
  height: 100%;
  width: 100%;
  text-align: center;
}
</style>
