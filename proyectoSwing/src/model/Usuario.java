/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;


/**
 *
 * @author Windows
 */
public class Usuario {
    int id;
    String nombre;
    String usuario;
    String contraseña;
    int edad;

    public Usuario(){
    }
    public Usuario(int id, String nombre, String usuario, String contraseña, int edad) {
        this.id=id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }
    public Usuario (ResultSet rs){
        try {
        this.id=rs.getInt("id");
        this.nombre=rs.getString("nombre");
        this.usuario=rs.getString("usuario");
        this.contraseña=rs.getString("contraseña");
        this.edad=rs.getInt("edad");
        } catch (Exception e) {
        }
        
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + '}';
    }

    
    
}
