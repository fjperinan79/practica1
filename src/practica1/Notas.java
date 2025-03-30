package practica1;

import java.util.Scanner;

/**
 * Clase que permite gestionar las notas de un estudiante.
 * Incluye ingreso de notas, comprobación, cálculo y visualización de resultados.
 * @author Francisco Javier Periñán Delgado
 * @version 1.0
 * @since 2025-03-27
 */
public class Notas {

    /** Nota de la unidad formativa 1 */
    double uf_1;
    /** Nota de la unidad formativa 2 */
    double uf_2;
    /** Nota de la unidad formativa 3 */
    double uf_3;

    /** Acumulado 1 correspondiente al 35% de uf_1 */
    double acu1;
    /** Acumulado 2 correspondiente al 35% de uf_2 */
    double acu2;
    /** Acumulado 3 correspondiente al 30% de uf_3 */
    double acu3;
    /** Nota definitiva */
    double def;

    /** Scanner para leer datos desde el teclado */
    Scanner entrada = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante desde consola.
     */
    public void IngresaNotas() {
        System.out.println("ingrese las notas del estudiante");
        System.out.print("ingrese nota 1: ");
        uf_1 = entrada.nextDouble();

        System.out.print("ingrese nota 2: ");
        uf_2 = entrada.nextDouble();

        System.out.print("ingrese nota 3: ");
        uf_3 = entrada.nextDouble();
    }

    /**
     * Método que comprueba si las notas introducidas están dentro del rango válido (0 a 10).
     */
    public void comprobacion() {
        if (uf_1 > 10) {
            System.out.println(" nota1 mal introducida");
        } else {
            System.out.println(" nota1 correcta");
        }

        if (uf_2 > 10) {
            System.out.println(" nota2 mal introducida");
        } else {
            System.out.println(" nota2 correcta");
        }

        if (uf_3 > 10) {
            System.out.println(" nota3 mal introducida");
        } else {
            System.out.println(" nota3 correcta");
        }
    }

    /**
     * Método que calcula la nota definitiva a partir de los acumulados de cada unidad formativa.
     */
    public void Calculonotas() {
        acu1 = uf_1 * 0.35;
        acu2 = uf_2 * 0.35;
        acu3 = uf_3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Método que muestra por consola todas las notas introducidas, acumulados y la nota definitiva.
     */
    public void Mostrar() {
        System.out.println(" notas introducidas son:");
        System.out.println(" nota1 = " + uf_1);
        System.out.println(" nota2 = " + uf_2);
        System.out.println(" nota3 = " + uf_3);
        System.out.println(" acumulado 1 = "+ acu1);
        System.out.println(" acumulado 2 = "+ acu2);
        System.out.println(" acumulado 3 = "+ acu3);
        System.out.println(" nota definitiva es = "+ def);
    }

    /**
     * Método que indica si el estudiante ha aprobado o suspendido en base a la nota definitiva.
     */
    public void aprobado() {
        if(def < 5 && def >= 0) {
            System.out.println("suspendido");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("aprobado");
            } else {
                System.out.println(" error en la notas");
            }
        }
    }

    /**
     * Método principal. Ejecuta todo el proceso: ingreso, comprobación, cálculo, muestra y resultado.
     * @param args Argumentos de la línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Notas fc = new Notas();
        fc.IngresaNotas();
        fc.comprobacion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}