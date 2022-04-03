package exercice2;

import java.util.*;

public class departement {
	private int idDep;
	private int Capacity;
	Set<employe> LEmployes;
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public Set<employe> getLEmployes() {
		return LEmployes;
	}
	public void setLEmployes(Set<employe> lEmployes) {
		LEmployes = lEmployes;
	}
	public departement(int idDep, int capacity, Set<employe> lEmployes) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
		LEmployes = lEmployes;
	}
	public void ajoutEmploye(employe E) {
		if(E.getCin()>0) {LEmployes.add(E);}
		E.setNumDep(idDep);
	}
	public void retirerEmploye(employe E) {
		LEmployes.remove(E);
		E.setNumDep(0);
	}
	public void afficheDep() {
		System.out.println(LEmployes);
	}
	public boolean existeE(int cin) {
		return LEmployes.contains(cin);
	}
	public employe getEmpSalMax() {
		compareSalaire salaireComparator = new compareSalaire();
		TreeSet<employe> TreeEmployes = new TreeSet<employe>(salaireComparator);
		TreeEmployes.addAll(getLEmployes());
		System.out.println(TreeEmployes);
		return new employe(2);
	}
}
