package project;

public class conseilPedagos {

	private int idConseilPedago;
	private int idReunion;
	private String libelConseilPedago;
	private String decisConseilPedago;
	
	private int getIdConseilPedago() {
		return idConseilPedago;
	}

	private void setIdConseilPedago(int idConseilPedago) {
		this.idConseilPedago = idConseilPedago;
	}

	private int getIdReunion() {
		return idReunion;
	}

	private void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	private String getLibelConseilPedago() {
		return libelConseilPedago;
	}

	private void setLibelConseilPedago(String libelConseilPedago) {
		this.libelConseilPedago = libelConseilPedago;
	}

	private String getDecisConseilPedago() {
		return decisConseilPedago;
	}

	private void setDecisConseilPedago(String decisConseilPedago) {
		this.decisConseilPedago = decisConseilPedago;
	}

	private conseilPedagos(int idConseilPedago, int idReunion, String libelConseilPedago, String decisConseilPedago) {
		super();
		this.idConseilPedago = idConseilPedago;
		this.idReunion = idReunion;
		this.libelConseilPedago = libelConseilPedago;
		this.decisConseilPedago = decisConseilPedago;
	}
}
