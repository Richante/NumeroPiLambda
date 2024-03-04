/**
 * Proporciona métodos para el cálculo del número PI mediante el método de Montecarlo.
 */
package mates;

import java.util.Random;

/**
 * La clase Matematicas contiene métodos para realizar cálculos del número PI utilizando el método de Montecarlo.
 */

public class Matematicas {

    /**
 * Genera una aproximación al número PI de manera recursiva mediante el método de Montecarlo.
 *
 * @param pasos La cantidad de iteraciones para el cálculo.
 * @param puntosDentroCirculo La cantidad de puntos generados que caen dentro del círculo.
 * @param puntosGenerados La cantidad total de puntos generados.
 * @return La aproximación al número PI.
 */
    
    public static double generarNumeroPiRecursivo(long pasos, int puntosDentroCirculo, int puntosGenerados) {
        
        if (puntosGenerados == pasos) {
            return 4.0 * puntosDentroCirculo / puntosGenerados;
        }
        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();
        if (x * x + y * y <= 1) {
            return generarNumeroPiRecursivo(pasos, puntosDentroCirculo + 1, puntosGenerados + 1);
        } else {
            return generarNumeroPiRecursivo(pasos, puntosDentroCirculo, puntosGenerados + 1);
        }
    }
    }

