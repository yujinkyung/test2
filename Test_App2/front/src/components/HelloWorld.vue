<template>
  <div class="hello">
    <!-- 게시판 table -->
    <!-- 검색기능 -->
    <div>
      <input type="search" placeholder="기업명/HR담당자/업종/규모" v-model="search" @input="sortedUser"/>
      
    </div>
    <!-- table 출력 -->
    <div>
      <table border="1" width="100%" height="300" align="center">
        <!-- 헤더정보 -->
        <thead>
          <th>No.</th>
          <th>기업명</th>
          <th>HR담당</th>
          <th>E-mail</th>
          <th>업종</th>
          <th>규모</th>
        </thead>
        <!-- table body -->
        <tbody>
          <tr v-for="user in users" :key="user.co_no">
            <td>{{user.co_no}}</td>
            <td>{{user.company}}</td>
            <td>{{user.hr}}</td>
            <td>{{user.co_EMAIL}}</td>
            <td>{{user.categoryID}}</td>
            <td>{{user.sizeID}}</td>
          </tr>
        </tbody>
        
      </table>
    </div>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: 'HelloWorld',
  data(){
    return{
      users:[],
      listUser:[],
      searchedUser:[],
      search:""
    }
  },
  methods:{
    retrieveUsers(){
      http
        .get("/list")
        .then(response=>{
          this.users = response.data;
          console.log(response.data);
        })
        .catch(e=>{
          console.log(e);
        })
    },
    sortedUser(){
      // if(this.search){
      //   this.searchedUser = this.users.filter(
      //     (user) => {
      //       return user.subject.toLowerCase().includes(this.search.toLowerCase());
      //     });
      //   return this.listUser = this.searchedUser;
      // }else{
      //   return this.listUser = this.users;
      // }
    }
  },
  mounted(){
    this.retrieveUsers();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>