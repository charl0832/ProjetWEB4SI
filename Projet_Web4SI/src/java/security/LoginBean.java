package security;

import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@SessionScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username = "";
    private String password = "";
    
    //Type de l'utilisateur : Etudiant ou Enseignant : String ?
    private String type="";
    
    private boolean isLoggedIn;
    private boolean isRedirect;
    private String referer;

    public String checkLogin() {
        String url = "login.xhtml";

        // Normalement à partir du login on devrait demander à l'ejb
        // de chercher dans la BD et retourner un utilisateur qu'on 
        // met dans la session. Mais, ici on simule...
        if (username.equals("olivier") && password.equals("zimboum")) {
            isLoggedIn = true;
            if ("".equals(this.referer) || this.referer == null) {
                this.referer = "next.xhtml";
            }
            url = this.referer + "?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage("connexionForm:msgLogin", new FacesMessage("Problème de connexion"));
            setUsername("");
        }
        return url;
    }

    public void deconnexion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        setLoggedIn(false);
        doRedirect("login.xhtml");
    }

    public void verificationLogin(ComponentSystemEvent event) {
        this.referer = FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderMap().get("referer");
        if (!isLoggedIn && !isRedirect) {
            isRedirect = true;
            doRedirect("login.xhtml");
        } else {
            isRedirect = false;
        }
    }

    private void doRedirect(String url) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setIsRedirect() {
        this.isRedirect = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
}
