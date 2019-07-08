/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author JuanPablo
 */
public class SumaNumeros {
    public static int obtenerSumaUno(int numero){
        if(numero <= 0){
            return 0;
        }else{
            return numero + obtenerSumaUno(numero - 1);
        }
    }
    
    public static int obtenerSuma(int numero){
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }
}
