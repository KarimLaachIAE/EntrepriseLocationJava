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
	void equipementSeCreerBien() {
		Entreprise ent = new Entreprise();
		
		ArrayList<Chaussure> c1 = new ArrayList<Chaussure>();
		ArrayList<Chaussure> c2 = new ArrayList<Chaussure>();
		ArrayList<Chaussure> c3 = new ArrayList<Chaussure>();
		
		ArrayList<PaireSki> ps1 = new ArrayList<PaireSki>();
		ArrayList<PaireSki> ps2 = new ArrayList<PaireSki>();
		ArrayList<PaireSki> ps3 = new ArrayList<PaireSki>();
		
		ent.creationCollectionChaussure(ent, c1, c2, c3);
		ent.creationCollectionSki(ent, ps1, ps2, ps3);
		
		int i = (3*21) + (3*101);
		assertEquals(ent.afficherInfosEquipement().size(), i);
	}
	

}
