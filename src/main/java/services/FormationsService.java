package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import models.Eleve;
import models.Formation;

public class FormationsService {

	// Je cr�e une variable static qui contiendra l'instance de ma classe Posts Service 
		private static FormationsService instance = null;
		// Je cr�e une liste d'�l�ves vide
		private List<Eleve> lesEleves = new ArrayList<Eleve>();
		// Je cr�e une liste de formations vide
		private List<Formation> lesFormations = new ArrayList<Formation>();
		
		// Je passe le contructeur en private 
		// Cela bloque la cr�ation d'instance de la classe en dehors de celle ci 
		// �a permet de cr�er le singleton
		private FormationsService() {
			// Je cr�e une liste de formations factice 
			// et je les injecte dans mon tableau d'articles
	    	
	    	for (int i = 1; i <= 5; i++) {
    			lesFormations.add(
    					new Formation("formation"+i, "programme:dzbh-" +i, i)
    			);
    		}
	    	
			// Je cr�e une liste d'�l�ves factice 
			// et je les injecte dans ma liste d'�l�ves
	    	for (Formation formation : lesFormations) {
				for (int i = 0; i <formation.getNbreEleve(); i++) {
		    		lesEleves.add(new Eleve("Nom" + i + "-" + formation.getTitre(), "prenom"+ i, 20+i, new Random().nextInt(21), formation));
				}
	    	}
	    	
			
		}
		
		// Je cr�e un m�thode static qui va me permettre de r�cup�rer l'instance de ma classe 
		public static FormationsService getInstance() {
			if (FormationsService.instance == null) {
				FormationsService.instance = new FormationsService();
			}
			return instance;
		}
		
		// M�thode qui renvoi la liste des formations
		public List<Formation> getFormations() {
			return this.lesFormations; 
		}
		
		// M�thode qui renvoi la liste des eleves
		public List<Eleve> getEleves() {
			return this.lesEleves; 
		}
		
		
		// M�thode qui permet de r�cup�rer une formation selon son titre
		public Formation getFormationByTitle(String formationTitle) {
			Formation res = null;
			for (Formation formation : lesFormations) {
				if (formation.getTitre().equals(formationTitle)) {
					res = formation;
					break;
				}
			}
			return res;
		}
		
		// M�thode qui permet de r�cup�rer une formation selon son titre
		public Eleve getEleveByName(String nomEleve) {
			Eleve res = null;
			for (Eleve eleve : lesEleves) {
				if (eleve.getNom().equals(nomEleve)) {
					res = eleve;
					break;
				}
			}
			return res;
		}
}
