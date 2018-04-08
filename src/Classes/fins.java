package Classes;

import java.util.Date;

public class fins {
	private int idFin;
	private Date heureFin;
	
	private fins(int idFin, Date heureFin) {
		super();
		this.idFin = idFin;
		this.heureFin = heureFin;
	}

	private int getIdFin() {
		return idFin;
	}

	private void setIdFin(int idFin) {
		this.idFin = idFin;
	}

	private Date getHeureFin() {
		return heureFin;
	}

	private void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	} 
	
	
}
