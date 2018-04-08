package Classes;

import java.util.ArrayList;

public class Documents {
	private int idDocument; 
	private Documents(int idDocument, int idSupport, int idTypeDoc, String libelDocument, String versionDocument,
			String mediaDocument, int nbrPagNBDocument, int nbrPagCoulDocument, String reliureDocument,
			ArrayList texteDocument, String couvDocument) {
		super();
		this.idDocument = idDocument;
		this.idSupport = idSupport;
		this.idTypeDoc = idTypeDoc;
		this.libelDocument = libelDocument;
		this.versionDocument = versionDocument;
		this.mediaDocument = mediaDocument;
		this.nbrPagNBDocument = nbrPagNBDocument;
		this.nbrPagCoulDocument = nbrPagCoulDocument;
		this.reliureDocument = reliureDocument;
		this.texteDocument = texteDocument;
		this.couvDocument = couvDocument;
	}
	private int idSupport;
	private int idTypeDoc ;
	private String libelDocument ;
	private String versionDocument ;
	private String mediaDocument ;
	private int nbrPagNBDocument ;
	private int nbrPagCoulDocument ;
	private String reliureDocument ;
	private ArrayList texteDocument = new ArrayList() ; 
	private String couvDocument ;
	private int getIdDocument() {
		return idDocument;
	}
	private void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}
	private int getIdSupport() {
		return idSupport;
	}
	private void setIdSupport(int idSupport) {
		this.idSupport = idSupport;
	}
	private int getIdTypeDoc() {
		return idTypeDoc;
	}
	private void setIdTypeDoc(int idTypeDoc) {
		this.idTypeDoc = idTypeDoc;
	}
	private String getLibelDocument() {
		return libelDocument;
	}
	private void setLibelDocument(String libelDocument) {
		this.libelDocument = libelDocument;
	}
	private String getVersionDocument() {
		return versionDocument;
	}
	private void setVersionDocument(String versionDocument) {
		this.versionDocument = versionDocument;
	}
	private String getMediaDocument() {
		return mediaDocument;
	}
	private void setMediaDocument(String mediaDocument) {
		this.mediaDocument = mediaDocument;
	}
	private int getNbrPagNBDocument() {
		return nbrPagNBDocument;
	}
	private void setNbrPagNBDocument(int nbrPagNBDocument) {
		this.nbrPagNBDocument = nbrPagNBDocument;
	}
	private int getNbrPagCoulDocument() {
		return nbrPagCoulDocument;
	}
	private void setNbrPagCoulDocument(int nbrPagCoulDocument) {
		this.nbrPagCoulDocument = nbrPagCoulDocument;
	}
	private String getReliureDocument() {
		return reliureDocument;
	}
	private void setReliureDocument(String reliureDocument) {
		this.reliureDocument = reliureDocument;
	}
	private ArrayList getTexteDocument() {
		return texteDocument;
	}
	private void setTexteDocument(ArrayList texteDocument) {
		this.texteDocument = texteDocument;
	}
	private String getCouvDocument() {
		return couvDocument;
	}
	private void setCouvDocument(String couvDocument) {
		this.couvDocument = couvDocument;
	}
	
	
	
}
