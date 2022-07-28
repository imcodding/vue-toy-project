<template>
  <div id="app">
    <shop-header v-on:sendData="getSearchKeyword"></shop-header><hr/>
    <shop-page></shop-page><hr/>
    <router-view v-bind:searchKeyword="keyword"></router-view>
    <shop-footer></shop-footer>
  </div>
</template>

<script>
import ShopHeader from './ShopHeader.vue';
import ShopPage from './ShopPage.vue';
import ShopFooter from './ShopFooter.vue';

export default {
    components: {
        'shop-header': ShopHeader,
        'shop-page': ShopPage,
        'shop-footer': ShopFooter
    },
    
    data: function() {
        return {
            items: [],
            keyword: ''
        }
    },
    methods: {
        getSearchKeyword: function(data) {
            this.keyword = data;
        }
    }
}
</script>

<style>
.page {
    font-weight: bold;
    font-size: 16px;
}
</style>