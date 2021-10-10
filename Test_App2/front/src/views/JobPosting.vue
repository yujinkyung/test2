<template>
  <div class="jobposting">
    <!-- 기존 게시판 코드 -->
    <div>
       <b-container fluid>
         <!-- 게시판 헤더 -->
         <b-row>
           <!-- 게시판 제목 -->
           <b-col lg="9">
             <h2 align="left">채용 공고</h2>
           </b-col>
           <!-- 검색창 -->
           <b-col lg="3">
             <b-input-group size="sm">
               <b-form-input
                id="filter-input"
                v-model="filter"
                type="search"
                placeholder="기업명/HR담당자/업종/규모"></b-form-input>
             </b-input-group>
           </b-col>
          </b-row>
         <!-- 고객사 목록 table -->
          <b-row>
             <b-table hover :items="users" :filter="filter" :fields="fields"></b-table>
          </b-row>
       </b-container>
    </div>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: 'Companies',
  data(){
    return{
      users:[],
      fields:[
        {key:'co_no', label:'No.'},
        {key:'company', label:'기업명'},
        {key:'categoryID', label:'분야'},
        {key:'sizeID', label:'기업규모'},
        {key:'hr', label:'HR담당자'},
        {key:'co_EMAIL', label:'E-mail'}
      ],
      filter: ''
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
  },
  mounted(){
    this.retrieveUsers();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.hello{
  padding: 30px
}
</style>