package Gestion;

public class Location {
	
	private String dateDebutLocation;
	private int dureeLocation;
	private String civiliteClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private String telClient;
	
	public Location(String dateDebutLocation, int dureeLocation, String civiliteClient, String nomClient, String prenomClient, String emailClient, String telClient) {
		this.dateDebutLocation = dateDebutLocation;
		this.dureeLocation = dureeLocation;
		this.civiliteClient = civiliteClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.telClient = telClient;
	}
	
	public String getDateDebutLocation() {
		return dateDebutLocation;
	}
	public void setDateDebutLocation(String dateDebutLocation) {
		this.dateDebutLocation = dateDebutLocation;
	}
	
	public int getDureeLocation() {
		return dureeLocation;
	}
	public void setDureeLocation(int dureeLocation) {
		this.dureeLocation = dureeLocation;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getCiviliteClient() {
		return civiliteClient;
	}
	public void setCiviliteClient(String civiliteClient) {
		this.civiliteClient = civiliteClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public String getTelClient() {
		return telClient;
	}
	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}
	
	

}
