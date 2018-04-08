package Classes;

public class reunions {
private int idReunion;
private int	idSeance;
private String libelReunion;
private int	participantsReunion;
private String ODJReunion;
private debuts hrDebReunion;
private fins hrFinReunion;
private int	presReunion;
private int	abscReunion;
private String commReunion;
private String	CRReunion;

private int getIdReunion() {
	return idReunion;
}

private void setIdReunion(int idReunion) {
	this.idReunion = idReunion;
}

private int getIdSeance() {
	return idSeance;
}

private void setIdSeance(int idSeance) {
	this.idSeance = idSeance;
}

private String getLibelReunion() {
	return libelReunion;
}

private void setLibelReunion(String libelReunion) {
	this.libelReunion = libelReunion;
}

private int getParticipantsReunion() {
	return participantsReunion;
}

private void setParticipantsReunion(int participantsReunion) {
	this.participantsReunion = participantsReunion;
}

private String getODJReunion() {
	return ODJReunion;
}

private void setODJReunion(String oDJReunion) {
	ODJReunion = oDJReunion;
}

private debuts getHrDebReunion() {
	return hrDebReunion;
}

private void setHrDebReunion(debuts hrDebReunion) {
	this.hrDebReunion = hrDebReunion;
}

private fins getHrFinReunion() {
	return hrFinReunion;
}

private void setHrFinReunion(fins hrFinReunion) {
	this.hrFinReunion = hrFinReunion;
}

private int getPresReunion() {
	return presReunion;
}

private void setPresReunion(int presReunion) {
	this.presReunion = presReunion;
}

private int getAbscReunion() {
	return abscReunion;
}

private void setAbscReunion(int abscReunion) {
	this.abscReunion = abscReunion;
}

private String getCommReunion() {
	return commReunion;
}

private void setCommReunion(String commReunion) {
	this.commReunion = commReunion;
}

private String getCRReunion() {
	return CRReunion;
}

private void setCRReunion(String cRReunion) {
	CRReunion = cRReunion;
}

private reunions(int idReunion, int idSeance, String libelReunion, int participantsReunion, String oDJReunion,
		debuts hrDebReunion, fins hrFinReunion, int presReunion, int abscReunion, String commReunion,
		String cRReunion) {
	super();
	this.idReunion = idReunion;
	this.idSeance = idSeance;
	this.libelReunion = libelReunion;
	this.participantsReunion = participantsReunion;
	ODJReunion = oDJReunion;
	this.hrDebReunion = hrDebReunion;
	this.hrFinReunion = hrFinReunion;
	this.presReunion = presReunion;
	this.abscReunion = abscReunion;
	this.commReunion = commReunion;
	CRReunion = cRReunion;
}

}
