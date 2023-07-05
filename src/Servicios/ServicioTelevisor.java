/*
----------------------------------------------------------------------------------------------------------------------------
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
----------------------------------------------------------------------------------------------------------------------------
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

public class ServicioTelevisor extends ServicioElectrodomestico {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    public Televisor crearTelevisor() {

        System.out.println("Creando televisor");
        Electrodomestico electrodomestico = crearElectrodomestico();
        
        System.out.println("Ingrese la resolución en pulgadas:");
        int resolucion = lector.nextInt();
        
        System.out.println("¿Tiene sintonizador TDT? (true = si, false = no)");
        boolean sintonizadorTDT = lector.nextBoolean();

        Televisor televisor = new Televisor();
        televisor.setPrecio(electrodomestico.getPrecio());
        televisor.setPeso(electrodomestico.getPeso());
        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        televisor.setColor(electrodomestico.getColor());
        televisor.setResolucion(resolucion);
        televisor.setSintonizadorTDT(sintonizadorTDT);

        double precio = precioFinal(televisor);
        televisor.setPrecio(precio);

        return televisor;
    }

    public double precioFinal(Televisor televisor) {

        double precio = super.precioFinal(televisor);

        if (televisor.getResolucion() > 40) {
            precio += precio * 0.3;
        }
        
        if (televisor.isSintonizadorTDT()) {
            precio += 500;
        }

        return precio;
    }
}
