/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Ejb.IndexEJB;
import entity.Personne;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Elodie
 */
@Named
@SessionScoped

public class IndexMB implements Serializable {
    @Inject
    private IndexEJB indexEJB;
    private boolean isLoggedIn;
    private boolean isRedirect;
    private String login ;
    private String passwd ;
    private String est_prof ;
    private String referer;

    public String getEst_prof() {
        return est_prof;
    }

    public void setEst_prof(String est_prof) {
        this.est_prof = est_prof;
    }

    
    public String checkLogin() {
        String url = "index2.xhtml";
        
        if (indexEJB.verifLogin(login, passwd)) {
            if(est_prof.equals("true")) {
                isLoggedIn = true;
                if ("".equals(this.referer) || this.referer == null) {
                    this.referer = "ENS_index.xhtml";
                }
                url = this.referer + "?faces-redirect=true";               
            }
            else {
                isLoggedIn = true;
                if ("".equals(this.referer) || this.referer == null) {
                    this.referer = "ETU_index.xhtml";
                }
                url = this.referer + "?faces-redirect=true";               
            }
        }
        else {
            FacesContext.getCurrentInstance().addMessage("form_login:msgLogin", new FacesMessage("Problème de connexion"));
        }
        return url;
    }
    
      private void doRedirect(String url) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
