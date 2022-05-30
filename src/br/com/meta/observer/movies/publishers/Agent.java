package br.com.meta.observer.movies.publishers;

public class Agent extends Publisher {
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		this.status = newStatus;
		if(status){
			System.out.println("Vamos gravar um filme turma!!!");
		}else{
			System.out.println("Procurando patrocinadores...\n");
		}
		notifyObservers(newStatus);
	}
}
