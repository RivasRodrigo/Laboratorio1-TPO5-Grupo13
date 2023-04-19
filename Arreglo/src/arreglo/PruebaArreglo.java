
package arreglo;

public class PruebaArreglo {

    public static void main(String[] args) 
    {
int arreglo[]={4,2,6,8,9};
Arreglo.sumarLista(arreglo);
int matriz[][]={{1,2,4,5,6},{4,2,4},{9,4,3,2}};
System.out.println("El mayor: "+ Arreglo.buscarMayor(matriz));

String cadena="pruebadecadena";
System.out.println("La cantidad de vocales de la cadena es: " +Arreglo.cuentaVocales(cadena));  

System.out.println("La cantidad de veces que se repite el caracter en la cadena es: " +Arreglo.cuentaCaracter("prueba ale",'a'));

    }
    
}
