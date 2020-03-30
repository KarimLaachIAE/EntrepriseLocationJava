package Gestion;
import java.util.ArrayList;

import TypeEquipement.Chaussure;

public abstract class Equipement {
	
	protected String code;
	protected String type;
	protected String marque;
	private Location equipementLouer;
	public ArrayList<Location> listeEquipementLouer = new ArrayList<Location>();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public Location getEquipementLouer() {
		return equipementLouer;
	}
	public void setEquipementLouer(Location equipementLouer) {
		this.equipementLouer = equipementLouer; //EXERCICE 1
		listeEquipementLouer.add(equipementLouer); //EXERCICE 2
	}
	
	public boolean estLouer() {
		if (this.getEquipementLouer() != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Location> getListeEquipementLouer() {
		return listeEquipementLouer;
	}
	public void setListeEquipementLouer(ArrayList<Location> listeEquipementLouer) {
		this.listeEquipementLouer = listeEquipementLouer;
	}
	
	public abstract int getPointureOuTaille();
	
	

}
