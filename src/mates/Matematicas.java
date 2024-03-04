package mates;

import java.util.Random;

/**
 * La clase Matematicas contiene el método generarNumeroPiExpresionesLambda que genera una
 * aproximación al número PI mediante el método de Montecarlo utilizando expresiones lambda.
 */

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiExpresionesLambda(long pasos){

        try{
            Random rand = new Random();

            long aciertos = rand.longs(pasos)
                                 .parallel() // Ejecución en paralelo
                                 .filter(i -> { // Filtra los puntos mediante una expresión lambda
                                     double x = rand.nextDouble();
                                     double y = rand.nextDouble();
                                     return Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2) <= 0.25;
                                 })
                                 .count(); // Cuenta los puntos que han pasado el filtro
    
            return 4.0 * aciertos / pasos;
        }catch(Exception e){ // Captura cualquier excepción que se produzca en caso de fallo
            throw new RuntimeException("No se ha podido generar el Pi");
        }
    }
}
