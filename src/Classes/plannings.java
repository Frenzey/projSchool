package Classes;

public class plannings {
	private int idPlanning;
	private horaires horLunPlanning;
	private horaires horMarPlanning;
	private horaires horMerPlanning;
	private horaires horJeuPlanning;
	private horaires horVenPlanning;
	private horaires horSaPlanning;
	private horaires horDimPlanning;
	private String libelPlanning;
	
	private plannings(int idPlanning, horaires horLunPlanning, horaires horMarPlanning, horaires horMerPlanning,
			horaires horJeuPlanning, horaires horVenPlanning, horaires horSaPlanning, horaires horDimPlanning,
			String libelPlanning) {
		super();
		this.idPlanning = idPlanning;
		this.horLunPlanning = horLunPlanning;
		this.horMarPlanning = horMarPlanning;
		this.horMerPlanning = horMerPlanning;
		this.horJeuPlanning = horJeuPlanning;
		this.horVenPlanning = horVenPlanning;
		this.horSaPlanning = horSaPlanning;
		this.horDimPlanning = horDimPlanning;
		this.libelPlanning = libelPlanning;
	}

	private int getIdPlanning() {
		return idPlanning;
	}

	private void setIdPlanning(int idPlanning) {
		this.idPlanning = idPlanning;
	}

	private horaires getHorLunPlanning() {
		return horLunPlanning;
	}

	private void setHorLunPlanning(horaires horLunPlanning) {
		this.horLunPlanning = horLunPlanning;
	}

	private horaires getHorMarPlanning() {
		return horMarPlanning;
	}

	private void setHorMarPlanning(horaires horMarPlanning) {
		this.horMarPlanning = horMarPlanning;
	}

	private horaires getHorMerPlanning() {
		return horMerPlanning;
	}

	private void setHorMerPlanning(horaires horMerPlanning) {
		this.horMerPlanning = horMerPlanning;
	}

	private horaires getHorJeuPlanning() {
		return horJeuPlanning;
	}

	private void setHorJeuPlanning(horaires horJeuPlanning) {
		this.horJeuPlanning = horJeuPlanning;
	}

	private horaires getHorVenPlanning() {
		return horVenPlanning;
	}

	private void setHorVenPlanning(horaires horVenPlanning) {
		this.horVenPlanning = horVenPlanning;
	}

	private horaires getHorSaPlanning() {
		return horSaPlanning;
	}

	private void setHorSaPlanning(horaires horSaPlanning) {
		this.horSaPlanning = horSaPlanning;
	}

	private horaires getHorDimPlanning() {
		return horDimPlanning;
	}

	private void setHorDimPlanning(horaires horDimPlanning) {
		this.horDimPlanning = horDimPlanning;
	}

	private String getLibelPlanning() {
		return libelPlanning;
	}

	private void setLibelPlanning(String libelPlanning) {
		this.libelPlanning = libelPlanning;
	}
	
	
	


}
