package fr.khaled.tp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.khaled.tp1.beans.Client;

public class CreationClient extends HttpServlet {

	protected void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		String name = request.getParameter("nomClient");
		String firstName = request.getParameter("prenomClient");
		String address = request.getParameter("adresseClient");
		String phoneNumber = request.getParameter("telephoneClient");
		String eMail = request.getParameter("emailClient");
		
		String message;
		
		Client client = new Client();
		client.setNom(name);
		client.setPrenom(firstName);
		client.setAdresseDeLivraison(address);
		client.setNumeroDeTelephone(phoneNumber);
		client.setAdresseEmail(eMail);
		
		if (name.trim().isEmpty() || address.trim().isEmpty() || phoneNumber.trim().isEmpty()) {
			message = "Erreur - Vous n'avez pas remplis tous les champs obligatoires ! <br>"
					+ "<a href=\"/tp1/creerClient.jsp\">Cliquez ici<a/> pour accéder au formulaire de création d'un client";
		} else {
			message = "Client créé avec succès !";
		}
		
		request.setAttribute("client", client);
		request.setAttribute("message", message);
		this.getServletContext().getRequestDispatcher( "/afficherClient.jsp" ).forward( request, response );
	}
	
}
