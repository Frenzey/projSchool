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
public class affectations {
    
    private int idAffectation;
    /*private int idContrat*/
    private String trigrAffectation;
    private String loginAffectation;
    private String motPasseAffectation;
    private Date dateEntrAffectation;
    private Date datesortAffectation;
    private String commAffectation;
    private String ficheAffectation;
    private String referentAffectation;
    private boolean validAffectation;

    public affectations() {
    }

    public affectations(int idAffectation, String trigrAffectation, String loginAffectation, String motPasseAffectation, Date dateEntrAffectation, Date datesortAffectation, String commAffectation, String ficheAffectation, String referentAffectation, boolean validAffectation) {
        this.idAffectation = idAffectation;
        this.trigrAffectation = trigrAffectation;
        this.loginAffectation = loginAffectation;
        this.motPasseAffectation = motPasseAffectation;
        this.dateEntrAffectation = dateEntrAffectation;
        this.datesortAffectation = datesortAffectation;
        this.commAffectation = commAffectation;
        this.ficheAffectation = ficheAffectation;
        this.referentAffectation = referentAffectation;
        this.validAffectation = validAffectation;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }

    public String getTrigrAffectation() {
        return trigrAffectation;
    }

    public void setTrigrAffectation(String trigrAffectation) {
        this.trigrAffectation = trigrAffectation;
    }

    public String getLoginAffectation() {
        return loginAffectation;
    }

    public void setLoginAffectation(String loginAffectation) {
        this.loginAffectation = loginAffectation;
    }

    public String getMotPasseAffectation() {
        return motPasseAffectation;
    }

    public void setMotPasseAffectation(String motPasseAffectation) {
        this.motPasseAffectation = motPasseAffectation;
    }

    public Date getDateEntrAffectation() {
        return dateEntrAffectation;
    }

    public void setDateEntrAffectation(Date dateEntrAffectation) {
        this.dateEntrAffectation = dateEntrAffectation;
    }

    public Date getDatesortAffectation() {
        return datesortAffectation;
    }

    public void setDatesortAffectation(Date datesortAffectation) {
        this.datesortAffectation = datesortAffectation;
    }

    public String getCommAffectation() {
        return commAffectation;
    }

    public void setCommAffectation(String commAffectation) {
        this.commAffectation = commAffectation;
    }

    public String getFicheAffectation() {
        return ficheAffectation;
    }

    public void setFicheAffectation(String ficheAffectation) {
        this.ficheAffectation = ficheAffectation;
    }

    public String getReferentAffectation() {
        return referentAffectation;
    }

    public void setReferentAffectation(String referentAffectation) {
        this.referentAffectation = referentAffectation;
    }

    public boolean isValidAffectation() {
        return validAffectation;
    }

    public void setValidAffectation(boolean validAffectation) {
        this.validAffectation = validAffectation;
    }
    
    
    
}
