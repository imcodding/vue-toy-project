<template>
  <div id="content">
    <div id="category" style="text-align:center; margin-bottom:20px">
        <h2 style="margin:40px">SHOP</h2>
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
    props: ['searchKeyword'],
    beforeMount() {
        this.getItemList();
    },
    data: function() {
        return {
            items: [],
            itemKind: '',
        }
    },
    watch: {
        itemKind : function() {
            this.getItemList();
        },
        searchKeyword: function() {
            this.getItemList();
        }
    },
    methods: {
        getItemList: function() {
            var content = this;
            var data = {
                kind: this.itemKind,
                keyword: this.searchKeyword
            }
            axios.get('/api/v1/getItemList', {params: data}) 
            .then(function(response) {
                content.items = response.data;
            })
            .catch(function(error) {
                console.log(error)
                content.items = [{name:'AAA',price:'10000',image:''}, {name:'BBB',price:'20000',image:''}]
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