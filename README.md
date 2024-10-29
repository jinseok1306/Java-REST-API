 # Spring Boot REST API 구성하기

 ### 1. Spring vs Spring Boot
 - Spring
    - Java Application 개발을 위한 기본 프레임워크
    - XML 또는 Java로 복잡한 설정 필요
    - WAR(Web Application Archive) 파일을 Tomcat 같은 외부 웹 서버에 배포
 - SPring Boot
    - Spring을 쉽게 사용하게 해주는 도구
    - 많은 설정들이 자동으로 이루어짐
    - JAR(Java Archive) 파일을 실행하면 자동으로 내장된 서버(Tomcat, Jetty 등)가 실행

 ### 2. STS 설치
 - Spring Tools 사이트(https://spring.io/tools) 접속 후 Spring Tools 4 for Eclipse 설치
<img src="demo/scan/sts_site.png"  width="800" >  

 ### 3. Open JDK 설치
  - azul 사이트(https://www.azul.com/downloads/?package=jdk#zulu) 접속 후 OpenJDK 설치 후 환경변수 설정  
<img src="demo/scan/azul_site.png"  width="800" >  

 ### 4. SpringBoot 프로젝트 생성하기
  - File -> New -> Spring Starter Project 클릭
  <img src="demo/scan/project_create.png"  width="800" >  
  - Type, Packaging, Java Version 설정 후 Next (Java Version = 설치한 JDK Version)
<img src="demo/scan/project_create1.png"  width="800" >  
  - Dependency 선택 후 Finist
  <img src="demo/scan/project_create2.png"  width="800" >  
    - Spring BOot DevTools
    - Spring Web
    - Mybatis Framework
    - MS SQL Server Driver 

 ### 5. MVC 구조 이해하기
  - DB : 실제 데이터베이스 서버
    - Mybatis : 쿼리작성을 편하게 도와주는 프레임워크
  - Model : 데이터를 처리하는 영역
    - DAO : 데이터베이스에 접근하는 객체
    - DTO : 데이터를 전달하기 위한 객체
    - VO : 값 자체를 표현하는 객체
    - Entity : 실제 DB 테이블과 매핑되는 클래스
  - Service : Controller와 Model의 중간다리 역할
  - Controller : 클라리언트의 요청을 처리
  - View : 실제 사용자에게 보여지는 화면
    - View는 Controller에서 호출
    - Contoller에서 전달한 Model을 화면에서 사용할 수 있음
    - ajax : Javascript에서 XML로 비동기 통신하는 방법
    - JSP : HTML 코드에 Java 코드를 포함한 동적 웹페이지  

  <img src="demo/scan/mvc_flow.png"  width="800" > 

 ### 6. Mapper 생성하기

 ### 6. Service 생성하기

 ### 7. Controller 생성하기

 ### 8. Swagger 설정하기




