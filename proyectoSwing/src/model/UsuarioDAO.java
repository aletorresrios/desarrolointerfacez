/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Windows
 */
public class UsuarioDAO {
    private final static Conexion con = new Conexion ();
    public static void crearUsuario(Usuario usuario){
        try {
            con.Conexion();
            String sql = "INSERT INTO usuarios VALUES (?, ?, ?, ?, ?)";
            PreparedStatement sentencia = con.conn1.prepareStatement(sql);
            sentencia.setInt(1, 0);
            sentencia.setString(2, usuario.getNombre());
            sentencia.setString(3, usuario.getUsuario());
            sentencia.setString(4, usuario.getContraseña());
            sentencia.setInt(5, usuario.getEdad());
            sentencia.execute();
            System.out.println("Usuario añadido con exito.");
            con.cerrarConexion();
        } catch (Exception e) {
        }
    }
    public static void actualizaContraseña(String usuario,String contraseñanueva){
        try {
            con.Conexion();
            String sql = "UPDATE usuarios SET contrasena = ? WHERE usuario = ?";
            PreparedStatement sentencia = con.conn1.prepareStatement(sql);
            sentencia.setString(1, contraseñanueva);
            sentencia.setString(2, usuario);
            sentencia.execute();
            con.cerrarConexion();
            System.out.println("Contraseña actualizada");
        } catch (SQLException e) {
            System.out.println("Error al actualizar la contraseña.");
            e.printStackTrace();
        }
    }
}
