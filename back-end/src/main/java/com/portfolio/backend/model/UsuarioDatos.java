
package com.portfolio.backend.model;

/**
 *
 * @author macab
 */
public class UsuarioDatos {
    private String email;
    private String password;

    public UsuarioDatos() {
    }

    public UsuarioDatos(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDatos{" + "email=" + email + ", password=" + password + '}';
    }
    
}
