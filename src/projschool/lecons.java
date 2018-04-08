package project;

public class lecons {
	private int idLecon;
	private int idSupport;
	private String libelLecon;
	private int pagDebLecon;
	private int pagFinLecon;
	
	private lecons(int idLecon, int idSupport, String libelLecon, int pagDebLecon, int pagFinLecon) {
		super();
		this.idLecon = idLecon;
		this.idSupport = idSupport;
		this.libelLecon = libelLecon;
		this.pagDebLecon = pagDebLecon;
		this.pagFinLecon = pagFinLecon;
	}

	private int getIdLecon() {
		return idLecon;
	}

	private void setIdLecon(int idLecon) {
		this.idLecon = idLecon;
	}

	private int getIdSupport() {
		return idSupport;
	}

	private void setIdSupport(int idSupport) {
		this.idSupport = idSupport;
	}

	private String getLibelLecon() {
		return libelLecon;
	}

	private void setLibelLecon(String libelLecon) {
		this.libelLecon = libelLecon;
	}

	private int getPagDebLecon() {
		return pagDebLecon;
	}

	private void setPagDebLecon(int pagDebLecon) {
		this.pagDebLecon = pagDebLecon;
	}

	private int getPagFinLecon() {
		return pagFinLecon;
	}

	private void setPagFinLecon(int pagFinLecon) {
		this.pagFinLecon = pagFinLecon;
	}
	
	
	

}
