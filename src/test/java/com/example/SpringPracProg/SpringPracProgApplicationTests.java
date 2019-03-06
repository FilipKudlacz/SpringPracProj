package com.example.SpringPracProg;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringPracProgApplicationTests {

	@BeforeAll
	@Disabled("Not implemented yet.")
	void setup(){
	}

	@Test
	@DisplayName("Spring initialization test")
	public void contextLoads() {
	}

	@AfterAll
	@Disabled("Not implemented yet.")
	void tearDown(){
	}
}

