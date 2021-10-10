import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Join from '../views/Join.vue'
import JoinIndv from '../views/JoinIndv.vue'
import JoinComp from '../views/JoinComp.vue'
import Login from '../views/Login.vue'
import Companies from '../views/Companies.vue'
import JobPosting from '../views/JobPosting.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/join',
    name: 'Join',
    component: Join
  },
  {
    path: '/individual',
    name: 'JoinIndv',
    component: JoinIndv
  },
  {
    path: '/company',
    name: 'JoinComp',
    component: JoinComp
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
  },
  {
    path: '/job-posting',
    name: 'JobPosting',
    component: JobPosting
  }
]

const router = new VueRouter({
  routes
})

export default router
