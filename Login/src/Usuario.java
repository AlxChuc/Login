/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Usuario {
    private String username;
    private String password;
    private String correo;
    private int intentos;

    public Usuario(String username, String password, String correo) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.intentos = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    
    
}
