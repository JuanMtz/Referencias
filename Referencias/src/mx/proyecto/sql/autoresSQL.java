/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.proyecto.sql;

/**
 *
 * @author Jan Jan
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mx.proyecto.referencias.autores;
import mx.proyecto.utilidades.Conexion;

public class autoresSQL {
  public static List<autores> obtenerautores() {
        List<autores> lstautores = new ArrayList<autores>();
        String query = "SELECT Autorid, Apellido_P, Apellido_M from autores;;";
        Connection cn = Conexion.getConexion();
        try {
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int Autorid = rs.getInt(1);
                String Apellido_P = rs.getString(2);
                String Apellido_M = rs.getString(3);
                
                autores a = new autores();
                a.setApellido_P(Apellido_P);
                a.setApellido_M(Apellido_M);
                a.setAutorid(Autorid);
                lstautores.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstautores;
    }

    public static void main(String[] args) {
        List<autores> lstautores = obtenerautores();
        for (autores autores : lstautores) {
            System.out.println(autores);
        }
    }

}
