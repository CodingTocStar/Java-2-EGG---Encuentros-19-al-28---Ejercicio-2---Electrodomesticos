/*
----------------------------------------------------------------------------------------------------------------------------
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
----------------------------------------------------------------------------------------------------------------------------
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioLavadora extends ServicioElectrodomestico {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
        padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
        el atributo propio de la lavadora.
     */
    public Lavadora crearLavadora() {

        //Electrodomestico electrodomestico =  new Electrodomestico();
        
        //Electrodomestico electrodomestico = super.crearElectrodomestico(); // uso herencia y traigo el metodo de crear electrodomestico
        System.out.println("Creando lavadora");
        Electrodomestico electrodomestico = crearElectrodomestico();      // uso herencia y traigo el metodo de crear electrodomestico
//--------------------------------------------------------------------------------------------------------------
        System.out.println("Que carga elige? En Kg:");
        int carga = lector.nextInt();
//--------------------------------------------------------------------------------------------------------------
// creo la lavadora
        Lavadora miLavadora = new Lavadora();

        //seteando las caracteristicas
        miLavadora.setColor(electrodomestico.getColor());   //del electrodomestico creado con el metodo del padre sale el codigo usando anteriormente y traigo el color que va a tener electrodomestico
        miLavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        miLavadora.setPeso(electrodomestico.getPeso());
        miLavadora.setCarga(carga);

        //ASIGNO EL PRECIO FINAL --> me tocoseo con si no estoy sumando de vuelta el precio final
        double precio = precioFinal(miLavadora);
        
        miLavadora.setPrecio(precio);

        return miLavadora;
    }

    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
     */
    public double precioFinal(Lavadora miLavadora) { // lavadora es hija de electrodomestico, asi que por eso lo debe tomar supongo.

        double precio = super.precioFinal(miLavadora); // traigo el precio de la lavadora con la clase padre por las caracteristicas heredadas

        //super.precioFinal(miLavadora);  //  uso el metodo heredado 

        if (miLavadora.getCarga() > 30) {
            
            //precio = miLavadora.getPrecio();
            precio += 500;

        }
        return precio;
    }
}
