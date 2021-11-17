package models;

public class Formation {
	
	
	
	private String titre;
	private String programme;
	private int nbreEleve;
	public Formation(String titre, String programme, int nbreEleve) {
		this.setTitre(titre);
		this.setProgramme(programme);
		this.setNbreEleve(nbreEleve);
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public int getNbreEleve() {
		return nbreEleve;
	}
	public void setNbreEleve(int nbreEleve) {
		this.nbreEleve = nbreEleve;
	}
	
	
}
