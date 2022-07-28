<template>
  <div>
      <h3>HOME > SHOP</h3>
      <div>
          <div style="width:50%; float:left">
              <img v-bind:src="item.image" style="width:98%;height:500px"/>
          </div>
          <div style="width:45%; float:right; padding:12px">
            <span style="display:block;font-size:20px">{{item.brandEn}}({{item.brandKr}}) {{item.name}}</span>
            <span style="display:block;font-size:16px">{{numberWithCommas(item.price)}}</span>
            <hr />
            <div>
                <ul style="list-style:none;padding-left:0">
                    <li>
                        <span class="title">원산지</span>
                        <span>made in en</span>
                    </li>
                    <li>
                        <span class="title">구매혜택</span>
                        <span>840 Point 적립예정</span>
                    </li>
                    <li>
                        <span class="title">배송 방법</span>
                        <span>택배</span>
                    </li>
                    <li>
                        <span class="title">배송비</span>
                        <span>2,500원</span>
                    </li>
                </ul>
            </div>
            <div style="background:#F8F8F8; height:100px; padding:15px">
                <span style="display:inline-block;padding:5px 0 10px 5px">수량</span>
                <hr />
                <div style="padding:10px 0 10px 0">
                    <span style="border:1px solid #b4b4b4; width:92px;background:white;display:inline-block;">
                        <span style="display:inline-block; width:20px;height:20px;padding:5px;text-align:center; border-right:1px solid #b4b4b4">-</span>
                        <span style="display:inline-block; width:20px;height:20px;padding:5px;text-align:center">1</span>
                        <span style="display:inline-block; width:20px;height:20px;padding:5px;text-align:center;border-left:1px solid #b4b4b4">+</span>
                    </span>
                    <span style="float:right; line-height:35px"></span>
                </div>
            </div>
            <div style="padding:40px 10px 40px 10px">
                <span>총 상품금액(1개)</span>
                <span style="font-size:20px; float:right">7,000원</span>
            </div>
            <div>
                <button class="button-detail" style="background:#333;color:white">구매하기</button>
                <button class="button-detail">장바구니</button>
                <button class="button-detail">좋아요</button>
            </div>
          </div>
      </div>
  </div>
</template>

<script>
import axios from 'axios';
export default {
    
    created() {
        
        var detail = this;
        var itemNo = this.$route.params.id;//content router 경로에서 받은 파라미터

        axios.get('/api/v1/getItemList/' + itemNo) 
        .then(function(response) {
            detail.item = response.data;
        })
        .catch(function(error) {
            console.log('error', error)
        })
    },

    data: function() {
        return {
            item: ''
        }
    },

    methods: {
        numberWithCommas: function(x) {
            if(x !== undefined) return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + '원';
        }
    }

}
</script>

<style>
.title {
    font-weight: bold;
    margin-right: 10px;
}
li {
    font-size: 13px
}
.button-detail {
    width: 32%;
    height: 50px;
    border: 1px solid #eeeeee;
    background: white;
    margin-right: 8px;
}
</style>