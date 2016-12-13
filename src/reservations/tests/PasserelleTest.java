// ----------------------------------- À LIRE AVANT D'EFFECTUER LES TESTS !!!!!! -----------------------------------
// Il est important d'adapter les différents paramètres des tests et adapter aux données de la base de données !!!!!
// Par exemple :
// Pour testConsulterReservation, j'ai pris jouault car dans ma base de donnée, jouault a fait 2 réservations.
// -----------------------------------------------------------------------------------------------------------------
// Possibilité de mettre en commentaire testCreerUtilisateur et testSupprimerUtilisateur 
// Car sinon, cela crée et supprime, un utilisateur à chaque fois que l'on lance les tests
// Ou alors effectuer les tests uniquement sur le test que l'on veut tester
// -----------------------------------------------------------------------------------------------------------------

package reservations.tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import reservations.classes.Passerelle;
import reservations.classes.Reservation;
import reservations.classes.Utilisateur;

public class PasserelleTest {

	@Test
	public void testConnecter() {
		String msg = Passerelle.connecter("admin", "adminnnnnnnn");
		assertEquals("Test Passerelle.connecter", "Erreur : authentification incorrecte.", msg);
		
		msg = Passerelle.connecter("admin", "admin");
		assertEquals("Test Passerelle.connecter", "Administrateur authentifié.", msg);
		
		msg = Passerelle.connecter("giboired", "passe");
		assertEquals("Test Passerelle.connecter", "Utilisateur authentifié.", msg);	
	}

	/* @Test
	public void testCreerUtilisateur() {
		Utilisateur unUtilisateur = new Utilisateur(0, 4, "yvesz", "", "yves.zenels@gmail.com");
		String msg = Passerelle.creerUtilisateur("admin", "adminnnnnnnn", unUtilisateur);
		assertEquals("Test Passerelle.creerUtilisateur", "Erreur : le niveau doit être 0, 1 ou 2.", msg);
		
		unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		msg = Passerelle.creerUtilisateur("admin", "adminnnnnnnn", unUtilisateur);
		assertEquals("Test Passerelle.creerUtilisateur", "Erreur : authentification incorrecte.", msg);
		
		unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		msg = Passerelle.creerUtilisateur("admin", "admin", unUtilisateur);
		assertEquals("Test Passerelle.creerUtilisateur", "Enregistrement effectué ; un mail va être envoyé à l'utilisateur.", msg);
		
		unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		msg = Passerelle.creerUtilisateur("admin", "admin", unUtilisateur);
		assertEquals("Test Passerelle.creerUtilisateur", "Erreur : nom d'utilisateur déjà existant.", msg);	
	} */

	private static String FormaterDateHeure(Date uneDate, String unFormat) {
		SimpleDateFormat leFormat = new SimpleDateFormat(unFormat);
		return leFormat.format(uneDate);
	}
	
	/* @Test
	public void testConsulterReservations() {
		Utilisateur unUtilisateur = new Utilisateur(0, 0, "giboired", "passeeeeeeeeeee", "");
		String msg = Passerelle.consulterReservations(unUtilisateur);
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		unUtilisateur = new Utilisateur(0, 0, "paquet", "passe", "");
		msg = Passerelle.consulterReservations(unUtilisateur);
		assertEquals("Erreur : vous n'avez aucune réservation.", msg);
		
		unUtilisateur = new Utilisateur(0, 0, "jouault", "passe", "");
		msg = Passerelle.consulterReservations(unUtilisateur);
		assertEquals("Vous avez effectué 2 réservation(s).", msg);
		assertEquals(2, unUtilisateur.getNbReservations());
		
		String formatUS = "yyyy-MM-dd HH:mm:ss";
		Reservation laReservation = unUtilisateur.getLaReservation(0);
		assertEquals("Amphithéâtre", laReservation.getRoomName());		
		assertEquals(0, laReservation.getStatus());	
		assertEquals("2017-06-21 18:00:00", FormaterDateHeure(laReservation.getStartTime(), formatUS));
		assertEquals("2017-06-22 00:00:00", FormaterDateHeure(laReservation.getEndTime(), formatUS));
		
		laReservation = unUtilisateur.getLaReservation(1);
		assertEquals("Hall d'accueil", laReservation.getRoomName());		
		assertEquals(4, laReservation.getStatus());	
		assertEquals("2017-06-21 18:00:00", FormaterDateHeure(laReservation.getStartTime(), formatUS));
		assertEquals("2017-06-22 00:00:00", FormaterDateHeure(laReservation.getEndTime(), formatUS));
	} */
    
	/*
	public void testConsulterSalles() {
		Utilisateur unUtilisateur = new Utilisateur(0, 0, "giboired", "passeeeeeeeeeee", "");
		String msg = Passerelle.consulterSalles(unUtilisateur);
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		unUtilisateur = new Utilisateur(0, 0, "cheminl", "passe", "");
		msg = Passerelle.consulterSalles(unUtilisateur);
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		unUtilisateur = new Utilisateur(0, 0, "aubinv", "admin", "");
		msg = Passerelle.consulterSalles(unUtilisateur);
		assertEquals("14 salles disponibles en réservation", msg);
	}
	*/
	
	/* @Test
	public void testAnnulerReservation()
	{		
		String msg = Passerelle.annulerReservation("paquet", "passe", "50");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : numéro de réservation inexistant.", msg);
		
		msg = Passerelle.annulerReservation("paquet", "passe", "14");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : vous n'êtes pas l'auteur de cette réservation.", msg);
		
		msg = Passerelle.annulerReservation("paquet", "passe", "21");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : cette réservation est déjà passée.", msg);
		
		msg = Passerelle.annulerReservation("paquet", "passe", "22");
		assertEquals("Test Passerelle.annulerReservation", "Réservation annulée ; vous allez recevoir un mail de confirmation.", msg);
    } */

	/* @Test
	public void testChangerDeMdp(){
		String msg = Passerelle.changerDeMdp("yvesz", "test", "test", "test");
		assertEquals("Test Passerelle.changerDeMdp", "Erreur : authentification incorrecte.", msg);
		
		msg = Passerelle.changerDeMdp("yvesz", "passe", "test", "tests");
		assertEquals("Test Passerelle.changerDeMdp", "Erreur : le nouveau mot de passe et sa confirmation sont différents !", msg);
		
		msg = Passerelle.changerDeMdp("yvesz", "passe", "test", "test");
		assertEquals("Test Passerelle.changerDeMdp", "Modification du mot de passe effectué ; Vous allez recevoir un mail avec votre nouveau mot de passe.", msg);
    } */

	/* @Test
	public void testConfirmerReservation(){	
		// 0 pour confirmé et 4 pour provisoire 
		String msg = Passerelle.confirmerReservation("jouault", "passe", "50");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : numéro de réservation inexistant.", msg);
		
		msg = Passerelle.confirmerReservation("jouault", "passe", "3");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : vous n'êtes pas l'auteur de cette réservation.", msg);
		
		msg = Passerelle.confirmerReservation("jouault", "passe", "2");
		assertEquals("Test Passerelle.annulerReservation", "Erreur : cette réservation est déjà confirmée.", msg);
		
		msg = Passerelle.confirmerReservation("jouault", "passe", "4");
		assertEquals("Test Passerelle.annulerReservation", "Enregistrement effectué ; vous allez recevoir un mail de confirmation.", msg);
    } */

	/* @Test
	public void testDemanderMdp(){
		Utilisateur unUtilisateur = new Utilisateur(125, 1, "yvesz", "passe", "yves.zenels@gmail.com");
		String msg = Passerelle.demanderMdp("zenelsy");
		assertEquals("Test Passerelle.demanderMdp", "Erreur : nom d'utilisateur inexistant.", msg);
		
		msg = Passerelle.demanderMdp("yvesz");
		assertEquals("Test Passerelle.changerDeMdp", "Modification du mot de passe effectué ; Vous allez recevoir un mail avec votre nouveau mot de passe.", msg);	
    } */

	/* @Test
	public void testSupprimerUtilisateur() {
		Utilisateur unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		String msg = Passerelle.supprimerUtilisateur("admin", "adminnnnnnnn", unUtilisateur);
		assertEquals("Test Passerelle.supprimerUtilisateur", "Erreur : authentification incorrecte.", msg);
		
		unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		msg = Passerelle.supprimerUtilisateur("admin", "admin", unUtilisateur);
		assertEquals("Test Passerelle.supprimerUtilisateur", "Suppression effectué ; un mail va être envoyé à l'utilisateur.", msg);
		
		unUtilisateur = new Utilisateur(0, 1, "yvesz", "", "yves.zenels@gmail.com");
		msg = Passerelle.supprimerUtilisateur("admin", "admin", unUtilisateur);
		assertEquals("Test Passerelle.supprimerUtilisateur", "Erreur : nom d'utilisateur inexistant.", msg);	
	} */

	/* @Test
	public void testTesterDigicodeBatiment()
	{
		msg = Passerelle.testerDigicodeBatiment("21CF74");
		assertEquals("Test Passerelle.annulerReservation", "1", msg);
    } */
    
	/* @Test
	public void testTesterDigicodeSalle()
	{
		String msg = Passerelle.testerDigicodeSalle("0", "21CF74");
		assertEquals("Test Passerelle.testerDigicodeSalle", "0", msg);
		
		msg = Passerelle.testerDigicodeSalle("5", "0");
		assertEquals("Test Passerelle.testerDigicodeSalle", "0", msg);
		
		msg = Passerelle.testerDigicodeSalle("5", "21CF74");
		assertEquals("Test Passerelle.testerDigicodeSalle", "1", msg);
    } */
}
