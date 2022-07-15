<template>
  <div id="content">
    <div id="category" style="text-align:center; margin-bottom:20px">
        <h2 v-on:click="changeKind" style="cursor:pointer">Shop</h2>
        <span id='TOP' v-on:click="changeKind">top</span>
        <span id="OUTER" v-on:click="changeKind">outer</span>
        <span id="BOTTOM" v-on:click="changeKind">bottom</span>
        <span id="SHOES" v-on:click="changeKind">shoes</span>
        <span id="BAG" v-on:click="changeKind">bag</span>
    </div>
    <div v-for="item in items" v-bind:key="item.itemNo" style="float:left; margin:5px;cursor:pointer">
        <img width="200" height="200" v-bind:src="item.image">
        <ul style="list-style:none;padding-left:0">
            <li>{{item.name}}</li>
            <li style="font-weight:bold">{{numberWithCommas(item.price)}}</li>
        </ul>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
export default {
    el: '#content',
    props: ['propsdata'],
    beforeMount() {
        this.getItemList();
    },
    data: function() {
        return {
            items: [],
            itemKind: '',
            keyword: this.propsdata
        }
    },
    watch: {
        itemKind : function() {
            this.getItemList();
        }
    },
    methods: {
        getItemList: function() {
            var content = this;
            var data = {
                kind: this.itemKind,
                keyword: this.keyword
            }
            console.log('props', this.props)
            axios.get('/api/v1/getItemList', {params: data}) 
            .then(function(response) {
                content.items = response.data;
            })
            .catch(function(error) {
                console.log(error)
            })
        },
        changeKind: function(event) {
            this.itemKind = event.currentTarget.id
        },
        numberWithCommas: function(x) {
            return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + '원';
        },
    }
}
</script>

<style>

</style>