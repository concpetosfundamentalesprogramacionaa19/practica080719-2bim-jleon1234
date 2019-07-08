/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

/**
 *
 * @author JuanPablo
 */
public class Arreglo {
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
         
    }
    public static int obtnerSumaArreglo(int arreglo2[]){
        int suma = 0;
        for (int i = 0; i < arreglo2.length; i++) {
            suma += arreglo2[i];
        }
        return suma;
    }
}
