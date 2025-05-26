import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import {GridLayout, GridItem} from 'grid-layout-plus'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app
  .component('GridLayout', GridLayout)
  .component('GridItem', GridItem)

app.mount('#app')
