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
public class emails {
    
    public String idEmail;
    /*private int idIndividu;*/
    
    private String adresseEmail;
    private String frqUtlMailEmail;
    
    
    public emails(){
        
    }

    public emails(String idEmail, String adresseEmail, String frqUtlMailEmail) {
        this.idEmail = idEmail;
        this.adresseEmail = adresseEmail;
        this.frqUtlMailEmail = frqUtlMailEmail;
    }
    
      public String getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(String idEmail) {
        this.idEmail = idEmail;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public String getFrqUtlMailEmail() {
        return frqUtlMailEmail;
    }

    public void setFrqUtlMailEmail(String frqUtlMailEmail) {
        this.frqUtlMailEmail = frqUtlMailEmail;
    }
    
}
