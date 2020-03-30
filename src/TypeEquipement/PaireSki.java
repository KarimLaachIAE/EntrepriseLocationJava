package TypeEquipement;
import java.util.Random;

import Gestion.Equipement;

public class PaireSki extends Equipement{

	private int taille;
	
	public PaireSki(String marque, int taille) {
		super();
		Random r = new Random();
		int codeps = 1 + r.nextInt(999 - 1);
		this.code = Integer.toString(codeps);
		this.marque = marque;
		this.type = "Paire de Ski";
		this.taille = taille;
	}

	public int getPointureOuTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
}
