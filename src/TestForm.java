import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Entreprise.Entreprise;
import Entreprise.InterfaceGraphique;
import Entreprise.TicketReservation;
import TypeEquipement.Chaussure;
import TypeEquipement.PaireSki;

class TestForm {
	
	@Test
	void chaussureSeCreerBien() {
		Entreprise ent = new Entreprise();
		
		ArrayList<Chaussure> c1 = new ArrayList<Chaussure>();
		ArrayList<Chaussure> c2 = new ArrayList<Chaussure>();
		ArrayList<Chaussure> c3 = new ArrayList<Chaussure>();
		
		ent.creationCollectionChaussure(ent, c1, c2, c3);
		
		int i = (3*21);
		int totalchaussure = c1.size() + c2.size() + c3.size();
		assertEquals(totalchaussure, i);
	}
	
	@Test
	void skiSeCreerBien() {
		Entreprise ent = new Entreprise();
		
		ArrayList<PaireSki> ps1 = new ArrayList<PaireSki>();
		ArrayList<PaireSki> ps2 = new ArrayList<PaireSki>();
		ArrayList<PaireSki> ps3 = new ArrayList<PaireSki>();
		
		ent.creationCollectionSki(ent, ps1, ps2, ps3);
		
		int i = (3*101);
		int totalski = ps1.size() + ps2.size() + ps3.size();
		assertEquals(totalski, i);
	}
	

	

}
