import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import JoinIndv from '../views/JoinIndv.vue'
import Login from '../views/Login.vue'
import Companies from '../views/Companies.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/individual',
    name: 'JoinIndv',
    component: JoinIndv
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/companies',
    name: 'Companies',
    component: Companies
  }
]

const router = new VueRouter({
  routes
})

export default router
