<template>
  <div id="app">
    <!-- navbar(헤더) -->
    <div id="nav">
      <b-navbar type="dark" variant="primary">
        <b-navbar-brand href="/">Matching Monster</b-navbar-brand>
        <b-collapse id="nav-collapse" is-nav>
          <b-navbar-nav>
            <b-nav-item href="/#/companies">Companies</b-nav-item>
            <b-nav-item href="/#/job-posting">JopPosting</b-nav-item>
            <b-nav-item href="/#/login">Login</b-nav-item>
            <b-nav-item href="/#/join">Join</b-nav-item>
          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>
    <div>
      <router-view/>
    </div>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
/*
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
} */
</style>
