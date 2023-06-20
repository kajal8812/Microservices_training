package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

//import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean(Address.class));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	}

}
