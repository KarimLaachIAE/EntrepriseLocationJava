package TypeEquipement;
import java.util.Random;

import Gestion.Equipement;

public class Chaussure extends Equipement {

	private int pointure;
	
	public Chaussure(String marque, int pointure) {
		super();
		Random r = new Random();
		int codec = 1 + r.nextInt(999 - 1);
		this.code = Integer.toString(codec);
		this.marque = marque;
		this.type = "Chaussure";
		this.pointure = pointure;
	}

	public int getPointureOuTaille() {
		return pointure;
	}

	public void setPointure(int pointure) {
		this.pointure = pointure;
	}
	
	
}
