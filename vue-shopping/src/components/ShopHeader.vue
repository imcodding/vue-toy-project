<template>
  <div id="header" style="height:60px">
    <div style="text-align:center">LOGO</div>
    <div style="float:right">
      <input id="searchBox" type="text" placeholder="search keyword" 
      v-model="keyword" 
      v-on:keyup.enter="search">
      <button v-on:click="search">검색</button>
    </div>
  </div>
</template>

<script>
export default {
  data: function() {
    return {
      keyword: ''
    }
  },
  methods: {
    search: function() {
      this.$emit('sendData', this.keyword)
    }
  }
}
</script>

<style>

</style>