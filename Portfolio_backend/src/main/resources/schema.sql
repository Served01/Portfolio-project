-- PostgreSQL 15 데이터베이스 스키마 생성

-- 데이터베이스 생성 (수동으로 실행)
-- CREATE DATABASE portfolio_db;

-- PostgreSQL 15의 새로운 기능들을 활용한 스키마

-- 사용자 테이블 생성 (PostgreSQL 15 최적화)
CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    bio TEXT,
    profile_image VARCHAR(500),
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
);

-- 인덱스 생성
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);
CREATE INDEX IF NOT EXISTS idx_users_created_at ON users(created_at);

-- 업데이트 시간 자동 갱신을 위한 트리거 함수 (PostgreSQL 15 최적화)
CREATE OR REPLACE FUNCTION update_updated_at_column()
RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- 트리거 생성
DROP TRIGGER IF EXISTS update_users_updated_at ON users;
CREATE TRIGGER update_users_updated_at
    BEFORE UPDATE ON users
    FOR EACH ROW
    EXECUTE FUNCTION update_updated_at_column();

-- PostgreSQL 15의 새로운 기능들
-- 1. MERGE 문법 지원 (PostgreSQL 15+)
-- 2. 향상된 JSON 처리
-- 3. 개선된 성능과 보안
