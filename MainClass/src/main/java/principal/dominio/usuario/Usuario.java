/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.dominio.usuario;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private int id;
    private String correoElectronico;
    private String clave;

    public Usuario() {
    }

    public Usuario(int id, String correoElectronico, String clave) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", clave=" + clave + '}';
    }
    
    
    
}
