package fr.eni.connexion.bo;

public class Utilisateurs {
	
	private int noUtilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String mdp;
	
	public Utilisateurs(int noUtilisateur, String nom, String prenom, String email, String mdp) {
		this(nom, prenom, email, mdp);
		this.noUtilisateur = noUtilisateur;
	}
	
	public Utilisateurs(String nom, String prenom, String email, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
	}

	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Utilisateurs [noUtilisateur=" + noUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", mdp=" + mdp + "]";
	}
	
	

}
