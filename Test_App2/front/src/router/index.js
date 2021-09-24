import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import JoinIndv from '../views/JoinIndv.vue'

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
  }
]

const router = new VueRouter({
  routes
})

export default router
