/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.proyecto.referencias;

/**
 *
 * @author Jan Jan
 */
public class publicaciones {

    public int Idp;
    public String Nombre;
    public String Editorial;
    public int Edicion;
    public String Lugar;
    public int Año;
    public String Paginas;
    public int Autorid;

    public int getAutorid() {
        return Autorid;
    }

    public void setAutorid(int Autorid) {
        this.Autorid = Autorid;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getIdp() {
        return Idp;
    }

    public void setIdp(int Idp) {
        this.Idp = Idp;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaginas() {
        return Paginas;
    }

    public void setPaginas(String Paginas) {
        this.Paginas = Paginas;
    }

 @Override
    public String toString() {
        return "Publicación{" + "id=" + Idp + "," + Nombre + "," + Editorial + "," + Edicion + Lugar + "," + Año + "," + Paginas + '}';
    }

    public void Idp(int Idp) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    
}
