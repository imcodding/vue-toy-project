import Vue from 'vue';
import VueRouter from 'vue-router'
// import ShopItemDetail from '../components/ShopItemDetail.vue'

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path:'/',
            redirect: '/about'
        },
        {
            path:'/about',
            component: () => import('../components/ShopAbout.vue')
        },
        {
            path:'/shop',
            component: () => import('../components/ShopContent.vue')
        },
        {
            path:'/guide',
            component: () => import('../components/ShopGuide.vue')
        },
        {
            path:'/shop/:id',
            component: () => import('../components/ShopItemDetail.vue')
        },
    ]

});