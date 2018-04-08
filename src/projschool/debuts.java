package project;

import java.sql.Date;

public class debuts {
	private int idDebut;
	private Date heureDebut;
	
	private debuts(int idDebut, Date heureDebut) {
		super();
		this.idDebut = idDebut;
		this.heureDebut = heureDebut;
	}
	private int getIdDebut() {
		return idDebut;
	}
	private void setIdDebut(int idDebut) {
		this.idDebut = idDebut;
	}
	private Date getHeureDebut() {
		return heureDebut;
	}
	private void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	
	

}
