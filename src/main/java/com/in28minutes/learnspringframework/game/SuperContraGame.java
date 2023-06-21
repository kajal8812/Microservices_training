package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("Go up");
	}

	public void down() {
		System.out.println("go to ground");
	}

	public void left() {
		System.out.println("go back");
	}

	public void right() {
		System.out.println("firing the bullets");
	}
}
