<template>
  <div style="text-align:center; height:40px; line-height:40px">
    <router-link to="/about"><span class="page-span">ABOUT</span></router-link>
    <router-link to="/shop"><span class="page-span" style="border-bottom:2px solid #333">SHOP</span></router-link>
    <router-link to="/guide"><span class="page-span">GUIDE</span></router-link>
  </div>
</template>

<script>
export default {

}
</script>

<style>
.page-span {
    padding: 17px 5px 17px 5px;
    margin: 10px;
    cursor: pointer;
}
a {
  text-decoration: none;
  color: black
}
</style>