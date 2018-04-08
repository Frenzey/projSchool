/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author frenzey
 */
public class materiels {
    
    private int idMateriel;
    private String libelMateriel;
    private String marqueMateriel;
    private String referMateriel;
    private Date dateAcquMateriel;
    private Date datePerteMateriel;
    private Date dateRemiseMateriel;
    private Date dateRestitMateriel;

    public materiels() {
    }

    public materiels(int idMateriel, String libelMateriel, String marqueMateriel, String referMateriel, Date dateAcquMateriel, Date datePerteMateriel, Date dateRemiseMateriel, Date dateRestitMateriel) {
        this.idMateriel = idMateriel;
        this.libelMateriel = libelMateriel;
        this.marqueMateriel = marqueMateriel;
        this.referMateriel = referMateriel;
        this.dateAcquMateriel = dateAcquMateriel;
        this.datePerteMateriel = datePerteMateriel;
        this.dateRemiseMateriel = dateRemiseMateriel;
        this.dateRestitMateriel = dateRestitMateriel;
    }

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    public String getLibelMateriel() {
        return libelMateriel;
    }

    public void setLibelMateriel(String libelMateriel) {
        this.libelMateriel = libelMateriel;
    }

    public String getMarqueMateriel() {
        return marqueMateriel;
    }

    public void setMarqueMateriel(String marqueMateriel) {
        this.marqueMateriel = marqueMateriel;
    }

    public String getReferMateriel() {
        return referMateriel;
    }

    public void setReferMateriel(String referMateriel) {
        this.referMateriel = referMateriel;
    }

    public Date getDateAcquMateriel() {
        return dateAcquMateriel;
    }

    public void setDateAcquMateriel(Date dateAcquMateriel) {
        this.dateAcquMateriel = dateAcquMateriel;
    }

    public Date getDatePerteMateriel() {
        return datePerteMateriel;
    }

    public void setDatePerteMateriel(Date datePerteMateriel) {
        this.datePerteMateriel = datePerteMateriel;
    }

    public Date getDateRemiseMateriel() {
        return dateRemiseMateriel;
    }

    public void setDateRemiseMateriel(Date dateRemiseMateriel) {
        this.dateRemiseMateriel = dateRemiseMateriel;
    }

    public Date getDateRestitMateriel() {
        return dateRestitMateriel;
    }

    public void setDateRestitMateriel(Date dateRestitMateriel) {
        this.dateRestitMateriel = dateRestitMateriel;
    }
    
    
    
}
