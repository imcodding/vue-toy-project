<template>
  <div id="app">
    <shop-header />
    <shop-page />
    <shop-category />
    <shop-content />
    <shop-footer />
  </div>
</template>

<script>
import ShopHeader from './ShopHeader.vue';
import ShopPage from './ShopPage.vue';
import ShopCategory from './ShopCategory.vue';
import ShopContent from './ShopContent.vue';
import ShopFooter from './ShopFooter.vue';

export default {
    components: {
        'shop-header': ShopHeader,
        'shop-page': ShopPage,
        'shop-category': ShopCategory,
        'shop-content': ShopContent,
        'shop-footer': ShopFooter
    }
}
</script>

<style>
span {
  margin: 10px;
  cursor: pointer;
}
.content-list-item {
  float:left; 
  margin:5px; 
  background:#eeeeee;
}
</style>