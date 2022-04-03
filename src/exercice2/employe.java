package exercice2;

public class employe implements Comparable<employe>{
	private int cin;
	private String nom;
	private double salaire;
	private int NumDep;
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getNumDep() {
		return NumDep;
	}
	public void setNumDep(int numDep) {
		NumDep = numDep;
	}
	public employe(int cin, String nom, double salaire, int numDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		NumDep = numDep;
	}
	@Override
	public int compareTo(employe e) {
		if(this.salaire==e.salaire) return 0;
		else if(this.salaire>e.salaire) return 1;
		else return -1;
	}
	public employe(int cin) {
		super();
		this.cin = cin;
	}
	
	
}
