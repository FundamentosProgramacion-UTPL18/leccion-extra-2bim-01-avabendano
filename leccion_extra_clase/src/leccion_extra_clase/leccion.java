/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_extra_clase;

/**
 *
 * @author Victoria
 */
public class leccion {

    public static void main(String[] args) {
        // Delaramos las variables a utilizar
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[arreglo1.length];
        double promedio;
        double promedio_general;
        double suma_promedio = 0;
        int suma;
        String texto;

        // Formateamos la cabecera del reporte
        texto = String.format("%-18s%-18s%-18s\n", "Arreglo1", "Arreglo2", "Resultado");

        // Recorremos las listas 1 - 2 y guardamos el resultado promediado en arreglo3
        for (int contador = 0; contador < arreglo1.length; contador++) {
            suma = arreglo1[contador] + arreglo2[contador];
            promedio = suma / 2;
            arreglo3[contador] = promedio;

            // Foramteamos cada fila del reporte
            texto = String.format("%s%-18d%-18d%-18.2f\n", texto, arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        }

        // Recorremos el arreglo3 para obetener la suma total del mismo
        for (int contador = 0; contador < arreglo3.length; contador++) {
            suma_promedio = suma_promedio + arreglo3[contador];
        }

        // Promediamos la sma del arreglo3
        promedio_general = suma_promedio / arreglo3.length;

        // Imprimimos el resultado
        System.out.print(texto);
        System.out.printf("El promedo del Arreglo 3 es: %.2f\n", promedio_general);

    }

}
