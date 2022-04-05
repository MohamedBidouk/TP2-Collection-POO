package exercice1;

public class testini {

	public static void main(String[] args) {
		CPile p = new CPile();
		for(int i = 0; i < 10; i++) {
			p.empile(new Integer(i));
		}
		System.out.println("La pile vide ou non ? => " + p.estVide());
		if(!p.estVide()) {
			System.out.println("La pile contient:" + p.Pile);
			while(!p.estVide()) {
				System.out.println(p.sommet());
				p.depile();
			}
		}
		
	}

}
