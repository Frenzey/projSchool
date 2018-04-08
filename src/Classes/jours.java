package Classes;

public class jours {
	private int idJours;
	private String nomJours;
	
	private jours(int idJours, String nomJours) {
		super();
		this.idJours = idJours;
		this.nomJours = nomJours;
	}
	private int getIdJours() {
		return idJours;
	}
	private void setIdJours(int idJours) {
		this.idJours = idJours;
	}
	private String getNomJours() {
		return nomJours;
	}
	private void setNomJours(String nomJours) {
		this.nomJours = nomJours;
	}
	
	
}
