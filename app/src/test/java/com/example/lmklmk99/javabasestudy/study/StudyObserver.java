package com.example.lmklmk99.javabasestudy.study;

import java.util.Observable;
import java.util.Observer;

import org.junit.Test;

public class StudyObserver {
	@Test
	public void executeTest() {
		Worker worker1 = new Worker("Card player");
		Worker worker2 = new Worker("Sleeper");
		Worker worker3 = new Worker("Work hard");
		Worker worker4 = new Worker("Drink Beer");

		Watcher watcher = new Watcher();

		watcher.addObserver(worker1);
		watcher.addObserver(worker2);
		watcher.addObserver(worker3);
		watcher.addObserver(worker4);

		watcher.action("Comming Boss!!!!");
	}

	public class Watcher extends Observable {

		public void action(String action) {

			System.out.println("Call Action : " + action);

			setChanged();
			notifyObservers(action);
		}
	}

	public class Worker implements Observer {
		protected String workerName;

		public Worker(String name) {
			this.workerName = name;
		}

		public void update(java.util.Observable arg0, Object arg1) {
			if (arg0 instanceof Watcher) {
				System.out.println(arg1 + " Huk!! " + workerName + " is work hard!!");
			}
		}
	}
}
