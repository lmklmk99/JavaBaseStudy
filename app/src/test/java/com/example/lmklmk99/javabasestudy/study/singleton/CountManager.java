package com.example.lmklmk99.javabasestudy.study.singleton;

public class CountManager {

	private static CountManager instance = new CountManager();
	private int cnt = 0;

	private CountManager() {

	}

	public static CountManager getInstance() {
		return instance;
	}

	public int getCallCnt() {
		return cnt++;
	}
}
