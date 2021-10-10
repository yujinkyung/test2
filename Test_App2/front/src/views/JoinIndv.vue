<template>
  <div class="join-indv">
    <b-form @submit="joinIndvUser">
      
      <!-- 이름 -->
      <b-form-group
      label="Name" label-for="input-name">
        <b-form-input
        id="input-name" type="text" v-model="form.name"
        placeholder="Enter Name" required></b-form-input>
      </b-form-group>

      <!-- 성별 -->
      <b-form-group
      label="Gender" label-for="btn-radio-gender">
        <b-form-radio-group
        id="btn-radio-gender" :options="genderOptions" v-model="form.gender"
        button-variant="outline-primary" name="radio-btn-outline" buttons></b-form-radio-group>
      </b-form-group>
      
      <!-- id / pw -->
      <b-form-group
      label="ID" label-for="input-ID">
        <b-form-input
        id="input-ID" type="text" v-model="form.id"
        placeholder="Enter ID" required></b-form-input>
      </b-form-group>

      <b-form-group
      label="PW" label-for="input-PW">
        <b-form-input
        id="input-PW" type="password" v-model="form.pw"
        placeholder="Enter Password" required></b-form-input>
      </b-form-group>

      <!-- email -->
      <b-form-group
      label="E-mail" label-for="input-email">
        <b-form-input
        id="input-email" type="email" v-model="form.email"
        placeholder="Enter E-mail" required></b-form-input>
      </b-form-group>

      <!-- 연락처 -->
      <b-form-group
      label="Contact" label-for="input-contact">
        <b-form-input
        id="input-contact" type="text" v-model="form.contact"
        placeholder="Enter Contact Information" required></b-form-input>
      </b-form-group>

      <!-- 출생년월일 -->
      <b-form-group
      label="D.O.B" label-for="datepicker-dob">
        <b-form-datepicker id="datepicker-dob" v-model="form.dob" close-button></b-form-datepicker>
      </b-form-group>

      <!-- 학력 -->
      <b-form-group label="Academic Career">
        <b-button variant="primary" @click="addAcademic"> + </b-button>
        <div v-for="acirow in academicRows" :key="acirow">
          <b-form-group>
            <b-form-select v-model="acirow.degree" :options="degreeOptions"></b-form-select>
          </b-form-group>
          <b-form-group>
            <b-form-input
            id="input-school" type="text" v-model="acirow.school"
            placeholder="Enter School Name"></b-form-input>
          </b-form-group>
          <b-form-group>
            <b-form-input
              id="input-academic-dept" type="text" v-model="acirow.dept"
              placeholder="Enter Department"></b-form-input>
          </b-form-group>
          <b-form-group>
            <b-form-input
            id="input-academic-ay" type="text" v-model="acirow.ay"
            placeholder="Enter Admission Year"></b-form-input>
          </b-form-group>
          <b-form-group>
            <b-form-input
              id="input-academic-gy" type="text" v-model="acirow.gy"
              placeholder="Enter Graduation Year"></b-form-input>
          </b-form-group>
          <b-button variant="danger" @click="removeAcademic"> - </b-button>
        </div>
        
      </b-form-group>

      <!-- 경력 -->
      <b-form-group label="Career">
        <b-form-group>
          <b-form-input
          id="input-company" type="text" v-model="career.company"
          placeholder="Enter Company Name"></b-form-input>
        </b-form-group>
        <b-form-group>
          <b-form-input
          id="input-career-dept" type="text" v-model="career.dept"
          placeholder="Enter Department"></b-form-input>
        </b-form-group>
        <b-form-group>
          <b-form-input
          id="input-duty" type="text" v-model="career.duty"
          placeholder="Enter Duty"></b-form-input>
        </b-form-group>
      </b-form-group>

      <b-button type="submit" variant="primary">완료</b-button>
    </b-form>
  </div>
</template>

<script>
import http from "../http-common";

const academicList = [];

  export default {
    name: 'Join-indv',
    data() {
      return{
        form:{
          name:'', gender: 0,
          id:'', pw:'',
          email:'', contact:'', dob:'', age : 0
        },
        academicRows: [
          { degree:'', school:'', dept:'', ay: null , gy: null }
        ],
        career: [
          { company:'', dept:'', duty:'' }
        ],
        genderOptions: [
          { text: '남', value: 0 },
          { text: '여', value: 1 }
        ],
        degreeOptions: [
          { text: '대학원', value: 'graduate' },
          { text: '대학교', value: 'university' }
        ]
      }
    },
    methods: {
      joinIndvUser(){
        http
          .post("/success-join", {
            p_ID : this.form.id , p_PW : this.form.pw ,
            name : this.form.name , p_EMAIL : this.form.email ,
            phone : this.form.contact ,birth_DATE : this.form.dob ,
            age: this.form.age , gender: this.form.gender
          })
          .then(response=>{
            console.log(response.data);
            this.joinCareerInfo();
            this.joinAcdemicCareerInfo();
          })
          .catch(e=>{
            console.log(e);
          })
      },
      joinAcdemicCareerInfo(){
        this.matchAcademic();
        http
          .post("/success-join-aci", academicList)
          .then(response=>{
            console.log(response.data);
            alert(academicList);
          })
          .catch(e=>{
            console.log(e);
          })
      },
      joinCareerInfo(){
        http
          .post("/success-join-ci", {
            p_ID : this.form.id , p_COMPANY : this.career.company,
            p_DEPARTMENT : this.career.dept, p_DUTY : this.career.duty
          })
          .then(response=>{
            console.log(response.data);
          })
          .catch(e=>{
            console.log(e);
          })
      },
      addAcademic: function(){
        this.academicRows.push({
          degree:'', school:'', dept:'', ay: null , gy: null
        })
      },
      removeAcademic: function(row){
        this.academicRows.splice(this.academicRows.indexOf(row),1);
      },
      addCareer(){

      },
      removeCareer(){

      },
      matchAcademic(){
        for(var i=0;i<this.academicRows.length;i++){
          academicList[i] = {p_ID : this.form.id , degree : this.academicRows[i].degree,
            school_NAME : this.academicRows[i].school, major : this.academicRows[i].dept,
            admission_YEAR : this.academicRows[i].ay, graduation_YEAR : this.academicRows[i].gy}
        }
      },
      matchCareer(){

      }
    }
  }
</script>

<style scoped>
.join-indv{
  padding: 30px;
  margin: 0 auto;
  width: 300px; 
}
</style>