<template>
  <GridLayout v-model:layout="layout" :row-height="30">
    <template #item="{ item }">
      <span class="text">{{ `${item.i}${item.static ? '- Static' : ''}` }}</span>
    </template>
  </GridLayout>
</template>

<script setup lang="ts">
import { reactive, watch } from 'vue'

const layout = reactive([
  { x: 0, y: 0, w: 2, h: 2, i: '0', static: false },
  { x: 2, y: 0, w: 2, h: 4, i: '1', static: true },
  { x: 4, y: 0, w: 2, h: 5, i: '2', static: false },
  { x: 6, y: 0, w: 2, h: 3, i: '3', static: false },
  { x: 8, y: 0, w: 2, h: 3, i: '4', static: false },
  { x: 10, y: 0, w: 2, h: 3, i: '5', static: false },
  { x: 0, y: 5, w: 2, h: 5, i: '6', static: false },
  { x: 2, y: 5, w: 2, h: 5, i: '7', static: false },
  { x: 4, y: 5, w: 2, h: 5, i: '8', static: false },
  { x: 6, y: 3, w: 2, h: 4, i: '9', static: true },
  { x: 8, y: 4, w: 2, h: 4, i: '10', static: false },
  { x: 10, y: 4, w: 2, h: 4, i: '11', static: false },
  { x: 0, y: 10, w: 2, h: 5, i: '12', static: false },
  { x: 2, y: 10, w: 2, h: 5, i: '13', static: false },
  { x: 4, y: 8, w: 2, h: 4, i: '14', static: false },
  { x: 6, y: 8, w: 2, h: 4, i: '15', static: false },
  { x: 8, y: 10, w: 2, h: 5, i: '16', static: false },
  { x: 10, y: 4, w: 2, h: 2, i: '17', static: false },
  { x: 0, y: 9, w: 2, h: 3, i: '18', static: false },
  { x: 2, y: 6, w: 2, h: 2, i: '19', static: false },
])

watch(layout, () => {
  console.log(layout)
})
</script>

<!--<template>-->
<!--  <GridLayout-->
<!--    v-model:layout="layout"-->
<!--    :col-num="12"-->
<!--    :row-height="30"-->
<!--    is-draggable-->
<!--    is-resizable-->
<!--    vertical-compact-->
<!--    use-css-transforms-->
<!--  >-->
<!--    <GridItem-->
<!--      v-for="item in layout"-->
<!--      :key="item.i"-->
<!--      :x="item.x"-->
<!--      :y="item.y"-->
<!--      :w="item.w"-->
<!--      :h="item.h"-->
<!--      :i="item.i"-->
<!--      @resize="handleResize"-->
<!--    >-->
<!--      <component :is="item.i" />-->
<!--    </GridItem>-->
<!--  </GridLayout>-->
<!--</template>-->

<!--<script setup>-->
<!--import { ref } from 'vue'-->

<!--import WidgetNotice from '@/components/widgets/WidgetNotice.vue'-->

<!--const layout = ref([{ i: WidgetNotice, x: 0, y: 0, w: 1, h: 1 }])-->

<!--const handleResize = () => {}-->

<!--const getWidgetComponent = (id) => {-->
<!--  switch (id) {-->
<!--    case 'notice':-->
<!--      return WidgetNotice-->
<!--    default:-->
<!--      return null-->
<!--  }-->
<!--}-->

<!--const onLayoutChange = (newLayout) => {-->
<!--  // localStorage 또는 API로 사용자 설정 저장-->
<!--  localStorage.setItem('userLayout', JSON.stringify(newLayout))-->
<!--}-->
<!--</script>-->

<style>
.vgl-layout {
  --vgl-placeholder-bg: red;
  --vgl-placeholder-opacity: 20%;
  --vgl-placeholder-z-index: 2;

  --vgl-item-resizing-z-index: 3;
  --vgl-item-resizing-opacity: 60%;
  --vgl-item-dragging-z-index: 3;
  --vgl-item-dragging-opacity: 100%;

  --vgl-resizer-size: 10px;
  --vgl-resizer-border-color: #444;
  --vgl-resizer-border-width: 2px;
}
</style>
