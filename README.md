# springboot2.0

spring boot 1.5.3에서 2.0.3 로 변경을 위한 메모
=======================================

여기 참조 해라.
https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide

#1 Gradle Plugin
 build.gradle 에 추가
 apply plugin: 'io.spring.dependency-management' // <-- add this to your build.gradle

#2 gradle5 lombok 사용시
 - build를 하면 lombok 관련 deprecated 오류가 발생, gradle5 부터는 아래 형식으로 변경해야 하는 듯
<pre><code>
dependencies {
	annotationProcessor("org.projectlombok:lombok:$lombokVersion")
	compileOnly("org.projectlombok:lombok:$lombokVersion")
	testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
	testCompileOnly("org.projectlombok:lombok:$lombokVersion")
}
</code></pre>

#3 jsp
spring-boot-starter-web 에 포함된 tomcat 은 JSP 엔진을 포함하고 있지 않습니다.
-- 이걸 안했더니.... 계속 jsp가 html로 나오네... 바보
compile('org.apache.tomcat.embed:tomcat-embed-jasper')
	compile('javax.servlet:jstl:1.2')
