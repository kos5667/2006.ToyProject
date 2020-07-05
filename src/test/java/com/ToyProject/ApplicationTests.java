package com.ToyProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}

// 	어노테이션				설명				 	Bean
// @SpringBootTest		통합 테스트,전체		Bean 전체
// @WebMvcTest			단위 테스트,Mvc 		테스트	MVC 관련된 Bean
// @DataJpaTest			단위 테스트,Jpa			테스트	JPA 관련 Bean
// @RestClientTest		단위 테스트,Rest		API 테스트	일부 Bean
// @JsonTest			단위 테스트,Json		테스트	일부 Bean