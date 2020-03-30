package Entreprise;
import java.util.ArrayList;
import java.util.Random;

import Gestion.Equipement;
import TypeEquipement.Chaussure;
import TypeEquipement.PaireSki;

public class Entreprise {
	
	private ArrayList<Equipement> listeEquipement = new ArrayList<Equipement>();
	
	public ArrayList<Equipement> getListeEquipement() {
		return listeEquipement;
	}
	
	public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
		this.listeEquipement = listeEquipement;
	}
	
	public void ajouterEquipement(Equipement e) {
		listeEquipement.add(e);
	}
	
	
	public void afficherInfosEquipementLouer() {
		for(int i = 0; i < listeEquipement.size(); i++) {
			if(listeEquipement.get(i).estLouer() == true) {
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("L'équipement " + listeEquipement.get(i).getType() + " " + listeEquipement.get(i).getMarque() + " Taille : " + listeEquipement.get(i).getPointureOuTaille()  + " a été loué : " + listeEquipement.get(i).getListeEquipementLouer().size() + " fois.");
				for(int j = 0; j < listeEquipement.get(i).getListeEquipementLouer().size(); j++) {
					System.out.println("\t - " + listeEquipement.get(i).getListeEquipementLouer().get(j).getDateDebutLocation() + " par " + listeEquipement.get(i).getListeEquipementLouer().get(j).getCiviliteClient() + " " + listeEquipement.get(i).getListeEquipementLouer().get(j).getNomClient());
				}
			}else {
				System.out.println("L'équipement " + listeEquipement.get(i).getType() + " " + listeEquipement.get(i).getMarque() + " Taille : " + listeEquipement.get(i).getPointureOuTaille() + " n'a jamais été loué");
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
	
	public void creationCollectionChaussure(Entreprise ent, ArrayList<Chaussure> c1, ArrayList<Chaussure> c2, ArrayList<Chaussure> c3) {
		//Ici gestion d'exception pour etre sur de reussir a creer toutes les paires de chaussures et qui n'y ai pas un probleme d'erreur lors de l'insertion
		try {
			for(int i = 0; i <= 20; i++) {
				c1.add(new Chaussure("Rossignol", 30+i));
				ent.ajouterEquipement(c1.get(i));

				c2.add(new Chaussure("Dynastar", 30+i));
				ent.ajouterEquipement(c2.get(i));
				
				c3.add(new Chaussure("Salomon", 30+i));
				ent.ajouterEquipement(c3.get(i));
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur :" + e.getMessage());
		}
	}
	
	public void creationCollectionSki(Entreprise ent, ArrayList<PaireSki> ps1, ArrayList<PaireSki> ps2, ArrayList<PaireSki> ps3) {
		//Ici gestion d'exception pour etre sur de reussir a creer toutes les paires de skis et qui n'y ai pas un probleme d'erreur lors de l'insertion
		try {
			for(int i = 0; i <= 100; i++) {
				ps1.add(new PaireSki("Rossignol", 100+i));
				ent.ajouterEquipement(ps1.get(i));

				ps2.add(new PaireSki("Dynastar", 100+i));
				ent.ajouterEquipement(ps2.get(i));
				
				ps3.add(new PaireSki("Salomon", 100+i));
				ent.ajouterEquipement(ps3.get(i));
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur :" + e.getMessage());
		}
	}
	
	public Chaussure trouverPaireChaussureLouer(ArrayList<Chaussure> c1, ArrayList<Chaussure> c2, ArrayList<Chaussure> c3, String marque, int pointure) {
		Chaussure c = null;
		if(marque == "Rossignol") {
			for(int i = 0; i <= 20; i++) {
				if(c1.get(i).getPointureOuTaille() == pointure) {
					c = c1.get(i);
				}
			}
		}else if(marque == "Dynastar") {
			for(int i = 0; i <= 20; i++) {
				if(c2.get(i).getPointureOuTaille() == pointure) {
					c = c2.get(i);
				}
			}
		}else if(marque == "Salomon") {
			for(int i = 0; i <= 20; i++) {
				if(c3.get(i).getPointureOuTaille() == pointure) {
					c = c3.get(i);
				}
			}
		}
		return c;
	}
	
	public PaireSki trouverPaireSkiLouer(ArrayList<PaireSki> ps1, ArrayList<PaireSki> ps2, ArrayList<PaireSki> ps3, String marque, int taille) {
		PaireSki ps = null;
		if(marque == "Rossignol") {
			for(int i = 0; i <= 100; i++) {
				if(ps1.get(i).getPointureOuTaille() == taille) {
					ps = ps1.get(i);
				}
			}
		}else if(marque == "Dynastar") {
			for(int i = 0; i <= 100; i++) {
				if(ps2.get(i).getPointureOuTaille() == taille) {
					ps = ps2.get(i);
				}
			}
		}else if(marque == "Salomon") {
			for(int i = 0; i <= 100; i++) {
				if(ps3.get(i).getPointureOuTaille() == taille) {
					ps = ps3.get(i);
				}
			}
		}
		return ps;
	}
	
	
}
