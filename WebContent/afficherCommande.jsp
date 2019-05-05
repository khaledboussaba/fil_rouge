<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>

	<p class="info">${ message }</p>
	Client
	<br /> Nom : ${ commande.client.nom }
	<br /> Prénom: ${ commande.client.prenom }
	<br /> Adresse: ${ commande.client.adresseDeLivraison }
	<br /> Numéro de téléphone: ${ commande.client.numeroDeTelephone }
	<br /> Email: ${ commande.client.adresseEmail } Commande
	<br /> Date: ${ commande.date }
	<br /> Montant: ${ commande.montant }
	<br /> Mode de payement: ${ commande.modeDePayement }
	<br /> Statut du payement: ${ commande.statutDuPayement }
	<br /> Mode de livraison: ${ commande.modeDeLivraison }
	<br /> Statut de livraison: ${ commande.statutDeLivraison }
	<br />

</body>
</html>