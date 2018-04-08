package project;

public class typeDocs {
	private int idtypeDoc;
	private String libeltypeDoc;
	private typeDocs(int idtypeDoc, String libeltypeDoc) {
		super();
		this.idtypeDoc = idtypeDoc;
		this.libeltypeDoc = libeltypeDoc;
	}
	private int getIdtypeDoc() {
		return idtypeDoc;
	}
	private void setIdtypeDoc(int idtypeDoc) {
		this.idtypeDoc = idtypeDoc;
	}
	private String getLibeltypeDoc() {
		return libeltypeDoc;
	}
	private void setLibeltypeDoc(String libeltypeDoc) {
		this.libeltypeDoc = libeltypeDoc;
	}
	

}
