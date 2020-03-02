/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3git;

/**
 *
 * @author puchy
 */
public class Practica3git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = InputAsker.askInt("Cuantos años tienes?", 1, 120);
        edad = calcularTiempoExistencia(edad);
        System.out.println("Llevas vivo " + edad + " dias");

    }

    private static int calcularTiempoExistencia(int edad) {
        return edad * 365;
    }

}
