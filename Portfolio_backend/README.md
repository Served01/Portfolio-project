# Portfolio Backend

Spring Boot를 사용한 포트폴리오 백엔드 API 서버입니다.

## 기술 스택

- Java 11
- Spring Boot 2.7.18
- MyBatis 2.3.2
- PostgreSQL 15
- Maven 3.5+
- Lombok

## 실행 방법

### 1. 필수 요구사항
- Java 11 이상
- Maven 3.5 이상
- PostgreSQL 15 이상

### 2. PostgreSQL 15 설치 및 설정

#### Windows 설치
1. [PostgreSQL 15 다운로드](https://www.postgresql.org/download/windows/)
2. 설치 시 포트: `5432`
3. superuser 비밀번호: `password`

#### 데이터베이스 설정
```sql
-- PostgreSQL 15 데이터베이스 생성
CREATE DATABASE portfolio_db;

-- 사용자 생성 (선택사항)
CREATE USER portfolio_user WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE portfolio_db TO portfolio_user;
```

### 3. 애플리케이션 실행
```bash
# 의존성 설치
mvn clean install

# 애플리케이션 실행
mvn spring-boot:run
```

### 4. API 테스트
- 서버 주소: http://localhost:8080/api
- 헬스 체크: http://localhost:8080/api/health
- 사용자 API: http://localhost:8080/api/users

## API 엔드포인트

### 홈
- `GET /` - API 정보 조회
- `GET /health` - 헬스 체크

### 사용자 관리
- `GET /users` - 모든 사용자 조회
- `GET /users/{id}` - 특정 사용자 조회
- `POST /users` - 사용자 생성
- `PUT /users/{id}` - 사용자 수정
- `DELETE /users/{id}` - 사용자 삭제

## 면접 설명 포인트

### 1. **MyBatis vs JPA 선택 이유**
- SQL 직접 제어 가능
- 복잡한 쿼리 작성 용이
- 성능 최적화 가능
- 기존 SQL 지식 활용

### 2. **XML 기반 설정의 장점**
- 설정과 로직의 분리
- 가독성 향상
- 유지보수 용이
- 팀 협업 시 표준화

### 3. **PostgreSQL 선택 이유**
- 오픈소스 무료
- JSON 타입 지원
- 확장성 우수
- 한국 기업에서 널리 사용

## 프로젝트 구조

```
src/main/java/com/portfolio/backend/
├── PortfolioBackendApplication.java    # 메인 애플리케이션
├── config/
│   ├── CorsConfig.java                # CORS 설정
│   └── MyBatisConfig.java             # MyBatis 설정
├── controller/
│   ├── HomeController.java            # 홈 컨트롤러
│   └── UserController.java            # 사용자 컨트롤러
├── dto/
│   └── UserDto.java                   # 사용자 DTO
├── mapper/
│   └── UserMapper.java                # MyBatis Mapper 인터페이스
└── service/
    └── UserService.java               # 사용자 서비스

src/main/resources/
├── mapper/
│   └── UserMapper.xml                 # MyBatis XML 매퍼
├── mybatis-config.xml                 # MyBatis 설정 파일
├── schema.sql                         # 데이터베이스 스키마
└── application.properties             # 애플리케이션 설정
```
