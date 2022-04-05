package exercice1;

import java.util.ArrayList;

public class CPile<A> implements IPile{
	
	public ArrayList<A> Pile ;
	CPile(){
		Pile = new ArrayList<A>() ;
	}

	@Override
	public boolean estVide() {
		return Pile.isEmpty();
	}

	@Override
	public void empile(Object a) {
		Pile.add((A)a); 
		
	}

	@Override
	public Object depile() {
		Pile.remove(Pile.size()-1);
		return Pile;
	}

	@Override
	public int nbElements() {
		return Pile.size();
	}

	@Override
	public Object sommet() {
		return Pile.get(Pile.size()-1);
	}

}
