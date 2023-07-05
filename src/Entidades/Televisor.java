/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.


Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Televisor extends Electrodomestico {
    //ATRIBUTOS
    protected int resolucion;
    protected boolean sintonizadorTDT;
    
    
    //CONSTRUCTORES
    public Televisor(){}
    
    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    //GETTER & SETTER

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
