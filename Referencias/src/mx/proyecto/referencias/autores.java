/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.proyecto.referencias;

/**
 *
 * @author Jan Jan
 */
public class autores {

    public int Autorid;
    public String Apellido_P;
    public String Apellido_M;

    public String getApellido_M() {
        return Apellido_M;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public int getAutorid() {
        return Autorid;
    }

    public void setAutorid(int Autorid) {
        this.Autorid = Autorid;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + Autorid + "," + Apellido_P + "," + Apellido_M + '}';
    }


}
