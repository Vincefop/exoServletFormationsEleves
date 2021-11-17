package models;

public class Eleve {
	
	private String nom;
	private String prenom;
	private int age;
	private int note;
	private Formation formation;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public Eleve(String nom, String prenom, int age, int note, Formation formation) {

		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNote(note);
		this.setFormation(formation);
		
	}
	
	
}
