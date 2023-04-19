
package arreglo;

public class Arreglo {

public static void sumarLista(int arreglo[])
{
    int suma=0;
    for (int i = 0; i < arreglo.length; i++) 
    {
        suma+=arreglo[i];
    }
    System.out.println("El resultado de la sumatoria es: " +suma );
    System.out.println("El promedio es: " + (suma/arreglo.length));
}

public static int buscarMayor(int arreglo[][])
{
    int mayor;
    mayor=arreglo[0][0];
    for (int i = 0; i < arreglo.length; i++) 
    {
        for (int j = 0; j < arreglo[i].length; j++) 
        {
            if (mayor<arreglo[i][j]) 
                {
                    mayor=arreglo[i][j];
                }
        }
    }
    return mayor;
}

public static int cuentaVocales(String cadena)
{   int contador=0;
    String letra;
    for (int i = 0; i < cadena.length(); i++) 
    {
        letra=cadena.substring(i,i+1);
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||"i".equalsIgnoreCase(letra)||"o".equalsIgnoreCase(letra)||"u".equalsIgnoreCase(letra))
        {
           contador++; 
           
        }

    }
    return contador;
}

public static int cuentaCaracter(String cadena, char letra)
{
    int contador=0;
    
    for (int i = 0; i < cadena.length(); i++) 
    {
        if (cadena.charAt(i)==letra) 
        {
            contador++;
        }
    }
    return contador;
}
}
