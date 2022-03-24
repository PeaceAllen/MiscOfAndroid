<script setup>
import { ref } from 'vue'

defineProps({
  msg: String
})

const count = ref(10)
</script>

<template>
  <h1>{{ msg }}</h1>
  <h1>{{ count }}</h1>
</template>

<style scoped>

</style>
