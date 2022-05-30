package br.com.meta.observer.movies.publishers;

import br.com.meta.observer.movies.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
	private final List<Observer> observers = new ArrayList<>();

	public void addObserver(final Observer observer) {
		observers.add(observer);
		System.out.println("Subscriber: "+ observer.getClass().getName()+" inscrito.");
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
}
