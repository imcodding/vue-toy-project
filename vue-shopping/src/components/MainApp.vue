<template>
  <div>
    <shop-header v-on:sendData="getSearchKeyword"></shop-header>
    <shop-page></shop-page>
    <shop-content v-bind:propsdata="keyword"></shop-content>
    <shop-footer></shop-footer>
  </div>
</template>

<script>
import ShopHeader from './ShopHeader.vue';
import ShopPage from './ShopPage.vue';
import ShopContent from './ShopContent.vue';
import ShopFooter from './ShopFooter.vue';

export default {
    // el: '#app',
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
</style>