import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/dashboards',
      component: () => import('../components/DashboardView.vue'),
    },
    {
      path: '/dashboards',
      component: () => import('../components/DashboardView.vue'),
    },
  ],
})

export default router;
