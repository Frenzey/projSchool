/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import java.util.Date;
/**
 *
 * @author frenzey
 */
public class contrats {
    
    private int idContrat;
    /*private int idStaut;
    private int idFonction;
    private int idIndividu;*/
    private String libelContrat;
    private Date dateEntrContrat;
    private Date datesortContrat;
    private float salaireContrat;
    private float indemnitéContrat;
    private String materielContrat;
    private String contratContrat;

    public contrats() {
    }

    public contrats(int idContrat, String libelContrat, Date dateEntrContrat, Date datesortContrat, float salaireContrat, float indemnitéContrat, String materielContrat, String contratContrat) {
        this.idContrat = idContrat;
        this.libelContrat = libelContrat;
        this.dateEntrContrat = dateEntrContrat;
        this.datesortContrat = datesortContrat;
        this.salaireContrat = salaireContrat;
        this.indemnitéContrat = indemnitéContrat;
        this.materielContrat = materielContrat;
        this.contratContrat = contratContrat;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public String getLibelContrat() {
        return libelContrat;
    }

    public void setLibelContrat(String libelContrat) {
        this.libelContrat = libelContrat;
    }

    public Date getDateEntrContrat() {
        return dateEntrContrat;
    }

    public void setDateEntrContrat(Date dateEntrContrat) {
        this.dateEntrContrat = dateEntrContrat;
    }

    public Date getDatesortContrat() {
        return datesortContrat;
    }

    public void setDatesortContrat(Date datesortContrat) {
        this.datesortContrat = datesortContrat;
    }

    public float getSalaireContrat() {
        return salaireContrat;
    }

    public void setSalaireContrat(float salaireContrat) {
        this.salaireContrat = salaireContrat;
    }

    public float getIndemnitéContrat() {
        return indemnitéContrat;
    }

    public void setIndemnitéContrat(float indemnitéContrat) {
        this.indemnitéContrat = indemnitéContrat;
    }

    public String getMaterielContrat() {
        return materielContrat;
    }

    public void setMaterielContrat(String materielContrat) {
        this.materielContrat = materielContrat;
    }

    public String getContratContrat() {
        return contratContrat;
    }

    public void setContratContrat(String contratContrat) {
        this.contratContrat = contratContrat;
    }
    
    
}
