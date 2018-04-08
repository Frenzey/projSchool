package project;

public class conseilAdmins {
	private int idConseilAdmin;
	private int idReunion;
	private String libelConseilAdmin;
	private String objetConseilAdmin;
	private String decisConseilAdmin;
	private String PVConseilAdmin;
	
	private int getIdConseilAdmin() {
		return idConseilAdmin;
	}

	private void setIdConseilAdmin(int idConseilAdmin) {
		this.idConseilAdmin = idConseilAdmin;
	}

	private int getIdReunion() {
		return idReunion;
	}

	private void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	private String getLibelConseilAdmin() {
		return libelConseilAdmin;
	}

	private void setLibelConseilAdmin(String libelConseilAdmin) {
		this.libelConseilAdmin = libelConseilAdmin;
	}

	private String getObjetConseilAdmin() {
		return objetConseilAdmin;
	}

	private void setObjetConseilAdmin(String objetConseilAdmin) {
		this.objetConseilAdmin = objetConseilAdmin;
	}

	private String getDecisConseilAdmin() {
		return decisConseilAdmin;
	}

	private void setDecisConseilAdmin(String decisConseilAdmin) {
		this.decisConseilAdmin = decisConseilAdmin;
	}

	private String getPVConseilAdmin() {
		return PVConseilAdmin;
	}

	private void setPVConseilAdmin(String pVConseilAdmin) {
		PVConseilAdmin = pVConseilAdmin;
	}

	private conseilAdmins(int idConseilAdmin, int idReunion, String libelConseilAdmin, String objetConseilAdmin,
			String decisConseilAdmin, String pVConseilAdmin) {
		super();
		this.idConseilAdmin = idConseilAdmin;
		this.idReunion = idReunion;
		this.libelConseilAdmin = libelConseilAdmin;
		this.objetConseilAdmin = objetConseilAdmin;
		this.decisConseilAdmin = decisConseilAdmin;
		PVConseilAdmin = pVConseilAdmin;
	}
	
	

}
