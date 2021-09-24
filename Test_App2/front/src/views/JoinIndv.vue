<template>
  <div class="join-indv">
    <b-form @submit="onSubmit">
      <b-form-group
      label="Name" label-for="input-name">
        <b-form-input
        id="input-name" type="text" v-model="form.name"
        placeholder="Enter Name" required></b-form-input>
      </b-form-group>

      <b-form-group
      label="Gender" label-for="btn-radio-gender">
        <b-form-radio-group
        id="btn-radio-gender" :options="genderOptions" v-model="form.gender"
        button-variant="outline-primary" name="radio-btn-outline" buttons></b-form-radio-group>
      </b-form-group>

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

      <b-form-group
      label="E-mail" label-for="input-email">
        <b-form-input
        id="input-email" type="email" v-model="form.email"
        placeholder="Enter E-mail" required></b-form-input>
      </b-form-group>

      <b-form-group
      label="Contact" label-for="input-contact">
        <b-form-input
        id="input-contact" type="text" v-model="form.contact"
        placeholder="Enter Contact Information" required></b-form-input>
      </b-form-group>

      <b-form-group
      label="D.O.B" label-for="datepicker-dob">
        <b-form-datepicker id="datepicker-dob" v-model="form.dob" close-button></b-form-datepicker>
      </b-form-group>

      <b-form-group label="Academic Career">
        <b-form-group>
          <b-form-select v-model="acca.degree" :options="degreeOptions"></b-form-select>
        </b-form-group>
        <b-form-group>
          <b-form-input
          id="input-school" type="text" v-model="acca.school"
          placeholder="Enter School Name"></b-form-input>
        </b-form-group>
        <b-form-group>
          <b-form-input
          id="input-dept" type="text" v-model="acca.dept"
          placeholder="Enter Department"></b-form-input>
        </b-form-group>
      </b-form-group>

      <b-form-group label="Career">
        <b-form-group>
          <b-form-input
          id="input-company" type="text" v-model="career.company"
          placeholder="Enter Company Name"></b-form-input>
        </b-form-group>
        <b-form-group>
          <b-form-input
          id="input-dept" type="text" v-model="career.dept"
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
  export default {
    name: 'Join-indv',
    data() {
      return{
        form:{
          name:'', gender:'m',
          id:'', pw:'',
          email:'', contact:'', dob:''
        },
        acca: {
          degree:'', school:'', dept:''
        },
        career: {
          comapny:'', dept:'', duty:''
        },
        genderOptions: [
          { text: '남', value: 'm' },
          { text: '여', value: 'f' }
        ],
        degreeOptions: [
          { text: '대학원', value: 'graduate' },
          { text: '대학교', value: 'university' }
        ]
      }
    },
    methods: {
      onSubmit(event) {
        event.preventDefault()
        alert(JSON.stringify(this.form))
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