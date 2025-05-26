<template>
  <div class="bg-white shadow rounded-xl p-4">
    <h2 class="text-lg font-semibold mb-2">공지사항</h2>
    <ul>
      <li v-for="notice in notices" :key="notice.id">
        {{ notice.title }}
      </li>
    </ul>
  </div>
</template>

<script setup>
const notices = [
  { id: 1, title: '5월 휴무일 안내' },
  { id: 2, title: '사내 시스템 점검 예정' },
]
</script>