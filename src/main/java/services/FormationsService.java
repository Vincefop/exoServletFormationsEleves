package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import models.Eleve;
import models.Formation;

public class FormationsService {

	// Je crée une variable static qui contiendra l'instance de ma classe Posts Service 
		private static FormationsService instance = null;
		// Je crée une liste d'élèves vide
		private List<Eleve> lesEleves = new ArrayList<Eleve>();
		// Je crée une liste de formations vide
		private List<Formation> lesFormations = new ArrayList<Formation>();
		
		// Je passe le contructeur en private 
		// Cela bloque la création d'instance de la classe en dehors de celle ci 
		// Ça permet de créer le singleton
		private FormationsService() {
			// Je crée une liste de formations factice 
			// et je les injecte dans mon tableau d'articles
	    	
	    	for (int i = 0; i < 5; i++) {
    			lesFormations.add(
    					new Formation("formation"+i, "programme :dzbh-" +i, i)
    			);
    		}
	    	
			// Je crée une liste d'élèves factice 
			// et je les injecte dans ma liste d'élèves
	    	for (Formation formation : lesFormations) {
				for (int i = 0; i <formation.getNbreEleve(); i++) {
		    		lesEleves.add(new Eleve("Nom" + i + " - " + formation.getTitre(), "prenom"+ i, 20+i, new Random().nextInt(21), formation));
				}
	    	}
	    	
			
		}
		
		// Je crée un méthode static qui va me permettre de récupèrer l'instance de ma classe 
		public static FormationsService getInstance() {
			if (FormationsService.instance == null) {
				FormationsService.instance = new FormationsService();
			}
			return instance;
		}
		
		// Méthode qui renvoi la liste des formations
		public List<Formation> getFormations() {
			return this.lesFormations; 
		}
		
		// Méthode qui permet de récupèrer un élève selon sa formation
		public Eleve getEleveByFormation(String formationTitle) {
			Article response = null;
			for (Article post : posts) {
				if (post.getTitle().equals(title)) {
					response = post;
					break;
				}
			}
			return response;
		}
}
