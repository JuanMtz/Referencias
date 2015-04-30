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
import mx.proyecto.referencias.publicaciones;
import mx.proyecto.utilidades.Conexion;

public class publicacionesSQL {

     public static List<publicaciones> obtenerpublicaciones() {
        List<publicaciones> lstpublicaciones = new ArrayList<publicaciones>();
        String query = "Select Idp, Nombre, Editorial, Edicion, Lugar, Año, Paginas from publicaciones;";
        Connection cn = Conexion.getConexion();
        try {
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int Idp = rs.getInt(1);
                String Nombre = rs.getString(2);
                String Editorial = rs.getString(3);
                int Edicion = rs.getInt(4);
                String Lugar = rs.getString(5);
                int Año = rs.getInt(6);
                String Paginas = rs.getString(7);

                publicaciones a = new publicaciones();
                a.setIdp(Idp);
                a.setNombre(Nombre);
                a.setEditorial(Editorial);
                a.setEdicion(Edicion);
                a.setLugar(Lugar);
                a.setAño(Año);
                a.setPaginas(Paginas);


                lstpublicaciones.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstpublicaciones;
    }

    public static void main(String[] args) {
        List<publicaciones> lstpublicaciones = obtenerpublicaciones();
        for (publicaciones publicaciones : lstpublicaciones) {
            System.out.println(publicaciones);
        }
    }




}
