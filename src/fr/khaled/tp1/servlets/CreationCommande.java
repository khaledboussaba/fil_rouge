package fr.khaled.tp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import fr.khaled.tp1.beans.Client;
import fr.khaled.tp1.beans.Commande;

public class CreationCommande extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nomClient");
		String firstName = request.getParameter("prenomClient");
		String address = request.getParameter("adresseClient");
		String phoneNumber = request.getParameter("telephoneClient");
		String eMail = request.getParameter("emailClient");
		
		DateTime dt = new DateTime();
		DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
		String date = dt.toString(formatter);
		
		
		
		Double montant;
		try {
			montant = Double.parseDouble(request.getParameter("montantCommande"));			
		} catch (Exception e) {
			montant = (double) -1;
		}
		
		String modeDePayement = request.getParameter("modePaiementCommande");
		String statutDuPayement = request.getParameter("statutPaiementCommande");
		String modeDeLivraison = request.getParameter("modeLivraisonCommande");
		String statutDeLivraison = request.getParameter("statutLivraisonCommande");
		
		Client client = new Client();
		client.setNom(name);
		client.setPrenom(firstName);
		client.setAdresseDeLivraison(address);
		client.setNumeroDeTelephone(phoneNumber);
		client.setAdresseEmail(eMail);
		
		Commande commande = new Commande();
		commande.setClient(client);
		commande.setDate(date);
		commande.setMontant(montant);
		commande.setModeDePayement(modeDePayement);
		commande.setStatutDuPayement(statutDuPayement);
		commande.setStatutDeLivraison(statutDeLivraison);;
		commande.setModeDeLivraison(modeDeLivraison);
		
		String message;
		
		if (name.trim().isEmpty() || address.trim().isEmpty() || phoneNumber.trim().isEmpty() || montant == -1
				|| modeDePayement.trim().isEmpty() || modeDeLivraison.trim().isEmpty()) {
			message = "Erreur - Vous n'avez pas remplis tous les champs obligatoires !<br>"
					+ "<a href=\"/tp1/creerCommande.jsp\">Cliquez ici<a/> pour accéder au formulaire de création d'une commande";
		} else {
			message = "Commande créée avec succès !";
		}
		
		request.setAttribute("commande", commande);
		request.setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher("/afficherCommande.jsp").forward(request, response);
	}

}
