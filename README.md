# purpledog
  purpledog-member-join


------------------------------------
  
### 버전
  - java : 11
  - spring-boot : 2.6.5
  - gradle : 7.4.1
  
------------------------------------

1. 회원 테이블을 생성합니다. id와 password 컬럼만 가지고 있습니다 
2. 회원 가입 기능을 구현해주세요. 
3. 회원의 password 변경 기능을 구현해 주세요. 
4. 회원 삭제 기능을 구현해주세요. 

* Spring boot를 활용하며 JAVA JDK8 이상 버전을 꼭 사용해주세요. 
* password 보안에 대해서는 고민하지 않으셔도 됩니다. 
* 단순한 CRUD를 구현해주세요. 
* 프론트엔드는 개발하지 않으셔도 됩니다. 웹 브라우저나 Postman을 사용 할 수 있도록 해주세요.  (API는 JSON 형식을 사용도록 합니다) 
* JPA를 사용하지 않으셔도 되며 회원 테이블의 create query를 꼭 제공해주세요.

#### 테이블 
    jpa ddl-auto: create 옵션을 사용하고 있어 테이블을 생성하지 않아도 됩니다. 

#### - 회원등록
    ex) postman ->  POST http://localhost:8088/api/member/create

    {
        "memberId": "test_id",
        "password" : "qwer1234"
    }

#### - 회원수정
    ex) postman ->  PATCH http://localhost:8088/api/member/update/test_id

    {
        "memberId": "aaaa",
        "password" : "1234"
    }

#### - 회원삭제
    ex) postman ->  DELETE http://localhost:8088/api/member/delete/aaaa
