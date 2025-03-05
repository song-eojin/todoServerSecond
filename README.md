# To-Do List 애플리케이션 : TodoServerSecond

## 프로젝트 동기
스프링부트 강의를 통해 작성한 TodoServer를 바탕으로 직접 기획, 설계, 코드 구현, 배포의 경험을 해보기 위해 시작하게 되었습니다. 일단 소프트웨어 생명주기의 한 사이클을 모두 경험해보는 것을 목적으로 한 프로젝트이기 때문에, 단순히 코드만 구현하는 것을 넘어서 요구사항 분석, 문서화, 배포와 같은 과정까지 포함하여 전반적인 소프트웨어 개발 과정을 이해하고 싶었습니다.

## 프로젝트 설명
현 프로젝트는 "이번 목표인 소프트웨어 생명주기 한 사이클 모두 경험해보기!"
를 위해 시작된 TodoServer Project 시리즈의 그 두 번째 단계인 TodoServerSecond Project입니다.
그 이후 시리즈 프로젝트는 현 프로젝트에 대한 리팩토링이 될 수도, TodoServerThird가 될 수 있을 것 같습니다.

- 프로젝트명 : TodoServerSecond
- 비고 : 개인 프로젝트, TodoServer Series Project

## 주요 기능
이 프로젝트는 사용자가 할 일을 추가, 수정, 삭제, 조회할 수 있는 **웹 애플리케이션**입니다. 사용자는 할 일 목록을 보고, 할 일의 상태를 변경할 수 있으며, 새로운 할 일을 추가하거나 기존의 할 일을 수정할 수 있습니다. 이 애플리케이션은 **Spring Boot**를 사용하여 개발되었습니다.

- **할 일 추가**: 사용자가 할 일을 추가할 수 있습니다.
- **할 일 수정**: 기존의 할 일을 수정할 수 있습니다.
- **할 일 삭제**: 할 일을 삭제할 수 있습니다.
- **할 일 상태 변경**: 할 일의 상태를 '진행 중' 또는 '완료'로 변경할 수 있습니다.
- **할 일 조회**: 등록된 할 일 목록을 조회할 수 있습니다.

## 기술 스택

- **Backend**: Spring Boot, JPA
- **Database**: MySQL
- **Build Tool**: Maven
- **API**: RESTful API
- **테스트**: JUnit5, MockMvc

## 프로젝트 구조

```bash
my-spring-project/
├── src/                     # 애플리케이션 소스 코드
│   ├── main/                # 주요 소스 코드
│   ├── test/                # 테스트 코드
├── docs/                     # 프로젝트 관련 문서 (REQUIREMENTS.md 등)
│   └── REQUIREMENTS.md       # 요구사항 정의서 등 문서들
├── target/                   # 빌드 결과물 (빌드 후 생성된 파일들)
├── pom.xml                   # Maven 빌드 파일
└── README.md                 # 프로젝트 설명서 (루트 디렉터리에 위치)
```

## 설치 및 실행 방법

1. 먼저 Git을 사용하여 프로젝트를 클론합니다.

```bash
레퍼지토리 생성 후 기입 예정
```

2. 의존성 설치
프로젝트 빌드 도구로 Gradle을 사용하였습니다. build.gradle에 필요한 의존성을 추가해주세요.
```bash
프로젝트 마지막에 기입 예정
```

3. 데이터베이스 설정
MySQL을 설치하고, 아래와 같은 데이터베이스를 생성합니다.

```bash
프로젝트 마지막에 기입 예정
```
4. 애플리케이션 실행
http://localhost:8080에서 확인할 수 있습니다.

## API 엔드포인트
1. 할 일 목록 조회

```
URL : /api/todos
메서드 : GET

예시 요청 : GET /api/todos

응답 예시 : 
[
  {
    "id": 1,
    "title": "Sample Task",
    "status": "PENDING",
    "dueDate": "2025-03-05T14:00:00"
  }
]

```


2. 할 일 추가

```
URL: /api/todos
메서드: POST

예시 요청 : 
POST /api/todos
Content-Type : application/json
{
  "title": "New Task",
  "dueDate": "2025-03-05"
}

응답 예시 : 
{
  "id": 1,
  "title": "New Task",
  "status": "PENDING"
}
```

3. 할 일 수정
```
URL: /api/todos/{id}
메서드: PUT

예시 요청 : 
PUT /api/todos/1
Content-Type: application/json
{
  "title": "Updated Task",
  "status": "COMPLETED"
}

응답 예시 : 
{
  "id": 1,
  "title": "Updated Task",
  "status": "COMPLETED"
}
```

4. 할 일 삭제
```
URL: /api/todos/{id}
메서드: DELETE

예시 요청 : 
DELETE /api/todos/1
```



## 테스트
이 프로젝트는 JUnit5와 MockMvc를 사용하여 테스트됩니다. 주요 테스트는 src/test/java 디렉터리 아래에 위치합니다. 