package br.com.meta.observer.movies.observers;

public class Cameraman implements Observer {
	
	public void prepareEquipment() {
		System.out.println("Prepare a camera que vamos gravar a cena 1, voce foi selecionado!!!");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			prepareEquipment();
		}
	}
}
