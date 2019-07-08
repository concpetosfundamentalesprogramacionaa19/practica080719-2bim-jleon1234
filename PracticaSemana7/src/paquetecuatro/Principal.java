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
public class Principal {
    public static void main(String[] args) {
        int arreglo2 [] = {10, 20, 30, 1, 2, 3, 40, 4};
        int tamanio = arreglo2.length;
        System.out.println(Arreglo.obtenerTamanioArreglo(arreglo2, tamanio));
        System.out.println(Arreglo.obtnerSumaArreglo(arreglo2));
    }
 
}
