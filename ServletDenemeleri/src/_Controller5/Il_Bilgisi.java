package _Controller5;

public class Il_Bilgisi {
	private String bolge;
	private String meshur;
	private Memleket memleket;

	public Il_Bilgisi() {

	}

	public Il_Bilgisi(String bolge, String meshur, Memleket memleket) {
		super();
		this.bolge = bolge;
		this.meshur = meshur;
		this.memleket = memleket;
	}

	public String getBolge() {
		return bolge;
	}

	public void setBolge(String bolge) {
		this.bolge = bolge;
	}

	public String getMeshur() {
		return meshur;
	}

	public void setMeshur(String meshur) {
		this.meshur = meshur;
	}

	public Memleket getMemleket() {
		return memleket;
	}

	public void setMemleket(Memleket memleket) {
		this.memleket = memleket;
	}

}
