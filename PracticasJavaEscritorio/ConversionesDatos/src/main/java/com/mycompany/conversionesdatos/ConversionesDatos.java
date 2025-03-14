
package com.mycompany.conversionesdatos;

public class ConversionesDatos {

    public static void main(String[] args) {
        
        double num = 3.75;
        
        //Convertir un double a entero
       int  numInt = (int) num;
       
       //Convertir un double a Long
       long numLong = (long) num;
       
        System.out.println("Double: " +num);
        System.out.println("Int: " +numInt);
        System.out.println("Long: " +numLong);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        String cantidad = "15";
        String precio = "150.75";
        
        //Conversion númerica
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("Cantidad numero entero: " +cantEntero);
        System.out.println("Cantidad precio double: " +precioDouble);
        
        System.out.println("Cantidad total a pagar: " +cantEntero * precioDouble);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        //Conversión de numeros a un String
        int edad = 21;
        double estatura = 1.67;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " +edadString+ " Estatura: " +estaturaString);
        
    }
}
