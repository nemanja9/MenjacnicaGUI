package menjacnica.gui;

public class Kurs {

	int sifra;
	String naziv;
	String skraceni;
	double prodajni;
	double kupovni;
	double srednji;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceni() {
		return skraceni;
	}
	public void setSkraceni(String skraceni) {
		this.skraceni = skraceni;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	@Override
	public String toString() {
		
		return "Kurs: [Šifra:  " + sifra + " Naziv: " + naziv + " Prodajni kurs: " + prodajni + " Kupovni kurs: " + kupovni +
				" Srednji kurs: " + srednji + " Skraæeni naziv: " + skraceni+" ] ";
	}
	
}
