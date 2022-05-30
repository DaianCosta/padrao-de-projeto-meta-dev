package br.com.meta.observer.movies.observers;

public class Actor implements Observer {
	
	public void sendText() {
		System.out.println("Prepare o texto da cena 1, voce foi selecionado!!!");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			sendText();
		}
	}
}
