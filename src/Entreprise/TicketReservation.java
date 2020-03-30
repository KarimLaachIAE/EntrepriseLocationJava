package Entreprise;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class TicketReservation {
	
	JSONObject obj = new JSONObject();
	
	public void creer(String civilite, String nom, String prenom, String mail, String tel, String resachaussure, String resaski, String tailleski, String pointurechaussure, String marque, String datedebut, String duree) throws IOException{
		
		JSONObject infoticketreservation = new JSONObject();
		infoticketreservation.put("Civilite", civilite);
		infoticketreservation.put("Nom", nom);
		infoticketreservation.put("Prenom", prenom);
		infoticketreservation.put("Email", mail);
		infoticketreservation.put("Tel", tel);
		infoticketreservation.put("Reservation paire de chaussure", resachaussure);
		infoticketreservation.put("Reservation paire de ski", resaski);
		if(resachaussure == "oui") {
			infoticketreservation.put("Pointure paire de chaussure", pointurechaussure);
		}
		if(resaski == "oui") {
			infoticketreservation.put("Taille paire de ski", tailleski);
		}
		infoticketreservation.put("Marque de preference", marque);
		infoticketreservation.put("Date debut reservation", datedebut);
		infoticketreservation.put("Duree reservation", duree);
		
		File infoTouteResa = new File("TouteResa.json");
		FileWriter fr = new FileWriter(infoTouteResa, true);
		BufferedWriter fichierToutesLesResa = new BufferedWriter(fr);
		fichierToutesLesResa.write(infoticketreservation.toString());
		fichierToutesLesResa.close();
		fr.close();
		
		String nomticket = "Reservation " + nom;
		FileWriter ticketreservation = new FileWriter(nomticket+".json");
		ticketreservation.write(infoticketreservation.toString());
		ticketreservation.flush();
		ticketreservation.close();
		
		//System.out.println(infoticketreservation);
		
	}
	
	
}
