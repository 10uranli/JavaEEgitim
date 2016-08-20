package _Model;

public class PersonModel {
	private String ad;
	private String soyad;
	private int yas;
	public PersonModel(){
		
	}
	public PersonModel(String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
//altsihpt type açar