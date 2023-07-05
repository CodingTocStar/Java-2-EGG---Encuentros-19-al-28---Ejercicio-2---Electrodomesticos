package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

/*
==============================================================
 */
public class ServicioElectrodomestico {

    //herramientas
    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    /*
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public char comprobarConsumoEnergetico(char letra) {

        letra = Character.toUpperCase(letra);
        
        if (letra < 'A' || letra > 'F') {
            letra = 'F';
            return letra;
        } else {
            return letra;
        }
    }


    /*----------------------------------------------------------------------------------------------------------------------------
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public String comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }


    /*----------------------------------------------------------------------------------------------------------------------------
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    
    
    public double precioFinal(Electrodomestico electrodomestico) {

        double precio = 1000;

        switch (Character.toUpperCase(electrodomestico.getConsumoEnergetico())) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
            default:
                precio += 0; // Otra opción por si el consumo no coincide con ninguna letra válida
                break;
        }

        /*PESO PRECIO
            Entre 1 y 19 kg $100
            Entre 20 y 49 kg $500
            Entre 50 y 79 kg $800
            Mayor que 80 kg $1000*/
        double peso= electrodomestico.getPeso();
        
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else if (peso > 80) {
            precio += 1000;
        }

    return precio ;

}

    
/*----------------------------------------------------------------------------------------------------------------------------
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public Electrodomestico crearElectrodomestico() {

        System.out.println("Que nivel de consumo quiere?   A | B | C | D | E | F");
        char consumoEnergetico = lector.next().charAt(0);
        consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
//--------------------------------------------------------------------------------------------------------------
        System.out.println("Que color elige? Disponibles:  blanco | negro | rojo | azul | gris");
        String color = lector.next();
        color = comprobarColor(color);
//--------------------------------------------------------------------------------------------------------------        
        System.out.println("Cuanto es el peso del equipo?");
        double peso = lector.nextDouble();    
//--------------------------------------------------------------------------------------------------------------        
//creo el electrodomestico

       Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.setConsumoEnergetico(consumoEnergetico);
        electrodomestico.setColor(color);
        electrodomestico.setPeso(peso);
        
        double precioFinal = precioFinal(electrodomestico);
        electrodomestico.setPrecio(precioFinal);
        
        return electrodomestico;
    }
    
}