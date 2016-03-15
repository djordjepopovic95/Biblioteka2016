package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs{
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String naslov, String izdavac) {
		LinkedList<Knjiga> rez = new LinkedList<Knjiga>();
		for (int i=0; i < knjige.size(); i++){
			if (knjige.get(i).getNaslov().contains(naslov)){
				rez.add(knjige.get(i));
			}
		}
		return rez;
	}

	
}
