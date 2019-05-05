<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher Client</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>
	<p class="info">${ message }</p>

	Nom : ${ client.nom }
	<br /> Prénom: ${ client.prenom }
	<br /> Adresse: ${ client.adresseDeLivraison }
	<br /> Numéro de téléphone: ${ client.numeroDeTelephone }
	<br /> Email: ${ client.adresseEmail }

</body>
</html>