/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class user {
    
    private int userid;
    private String email;
    private String password;
    private boolean premium;

    public user() {
    }

    public user(int userid, String email, String password, boolean premium) {
        this.userid = userid;
        this.email = email;
        this.password = password;
        this.premium = premium;
    }
    public user( String email, String password, boolean premium) {
        this.email = email;
        this.password = password;
        this.premium = premium;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    
    
    
}
