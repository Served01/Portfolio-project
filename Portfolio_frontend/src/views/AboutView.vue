<template>
  <div class="about">
    <h1>소개</h1>
    <p>이 프로젝트는 Vue 3의 Composition API를 사용하여 만들어졌습니다.</p>
    
    <div class="features">
      <h2>주요 기능</h2>
      <ul>
        <li>Vue 3 Composition API</li>
        <li>Vue Router 4</li>
        <li>Vite 빌드 도구</li>
        <li>반응형 상태 관리</li>
      </ul>
    </div>
    
    <div class="tech-stack">
      <h2>기술 스택</h2>
      <div class="tech-items">
        <span class="tech-item">Vue 3</span>
        <span class="tech-item">JavaScript</span>
        <span class="tech-item">Vite</span>
        <span class="tech-item">Vue Router</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AboutView'
}
</script>

<style scoped>
.about {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
  text-align: left;
}

.features, .tech-stack {
  margin-top: 30px;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  background-color: #f9f9f9;
}

.features ul {
  list-style-type: disc;
  padding-left: 20px;
}

.tech-items {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  margin-top: 10px;
}

.tech-item {
  background-color: #42b983;
  color: white;
  padding: 5px 12px;
  border-radius: 15px;
  font-size: 14px;
}
</style>
