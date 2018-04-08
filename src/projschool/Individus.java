/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author frenzey
 */
public class Individus {
    
    public int idIndividu;
    private String nomIndividu;
    private String prenomIndividu;
    private String genreIndividu;
    private Date datNaisIndividu;
    private String lieuNaisIndividu;
    private String nivEtudIndividu;
    private String domEtudIndividu;
    private String profIndividu;
    private String domCompetIndividu;
    private String langMatIndividu;
    private String langParlIndividu;
    private String photoIndividu;
    private String rectoPIDIndividu;
    private String versoPIDIndividu;
  
    
    public Individus(){
    
}
    
    public Individus(int id, String nm, String pr, String gen, 
                    Date da, String lieu, String niv, String dome,
                    String prof, String domc, String lma, String lpa, String phot,
                    String rectp, String versp){
        
        this.idIndividu = id;
        this.nomIndividu = nm;
        this.prenomIndividu = pr;
        this.genreIndividu = gen;
        this.datNaisIndividu = da;
        this.lieuNaisIndividu = lieu;
        this.nivEtudIndividu = niv;
        this.domEtudIndividu = dome;
        this.profIndividu = prof;
        this.domCompetIndividu = domc;
        this.langMatIndividu= lma;
        this.langParlIndividu = lpa;
        this.photoIndividu = phot;
        this.rectoPIDIndividu = rectp;
        this.versoPIDIndividu = versp;
        
    }

    /**
     * @return the idIndividu
     */
    public int getIdIndividu() {
        return idIndividu;
    }

    /**
     * @param idIndividu the idIndividu to set
     */
    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
    }

    /**
     * @return the nomIndividu
     */
    public String getNomIndividu() {
        return nomIndividu;
    }

    /**
     * @param nomIndividu the nomIndividu to set
     */
    public void setNomIndividu(String nomIndividu) {
        this.nomIndividu = nomIndividu;
    }

    /**
     * @return the prenomIndividu
     */
    public String getPrenomIndividu() {
        return prenomIndividu;
    }

    /**
     * @param prenomIndividu the prenomIndividu to set
     */
    public void setPrenomIndividu(String prenomIndividu) {
        this.prenomIndividu = prenomIndividu;
    }

    /**
     * @return the genreIndividu
     */
    public String getGenreIndividu() {
        return genreIndividu;
    }

    /**
     * @param genreIndividu the genreIndividu to set
     */
    public void setGenreIndividu(String genreIndividu) {
        this.genreIndividu = genreIndividu;
    }

    /**
     * @return the datNaisIndividu
     */
    public Date getDatNaisIndividu() {
        return datNaisIndividu;
    }

    /**
     * @param datNaisIndividu the datNaisIndividu to set
     */
    public void setDatNaisIndividu(Date datNaisIndividu) {
        this.datNaisIndividu = datNaisIndividu;
    }

    /**
     * @return the lieuNaisIndividu
     */
    public String getLieuNaisIndividu() {
        return lieuNaisIndividu;
    }

    /**
     * @param lieuNaisIndividu the lieuNaisIndividu to set
     */
    public void setLieuNaisIndividu(String lieuNaisIndividu) {
        this.lieuNaisIndividu = lieuNaisIndividu;
    }

    /**
     * @return the nivEtudIndividu
     */
    public String getNivEtudIndividu() {
        return nivEtudIndividu;
    }

    /**
     * @param nivEtudIndividu the nivEtudIndividu to set
     */
    public void setNivEtudIndividu(String nivEtudIndividu) {
        this.nivEtudIndividu = nivEtudIndividu;
    }

    /**
     * @return the domEtudIndividu
     */
    public String getDomEtudIndividu() {
        return domEtudIndividu;
    }

    /**
     * @param domEtudIndividu the domEtudIndividu to set
     */
    public void setDomEtudIndividu(String domEtudIndividu) {
        this.domEtudIndividu = domEtudIndividu;
    }

    /**
     * @return the profIndividu
     */
    public String getProfIndividu() {
        return profIndividu;
    }

    /**
     * @param profIndividu the profIndividu to set
     */
    public void setProfIndividu(String profIndividu) {
        this.profIndividu = profIndividu;
    }

    /**
     * @return the domCompetIndividu
     */
    public String getDomCompetIndividu() {
        return domCompetIndividu;
    }

    /**
     * @param domCompetIndividu the domCompetIndividu to set
     */
    public void setDomCompetIndividu(String domCompetIndividu) {
        this.domCompetIndividu = domCompetIndividu;
    }

    /**
     * @return the langMatIndividu
     */
    public String getLangMatIndividu() {
        return langMatIndividu;
    }

    /**
     * @param langMatIndividu the langMatIndividu to set
     */
    public void setLangMatIndividu(String langMatIndividu) {
        this.langMatIndividu = langMatIndividu;
    }

    /**
     * @return the langParlIndividu
     */
    public String getLangParlIndividu() {
        return langParlIndividu;
    }

    /**
     * @param langParlIndividu the langParlIndividu to set
     */
    public void setLangParlIndividu(String langParlIndividu) {
        this.langParlIndividu = langParlIndividu;
    }

    /**
     * @return the photoIndividu
     */
    public String getPhotoIndividu() {
        return photoIndividu;
    }

    /**
     * @param photoIndividu the photoIndividu to set
     */
    public void setPhotoIndividu(String photoIndividu) {
        this.photoIndividu = photoIndividu;
    }

    /**
     * @return the rectoPIDIndividu
     */
    public String getRectoPIDIndividu() {
        return rectoPIDIndividu;
    }

    /**
     * @param rectoPIDIndividu the rectoPIDIndividu to set
     */
    public void setRectoPIDIndividu(String rectoPIDIndividu) {
        this.rectoPIDIndividu = rectoPIDIndividu;
    }

    /**
     * @return the versoPIDIndividu
     */
    public String getVersoPIDIndividu() {
        return versoPIDIndividu;
    }

    /**
     * @param versoPIDIndividu the versoPIDIndividu to set
     */
    public void setVersoPIDIndividu(String versoPIDIndividu) {
        this.versoPIDIndividu = versoPIDIndividu;
    }
    
    
    
    
    
    
}
