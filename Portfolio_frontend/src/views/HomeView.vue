<template>
  <div class="home">
    <h1>포트폴리오 홈</h1>
    <p>Vue 3로 만든 포트폴리오 웹사이트입니다.</p>
    
    <div class="counter-section">
      <h2>카운터 예제</h2>
      <p>현재 카운트: {{ count }}</p>
      <button @click="increment" class="btn">증가</button>
      <button @click="decrement" class="btn">감소</button>
      <button @click="reset" class="btn">리셋</button>
    </div>
  </div>
</template>

<script>
import { ref } from 'vue'

export default {
  name: 'HomeView',
  setup() {
    const count = ref(0)
    
    const increment = () => {
      count.value++
    }
    
    const decrement = () => {
      count.value--
    }
    
    const reset = () => {
      count.value = 0
    }
    
    return {
      count,
      increment,
      decrement,
      reset
    }
  }
}
</script>

<style scoped>
.home {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

.counter-section {
  margin-top: 30px;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  background-color: #f9f9f9;
}

.btn {
  margin: 0 5px;
  padding: 8px 16px;
  background-color: #42b983;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 14px;
}

.btn:hover {
  background-color: #369870;
}
</style>
