package aplicacion;

import mates.Matematicas;

/**
 * La clase Principal contiene el método principal (main) que utiliza la clase Matematicas
 * para generar una aproximación al número PI mediante el método de Montecarlo.
 */
public class Principal {

    /**
     * Método principal que imprime la aproximación al número PI utilizando el método de Montecarlo.
     *
     * @param args El argumento de línea de comandos que representa la cantidad de iteraciones
     *             para el método de Montecarlo.
     */
    public static void main(String[] args) {
        // Imprime la aproximación al número PI utilizando el método de Montecarlo con expresiones lambda
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiExpresionesLambda(Integer.parseInt(args[0])));
    }
}


