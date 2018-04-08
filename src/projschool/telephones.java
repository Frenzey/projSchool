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
public class telephones {

     public String idTelephone;
    /*public int idIndividu;
    Individus t = new Individus();
    this.idIndividu = t.getIdIndividu();*/
    private String mobileTelephone;
    private String fixeTelephone;
    private String prenomContactTelephone;
    private String nomContactTelephone;
    private String mobileContactTelephone;
    private String fixeContactTelehone;
    private String lienContactTelephone;
    
    public telephones(String idTelephone, String mobileTelephone, String fixeTelephone, String prenomContactTelephone, String nomContactTelephone, String mobileContactTelephone, String fixeContactTelehone, String lienContactTelephone) {
        this.idTelephone = idTelephone;
        this.mobileTelephone = mobileTelephone;
        this.fixeTelephone = fixeTelephone;
        this.prenomContactTelephone = prenomContactTelephone;
        this.nomContactTelephone = nomContactTelephone;
        this.mobileContactTelephone = mobileContactTelephone;
        this.fixeContactTelehone = fixeContactTelehone;
        this.lienContactTelephone = lienContactTelephone;
    }
    
   
    
    
    public telephones(){
        
    }

    /**
     * @return the idTelephone
     */
    public String getIdTelephone() {
        return idTelephone;
    }

    /**
     * @param idTelephone the idTelephone to set
     */
    public void setIdTelephone(String idTelephone) {
        this.idTelephone = idTelephone;
    }

    /**
     * @return the mobileTelephone
     */
    public String getMobileTelephone() {
        return mobileTelephone;
    }

    /**
     * @param mobileTelephone the mobileTelephone to set
     */
    public void setMobileTelephone(String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }

    /**
     * @return the fixeTelephone
     */
    public String getFixeTelephone() {
        return fixeTelephone;
    }

    /**
     * @param fixeTelephone the fixeTelephone to set
     */
    public void setFixeTelephone(String fixeTelephone) {
        this.fixeTelephone = fixeTelephone;
    }

    /**
     * @return the prenomContactTelephone
     */
    public String getPrenomContactTelephone() {
        return prenomContactTelephone;
    }

    /**
     * @param prenomContactTelephone the prenomContactTelephone to set
     */
    public void setPrenomContactTelephone(String prenomContactTelephone) {
        this.prenomContactTelephone = prenomContactTelephone;
    }

    /**
     * @return the nomContactTelephone
     */
    public String getNomContactTelephone() {
        return nomContactTelephone;
    }

    /**
     * @param nomContactTelephone the nomContactTelephone to set
     */
    public void setNomContactTelephone(String nomContactTelephone) {
        this.nomContactTelephone = nomContactTelephone;
    }

    /**
     * @return the mobileContactTelephone
     */
    public String getMobileContactTelephone() {
        return mobileContactTelephone;
    }

    /**
     * @param mobileContactTelephone the mobileContactTelephone to set
     */
    public void setMobileContactTelephone(String mobileContactTelephone) {
        this.mobileContactTelephone = mobileContactTelephone;
    }

    /**
     * @return the fixeContactTelehone
     */
    public String getFixeContactTelehone() {
        return fixeContactTelehone;
    }

    /**
     * @param fixeContactTelehone the fixeContactTelehone to set
     */
    public void setFixeContactTelehone(String fixeContactTelehone) {
        this.fixeContactTelehone = fixeContactTelehone;
    }

    /**
     * @return the lienContactTelephone
     */
    public String getLienContactTelephone() {
        return lienContactTelephone;
    }

    /**
     * @param lienContactTelephone the lienContactTelephone to set
     */
    public void setLienContactTelephone(String lienContactTelephone) {
        this.lienContactTelephone = lienContactTelephone;
    }
    
    
    
}
    