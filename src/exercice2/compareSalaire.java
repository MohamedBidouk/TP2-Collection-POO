package exercice2;

public class compareSalaire implements Comparator<employe>, java.util.Comparator<employe>{
	
	@Override
	public int compare(employe a, employe b) {
		if(a.getSalaire()==b.getSalaire()) return 0;
		else if (a.getSalaire()>b.getSalaire()) return 1;
		else return -1;
	}
}
