<template>
  <div>
    <div v-for="item in list" v-bind:key="item" class="content-list-item">
        <img width="200" height="200" src="../assets/logo.png">
        <ul style="list-style:none;padding-left:0">
            <li>폴로</li>
            <li>10,000</li>
        </ul>
    </div>
  </div>
</template>

<script>

export default {
    data: function() {
        return {
            list: ['1','2','3','4','5','6','7','8','9']
        }
    }
}
</script>

<style>

</style>