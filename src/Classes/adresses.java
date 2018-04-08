/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author frenzey
 */
public class adresses {
    
    public int idAdresse;
    /*private int idIndividu;
    Individus i = new Individus();
    this.idIndividu = i.getIdIndividu();**/
    private String batAdresse;
    private int noAdresse;
    private int rueAdresse;
    private int cpAdresse;
    private String villeAdresse;
    private String paysAdresse;
    
    
    
    public adresses(){
        
    }
    
    public adresses(int idadr,/** int idindiv,**/ String bat, int noa,
                    int rue, int cp, String v, String p){
        this.idAdresse = idadr;
        this.batAdresse = bat;
        this.noAdresse = noa;
        this.rueAdresse = rue;
        this.cpAdresse = cp;
        this.villeAdresse = v;
        this.paysAdresse = p;
        
    }

    /**
     * @return the idAdresse
     */
    public int getIdAdresse() {
        return idAdresse;
    }

    /**
     * @param idAdresse the idAdresse to set
     */
    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }


    /**
     * @return the batAdresse
     */
    public String getBatAdresse() {
        return batAdresse;
    }

    /**
     * @param batAdresse the batAdresse to set
     */
    public void setBatAdresse(String batAdresse) {
        this.batAdresse = batAdresse;
    }

    /**
     * @return the noAdresse
     */
    public int getNoAdresse() {
        return noAdresse;
    }

    /**
     * @param noAdresse the noAdresse to set
     */
    public void setNoAdresse(int noAdresse) {
        this.noAdresse = noAdresse;
    }

    /**
     * @return the rueAdresse
     */
    public int getRueAdresse() {
        return rueAdresse;
    }

    /**
     * @param rueAdresse the rueAdresse to set
     */
    public void setRueAdresse(int rueAdresse) {
        this.rueAdresse = rueAdresse;
    }

    /**
     * @return the cpAdresse
     */
    public int getCpAdresse() {
        return cpAdresse;
    }

    /**
     * @param cpAdresse the cpAdresse to set
     */
    public void setCpAdresse(int cpAdresse) {
        this.cpAdresse = cpAdresse;
    }

    /**
     * @return the villeAdresse
     */
    public String getVilleAdresse() {
        return villeAdresse;
    }

    /**
     * @param villeAdresse the villeAdresse to set
     */
    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    /**
     * @return the paysAdresse
     */
    public String getPaysAdresse() {
        return paysAdresse;
    }

    /**
     * @param paysAdresse the paysAdresse to set
     */
    public void setPaysAdresse(String paysAdresse) {
        this.paysAdresse = paysAdresse;
    }
}
