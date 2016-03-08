package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private long isbn;
	private LinkedList<Autor> autori;
	private String izdavac;
	private int izdaje;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public LinkedList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdaje() {
		return izdaje;
	}

	public void setIzdaje(int izdaje) {
		this.izdaje = izdaje;
	}

}
