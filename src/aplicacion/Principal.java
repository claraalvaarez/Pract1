/**
 * @author Clara Alvarez
 * La clase Principal contiene el método main para ejecutar el programa.
 */
package aplicacion;

import mates.Matematicas;

public class Principal {
    /**
     * Método principal para calcular una aproximación de pi utilizando el método de Montecarlo.
     *
     * @param args el número de pasos para generar puntos
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe proporcionar el número de pasos como argumento.");
            return;
        }

        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(pasos));
    }
}
