package com.example.lmklmk99.javabasestudy.study.singleton;

public class CallObject {

	public void callCount() {
		CountManager instance = CountManager.getInstance();
		System.out.println("Call Cnt : " + instance.getCallCnt());
	}
}
