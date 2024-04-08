package com.stbenji.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class StudentInfoApplicationTests {

	@Test
	void contextLoads() {
		StudentInfoApplication.main(new String[] { "--spring.profiles.active=test", "--server.port=0"});
		assertTrue(true);
	}

}
