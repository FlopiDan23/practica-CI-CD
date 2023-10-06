/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Enrico
 */
public class auto {
    public int modelo;
    public String marca;
    public int anio;

    public auto() {
    }

    public auto(int modelo, String marca, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "auto{" + "modelo=" + modelo + ", marca=" + marca + ", anio=" + anio + '}';
    }
    
            
}
