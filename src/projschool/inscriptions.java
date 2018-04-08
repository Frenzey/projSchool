/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

import java.util.ArrayList;
import java.util.Date;
import java.util.Date;
/**
 *
 * @author frenzey
 */
public class inscriptions {
    
    private int idInscription;
    private ArrayList<etudiants> LesEtudiants = new ArrayList<etudiants>();
    private int idPaiement;
    private int idPrEnCharg;
    private Date dateInscription;
    private Date dateAbandInscription;
    private Date dateAnnulInscription;
    private float creditInscription;

    public inscriptions() {
    }

    public inscriptions(int idInscription, int idPaiement, int idPrEnCharg, Date dateInscription, Date dateAbandInscription, Date dateAnnulInscription, float creditInscription) {
        this.idInscription = idInscription;
        this.idPaiement = idPaiement;
        this.idPrEnCharg = idPrEnCharg;
        this.dateInscription = dateInscription;
        this.dateAbandInscription = dateAbandInscription;
        this.dateAnnulInscription = dateAnnulInscription;
        this.creditInscription = creditInscription;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public int getIdPrEnCharg() {
        return idPrEnCharg;
    }

    public void setIdPrEnCharg(int idPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateAbandInscription() {
        return dateAbandInscription;
    }

    public void setDateAbandInscription(Date dateAbandInscription) {
        this.dateAbandInscription = dateAbandInscription;
    }

    public Date getDateAnnulInscription() {
        return dateAnnulInscription;
    }

    public void setDateAnnulInscription(Date dateAnnulInscription) {
        this.dateAnnulInscription = dateAnnulInscription;
    }

    public float getCreditInscription() {
        return creditInscription;
    }

    public void setCreditInscription(float creditInscription) {
        this.creditInscription = creditInscription;
    }
    
    
    
}
