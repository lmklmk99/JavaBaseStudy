package com.example.lmklmk99.javabasestudy.study.factory;

public abstract class Pet {
	public abstract String kind();

	public void call() {
		System.out.println(kind() + " come on~~");
	}
}
