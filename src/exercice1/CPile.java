package exercice1;

import java.util.ArrayList;

public class CPile<A> implements IPile{
	
	ArrayList<A> Pile =new ArrayList<A>() ;

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void empile(Object a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object depile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nbElements() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object sommet() {
		// TODO Auto-generated method stub
		return null;
	}

}
