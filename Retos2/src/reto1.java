import java.util.*;
public class reto1 {

    public static void main(String[] args) {//ejecución

        Scanner myObj=new Scanner (System.in);

        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = myObj.nextInt();


        double[] notas = new double[cantidadNotas];//EL vector ira hasta lo que yo le ponga en cantidadnotas

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");//Ese i + 1 es para que enumere la lista 
            notas[i] = myObj.nextDouble();
        }

        double promedio = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            promedio += notas[i];//SUmas todas las notas a la variable promedio
        }

        promedio /= cantidadNotas;//dividir promedio entre las cantidade de las notas

        System.out.println("El promedio de las notas es: " + promedio);

        if (promedio < 30) {
            System.out.println("REPROBASTE");
        } else if (promedio < 40) {
            System.out.println("PASASTE RASPANDO");
        }  else {
            System.out.println("APROBASTE CON BUENOS RESULTADOS");
        }
System.out.println("Gracias por elegirnos");
        myObj.close();

    }

}