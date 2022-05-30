package br.com.meta.observer.movies;

import br.com.meta.observer.movies.observers.Actor;
import br.com.meta.observer.movies.observers.Cameraman;
import br.com.meta.observer.movies.publishers.Agent;

public class Movie {

	public static void main(String[] args) throws InterruptedException {

		final Agent agent = new Agent();
		agent.addObserver(new Cameraman());
		agent.addObserver(new Actor());

		for(int i=0;i<5;i++){
			if(i == 4) {
				agent.setStatus(true);
				return;
			}else{
				agent.setStatus(false);
				Thread.sleep(5000);
			}
		}

	}
}
