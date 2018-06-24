package com.example.lmklmk99.javabasestudy.study.strategy;

public class Computer {

	Device device;

	public Computer(Device device) {
		this.device = device;
	}

	public void work() {
		device.work();
	}
}