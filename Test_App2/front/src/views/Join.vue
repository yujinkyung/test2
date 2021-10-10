<template>
    <div class="join">
    <b-card>
        <b-row align-h="center" style="padding:30px;">
            <b-col>
                <b-button variant="light" href="/">Matching Platform</b-button>
            </b-col>
        </b-row>
        
        <b-row align-h="center" style="padding:10px;">
            <b-col>
                <b-button size="lg" variant="primary" href="/#/individual">일반회원가입</b-button>
            </b-col>
        </b-row>
        
        <b-row align-h="center" style="padding:10px;">
            <b-col>
                <b-button size="lg" variant="primary" href="/">기업회원가입</b-button>  
            </b-col>
        </b-row>
    </b-card>
  </div>
</template>

<script>
export default {
};
</script>

<style>
.join{
  position:absolute;
  top:50%;
  left:50%;
  width: 600px;
  margin:-150px 0 0 -300px;
}
</style>