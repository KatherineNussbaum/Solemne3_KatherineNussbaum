/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne3_katherinenussbaum.clases;

/**
 *
 * @author knussbaum
 */
public class Notebook extends Computador{
    private String dimensionesPantalla;
    private int peso;

    public Notebook(int id, String ram, String procesador, String discoDuro, int precio, String dimensionesPantalla, int peso) {
        super(id, ram, procesador, discoDuro, precio);
        this.dimensionesPantalla = dimensionesPantalla;
        this.peso = peso;
    }

    public String getDimensionesPantalla() {
        return dimensionesPantalla;
    }

    public void setDimensionesPantalla(String dimensionesPantalla) {
        this.dimensionesPantalla = dimensionesPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        
        return super.toString() +", Notebook, " + "Dimensiones Pantalla= " + dimensionesPantalla + ", Peso en gr.= " + peso;
    }
    
    
}
