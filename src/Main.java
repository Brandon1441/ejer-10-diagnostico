import java.util.Scanner;

/*
10.	Crea un programa en Java que solicite al usuario ingresar las notas de un conjunto de estudiantes
y luego calcule el promedio de esas notas. El programa debe preguntar al usuario cuántas notas desea
ingresar, luego leer las notas y finalmente calcular y mostrar el promedio.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas notas deseas ingresar para calcular el promedio? ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la nota correspondiente al estudiante " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }
        double promedio = suma / cantidad;

        System.out.println("El promedio es: " + promedio);
    }
}