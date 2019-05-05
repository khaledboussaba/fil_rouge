package fr.khaled.tp1.beans;

public class Commande {

	private Client client;
	private String date;	
	private Double montant;
	private String modeDePayement;
	private String statutDuPayement;
	private String modeDeLivraison;
	private String statutDeLivraison;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getModeDePayement() {
		return modeDePayement;
	}
	public void setModeDePayement(String modeDePayement) {
		this.modeDePayement = modeDePayement;
	}
	public String getStatutDuPayement() {
		return statutDuPayement;
	}
	public void setStatutDuPayement(String statutDuPayement) {
		this.statutDuPayement = statutDuPayement;
	}
	public String getModeDeLivraison() {
		return modeDeLivraison;
	}
	public void setModeDeLivraison(String modeDeLivraison) {
		this.modeDeLivraison = modeDeLivraison;
	}
	public String getStatutDeLivraison() {
		return statutDeLivraison;
	}
	public void setStatutDeLivraison(String statutDeLivraison) {
		this.statutDeLivraison = statutDeLivraison;
	}
	
	
	
}
