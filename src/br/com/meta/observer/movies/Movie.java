package br.com.meta.observer.movies;

import br.com.meta.observer.movies.observers.Actor;
import br.com.meta.observer.movies.observers.Cameraman;
import br.com.meta.observer.movies.publishers.Agent;

public class Movie {

	public static void main(String[] args) throws InterruptedException {

		final Agent doorman = new Agent();
		doorman.add(new Cameraman());
		doorman.add(new Actor());

		for(int i=0;i<5;i++){
			if(i == 4) {
				doorman.setStatus(true);
				return;
			}else{
				doorman.setStatus(false);
				Thread.sleep(5000);
			}
		}

	}
}
