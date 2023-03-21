import java.util.Scanner;

public class reto2 {
    
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Ingrese el número de competidores: ");
        int numCompetidores = myObj.nextInt();
        
        String[] nombres = new String[numCompetidores];        //EL vector ira hasta la cantidad que pongan en numero compretidores
        double[] tiempos = new double[numCompetidores];
        
        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor #" + (i+1) );
            nombres[i] = myObj.next();                                       //Ingresar nombre y tiempo de los competidores
            System.out.print("Ingrese el tiempo del competidor #" + (i+1) );
            tiempos[i] = myObj.nextDouble();
        }
        
      
        
        int indiceGanador = 0;                          // Determinar al ganador

        double menorTiempo = tiempos[0];
        
        for (int i = 1; i < numCompetidores; i++) {
            if (tiempos[i] < menorTiempo) {
                indiceGanador = i;
                menorTiempo = tiempos[i];
            }
        }
        
        System.out.println("\nEl ganador es " + nombres[indiceGanador] + " con un tiempo de " + menorTiempo + " segundos.");
        myObj.close();
    }
    
}