<template>
  <div class="login">
    <b-card title="로그인">
      <!-- ID -->  
      <b-form-group label="ID" label-for="input-id">
        <b-form-input
          id="input-id"
          type="text"
          v-model="form.id"
          placeholder="Enter ID"
          required
        ></b-form-input>
      </b-form-group>

      <!-- 비밀번호 -->
      <b-form-group label="pw" label-for="input-pw">
        <b-form-input
          id="input-pw"
          type="password"
          v-model="form.pw"
          placeholder="Enter Password"
          required
        ></b-form-input>
      </b-form-group>

      <b-button variant="primary"> 로그인 </b-button>
    </b-card>

    <b-button variant="link" href="/#/join">회원가입</b-button>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      form: {
        id: "",
        pw: "",
      },
    };
  },
};
</script>

<style>
.login {
  position: absolute;
  top: 380px;
  left: 50%;
  width: 400px;
  margin: -150px 0 0 -200px;
}
</style>
