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
public abstract class Computador {

    private int id;
    private String ram;
    private String procesador;
    private String discoDuro;
    private int precio;

    public Computador(int id, String ram, String procesador, String discoDuro, int precio) {
        this.id = id;
        this.ram = ram;
        this.procesador = procesador;
        this.discoDuro = discoDuro;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
