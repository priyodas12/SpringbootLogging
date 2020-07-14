package io.microservice.SpringbootLogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Comparator;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beansName = appContext.getBeanDefinitionNames();
		Arrays.asList(beansName).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		ClassLoader classLoader = appContext.getClassLoader();
	}
}
