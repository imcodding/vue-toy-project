import Vue from 'vue'
// import MainApp from '../src/components/ShopItemDetail.vue'
import MainApp from '../src/components/MainApp.vue'
import router from './router/index.js'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(MainApp),
}).$mount('#app')
