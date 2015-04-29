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
        String query = "Select Idp, Nombre, Editorial, Edición, Lugar, Año, Paginas from publicaciones;";
        Connection cn = Conexion.getConexion();
        try {
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int Idp = rs.getInt(1);
                String Nombre = rs.getString(2);
                String Editorial = rs.getString(3);
                String Edición = rs.getString(4);
                String Lugar = rs.getString(5);
                int Año = rs.getInt(6);
                String Paginas = rs.getString(7);

                publicaciones a = new publicaciones();
                a.Idp(Idp);
                a.Nombre(Nombre);
                a.Editorial(Editorial);
                a.Edicion(Edición);
                a.Lugar(Lugar);
                a.Año(Año);
                a.Paginas(Paginas);

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
