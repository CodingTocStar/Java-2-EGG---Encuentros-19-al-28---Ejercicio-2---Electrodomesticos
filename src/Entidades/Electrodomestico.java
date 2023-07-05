/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: 
    precio, 
    color,
    consumo energético (letras entre A y F) y 
    peso.

Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.


Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Electrodomestico {
    //ATRIBUTOS
    protected double precio; 
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    //CONSTRUCTORES
    public Electrodomestico(){}

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //GETTER & SETTER

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

}
