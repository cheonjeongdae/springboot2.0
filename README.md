# springboot2.0

spring boot 1.5.3에서 2.0.3 로 변경을 위한 메모
=======================================

#1 Gradle Plugin
 build.gradle 에 추가
 apply plugin: 'io.spring.dependency-management' // <-- add this to your build.gradle

#2 gradle5 lombok 사용시
 build를 하면 lombok 관련 deprecated 오류가 발생, gradle5 부터는 아래 형식으로 변경해야 하는 듯
 <pre><code>
	dependencies {
		annotationProcessor("org.projectlombok:lombok:$lombokVersion")
		compileOnly("org.projectlombok:lombok:$lombokVersion")
		testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
		testCompileOnly("org.projectlombok:lombok:$lombokVersion")
	}
 </code></pre>

#3 WebMvcConfigurerAdapter
 Deprecated.  as of 5.0 WebMvcConfigurer has default methods (made possible by a Java 8 baseline) and can be  
 implemented directly without the need for this adapter
 
 An implementation of WebMvcConfigurer with empty methods allowing subclasses to override only the methods
 they're interested in.
