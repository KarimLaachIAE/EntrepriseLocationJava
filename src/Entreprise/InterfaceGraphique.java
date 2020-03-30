package Entreprise;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.json.simple.JSONObject;

import Gestion.Location;
import TypeEquipement.Chaussure;
import TypeEquipement.PaireSki;

public class InterfaceGraphique extends JFrame {
	
	TicketReservation reservation;				
	Entreprise ent = new Entreprise();
	
	ArrayList<Chaussure> c1 = new ArrayList<Chaussure>();
	ArrayList<Chaussure> c2 = new ArrayList<Chaussure>();
	ArrayList<Chaussure> c3 = new ArrayList<Chaussure>();
	
	ArrayList<PaireSki> ps1 = new ArrayList<PaireSki>();
	ArrayList<PaireSki> ps2 = new ArrayList<PaireSki>();
	ArrayList<PaireSki> ps3 = new ArrayList<PaireSki>();
	
	public InterfaceGraphique() {
	
		ent.creationCollectionChaussure(ent, c1, c2, c3);
		ent.creationCollectionSki(ent, ps1, ps2, ps3);
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle("LocaSki");
		fenetre.setSize(500,500);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		pan.setLayout(new GridLayout(9,1));
		
		JPanel panciv = new JPanel();
		panciv.setLayout(new FlowLayout(FlowLayout.LEFT));
		JComboBox civilite = new JComboBox();
		JLabel labelciv = new JLabel ("Civilite : ");
		civilite.setPreferredSize(new Dimension(150,25));
		civilite.addItem("");
		civilite.addItem("Monsieur");
		civilite.addItem("Madame");
		civilite.addItem("Autre");
		panciv.add(labelciv);
		panciv.add(civilite);
		panciv.setBackground(Color.WHITE);
		pan.add(panciv);
		
		JPanel pannom = new JPanel();
		pannom.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField nom = new JTextField();
		JLabel labelnom = new JLabel("Nom : ");
		nom.setPreferredSize(new Dimension(150,25));
		pannom.add(labelnom);
		pannom.add(nom);
		pannom.setBackground(Color.WHITE);
		pan.add(pannom);
		
		JPanel panprenom = new JPanel();
		panprenom.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField prenom = new JTextField();
		JLabel labelprenom = new JLabel("Prenom : ");
		prenom.setPreferredSize(new Dimension(150,25));
		panprenom.add(labelprenom);
		panprenom.add(prenom);
		panprenom.setBackground(Color.WHITE);
		pan.add(panprenom);
		
		JPanel panmail = new JPanel();
		panmail.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField mail = new JTextField();
		JLabel labelmail = new JLabel("E-mail : ");
		mail.setPreferredSize(new Dimension(150,25));
		panmail.add(labelmail);
		panmail.add(mail);
		panmail.setBackground(Color.WHITE);
		pan.add(panmail);
		
		JPanel pantel = new JPanel();
		pantel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField tel = new JTextField();
		JLabel labeltel = new JLabel("Tel : ");
		tel.setPreferredSize(new Dimension(150,25));
		pantel.add(labeltel);
		pantel.add(tel);
		pantel.setBackground(Color.WHITE);
		pan.add(pantel);

		JPanel panequipement = new JPanel();
		panequipement.setLayout(new FlowLayout(FlowLayout.LEFT));
		panequipement.setLayout(new GridLayout(2,3));
		JCheckBox pairechaussure = new JCheckBox("Chaussure");
		pairechaussure.setBackground(Color.WHITE);
		JCheckBox paireski = new JCheckBox("Ski");
		paireski.setBackground(Color.WHITE);
		JLabel labelequipement = new JLabel("Je veux louer : ");
		JLabel labelchaussure = new JLabel("Pointure : ");
		JComboBox pointure = new JComboBox();
		pointure.addItem("");
		for(int i=30; i<=50; i++) {
			pointure.addItem(i);
		}
		JLabel labelski = new JLabel("Taille : ");
		JComboBox taille = new JComboBox();
		taille.addItem("");
		for(int i=100; i<=200; i++) {
			taille.addItem(i);
		}
		JPanel vide = new JPanel() ; vide.setBackground(Color.WHITE);
		panequipement.add(labelequipement);
		panequipement.add(pairechaussure);
		panequipement.add(labelchaussure);
		panequipement.add(pointure);
		panequipement.add(vide);
		panequipement.add(paireski);
		panequipement.add(labelski);
		panequipement.add(taille);
		panequipement.setBackground(Color.WHITE);
		pan.add(panequipement);
		
		JPanel panmarque = new JPanel();
		panmarque.setLayout(new FlowLayout(FlowLayout.LEFT));
		JComboBox marque = new JComboBox();
		JLabel labelmarque = new JLabel ("Marque de preference : ");
		marque.setPreferredSize(new Dimension(150,25));
		marque.addItem("");
		marque.addItem("Rossignol");
		marque.addItem("Dynastar");
		marque.addItem("Salomon");
		panmarque.add(labelmarque);
		panmarque.add(marque);
		panmarque.setBackground(Color.WHITE);
		pan.add(panmarque);
		
		JPanel pandateloc = new JPanel();
		pandateloc.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel labeldate = new JLabel("Date debut location : ");
		JFormattedTextField datelocation = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
		datelocation.setValue(new Date());
		JLabel labelduree = new JLabel("Durée location (en jours) : ");
		JComboBox duree = new JComboBox();
		duree.addItem("");
		for(int i=1; i<=30; i++) {
			duree.addItem(i);
		}
		pandateloc.add(labeldate);
		pandateloc.add(datelocation);
		pandateloc.add(labelduree);
		pandateloc.add(duree);
		pandateloc.setBackground(Color.WHITE);
		pan.add(pandateloc);
		
		JPanel panresa = new JPanel();
		JButton bouton = new JButton("Reserver");
		bouton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)  {
				TicketReservation ticket = new TicketReservation();
				String resachaussure = "non";
				if (pairechaussure.isSelected()) { resachaussure = "oui";}
				String resaski = "non";
				if (paireski.isSelected()) { resaski = "oui";}
				
				if (civilite.getSelectedItem().toString().equals("") || nom.getText().equals("") || prenom.getText().equals("") || mail.getText().equals("") || tel.getText().equals("") || datelocation.getText().equals("") || duree.getSelectedItem().toString().equals("") || marque.getSelectedItem().toString().contentEquals("")) {
					JOptionPane.showMessageDialog(fenetre,"Veuillez completer les champs manquants !");
				}else {
					
				
					//Ici gestion d'exception pour être sur que le fichier json soit bien creer
					try {
						ticket.creer(civilite.getSelectedItem().toString(), nom.getText(), prenom.getText(), mail.getText(), tel.getText(), resachaussure, resaski, taille.getSelectedItem().toString(), pointure.getSelectedItem().toString(), marque.getSelectedItem().toString(), datelocation.getText(), duree.getSelectedItem().toString() );
						
					}catch (IOException e1) {
						e1.printStackTrace();
					}
					
					
					if(resachaussure == "oui") {
						Chaussure c = null;
						c = ent.trouverPaireChaussureLouer(c1, c2, c3, marque.getSelectedItem().toString(), Integer.parseInt(pointure.getSelectedItem().toString()));
						Location l1 = new Location(datelocation.getText(), Integer.parseInt(duree.getSelectedItem().toString()), civilite.getSelectedItem().toString(), nom.getText(), prenom.getText(), mail.getText(), tel.getText());
						c.setEquipementLouer(l1);
					}
					
					if(resaski == "oui") {
						PaireSki ps = null;
						ps = ent.trouverPaireSkiLouer(ps1, ps2, ps3, marque.getSelectedItem().toString(),  Integer.parseInt(taille.getSelectedItem().toString()));
						Location l2 = new Location(datelocation.getText(), Integer.parseInt(duree.getSelectedItem().toString()), civilite.getSelectedItem().toString(), nom.getText(), prenom.getText(), mail.getText(), tel.getText());
						ps.setEquipementLouer(l2);
					}
					
					ent.afficherInfosEquipementLouer();
						

				}
				
			}

		});
		
		panresa.add(bouton);
		panresa.setBackground(Color.WHITE);
		pan.add(panresa);

		fenetre.setContentPane(pan);
		
		fenetre.setVisible(true);
		
	}

}
