import Vue from 'vue';
import VueRouter from 'vue-router'
import ShopItemDetail from '../components/ShopItemDetail.vue'

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path:'/shop/itemDatail',
            component: ShopItemDetail
            // component: () => import('../components/ShopItemDetail.vue')
        }
    ]

});