/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navesAlianza;

/**
 *
 * @author USUARIO
 */
public abstract class Nave {
    protected String tipo;
    protected int numPasajeros;
    protected double combustibleParsec;
    protected double numNaves;

    public Nave(String tipo, int numPasajeros, double combustibleParsec, double numNaves) {
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
        this.combustibleParsec = combustibleParsec;
        this.numNaves = numNaves;
    }
    
    

}
