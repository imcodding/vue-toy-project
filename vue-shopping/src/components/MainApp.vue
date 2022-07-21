<template>
  <div id="app">
    <shop-header v-on:sendData="getSearchKeyword"></shop-header><hr/>
    <shop-page></shop-page><hr/>
    <shop-content v-bind:searchKeyword="keyword"></shop-content>
    <router-link to="/shop/itemDetail"></router-link>
    <router-view></router-view>
    <shop-footer></shop-footer>
  </div>
</template>

<script>
import ShopHeader from './ShopHeader.vue';
import ShopPage from './ShopPage.vue';
import ShopContent from './ShopContent.vue';
import ShopFooter from './ShopFooter.vue';

export default {
    components: {
        'shop-header': ShopHeader,
        'shop-page': ShopPage,
        'shop-content': ShopContent,
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
span {
    margin: 10px;
    cursor: pointer;
}
.page {
    font-weight: bold;
    font-size: 16px;
}
</style>