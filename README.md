## vue-mini-project
- Vue를 실무 프로젝트에 적용하기 위하여 만든 쇼핑몰 프로젝트
- 상품목록 조회 및 상세 조회 기능 구현

### 🔹 Vue 환경
- vue@2.7.5
- @vue/cli 5.0.4

### Vue Project setup
Delete 'package-lock.json' file and then execute. If you don't delete the file, there will be an error.
```
npm cache clean --force #npm
npm install
```

### Project start
```
npm run serve
```

### 🔸 Spring Boot API 환경
- spring boot 2.7.2
- java11
- mysql & mybatis (DB는 설정필요)   
---
### 😡 Vue 만났던 이슈 
1. API 호출 시, CORS 문제 → proxy 설정을 통해 해결. vue.config.js에 설정
```
devServer: {
  proxy: 'http://localhost:8088'
}
```
2. router 버전 이슈 → 특정 버전으로 재설치하여 해결
```
npm install router@3.5.3
```


