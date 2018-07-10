# springboot2.0

spring boot 1.5.3에서 2.0.3 로 변경을 위한 메모
1 gradle5 lombok 사용시
 - build를 하면 lombok 관련 deprecated 오류가 발생, gradle5 부터는 아래 형식으로 변경해야 하는 듯
dependencies {
	annotationProcessor("org.projectlombok:lombok:$lombokVersion")
	compileOnly("org.projectlombok:lombok:$lombokVersion")
	testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
	testCompileOnly("org.projectlombok:lombok:$lombokVersion")
}