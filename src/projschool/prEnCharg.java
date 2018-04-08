/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

/**
 *
 * @author frenzey
 */
public class prEnCharg {
    
    private int idPrEnCharg;
    private String libelPrEnCharg;
    private float montantPrEnCharg;
    private String referPrEnCharg;
    private boolean validPrEnCharg;

    public prEnCharg() {
    }

    public prEnCharg(int idPrEnCharg, String libelPrEnCharg, float montantPrEnCharg, String referPrEnCharg, boolean validPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
        this.libelPrEnCharg = libelPrEnCharg;
        this.montantPrEnCharg = montantPrEnCharg;
        this.referPrEnCharg = referPrEnCharg;
        this.validPrEnCharg = validPrEnCharg;
    }

    public int getIdPrEnCharg() {
        return idPrEnCharg;
    }

    public void setIdPrEnCharg(int idPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
    }

    public String getLibelPrEnCharg() {
        return libelPrEnCharg;
    }

    public void setLibelPrEnCharg(String libelPrEnCharg) {
        this.libelPrEnCharg = libelPrEnCharg;
    }

    public float getMontantPrEnCharg() {
        return montantPrEnCharg;
    }

    public void setMontantPrEnCharg(float montantPrEnCharg) {
        this.montantPrEnCharg = montantPrEnCharg;
    }

    public String getReferPrEnCharg() {
        return referPrEnCharg;
    }

    public void setReferPrEnCharg(String referPrEnCharg) {
        this.referPrEnCharg = referPrEnCharg;
    }

    public boolean isValidPrEnCharg() {
        return validPrEnCharg;
    }

    public void setValidPrEnCharg(boolean validPrEnCharg) {
        this.validPrEnCharg = validPrEnCharg;
    }
    
    
    
}
