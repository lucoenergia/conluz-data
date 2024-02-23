package org.lucoenergia.conluzdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestConluzDataApplication {

	public static void main(String[] args) {
		SpringApplication.from(ConluzDataApplication::main).with(TestConluzDataApplication.class).run(args);
	}

}
