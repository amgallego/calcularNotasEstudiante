//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaExamenParcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        String materia = "";
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de Software\n2 - Diseño Gráfico\n3 - Gastronomía");
        String programa = sc.nextLine();
        switch(programa){
        case "1":
            System.out.println("Programa de Desarrollo de Software");
            System.out.println("Seleccione la materia:\n1 - Lógica de programación\n2 - Metodologías ágiles\n3 - Introducción a la programación");
            materia = sc.nextLine();
            switch (materia){
                case "1":
                    System.out.println("Nota de Lógica de programación");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + " " + "tiene la siguiente nota en la materia de la lógica: " + notaMateria + " ");
                    if(notaMateria < 2){
                        System.out.println("Perdió definitivamente");
                    } else if(notaMateria < 2.9){
                        System.out.println("Tiene derecho al plan de mejoramiento");
                    } else {
                        System.out.println("Así quedó la materia");
                    }
                    break;
                case "2":
                    System.out.println("Nota de Metodologías ágiles");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de la metodologías ágiles: " + notaMateria);
                    break;
                case "3":
                    System.out.println("Nota de Introducción a la programación");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Introducción a la programación: " + notaMateria);
                    break;
            }
            break;
        case "2":
            System.out.println("Programa de Diseño Gráfico");
            System.out.println("Seleccione la materia:\n1 - Tipografía\n2 - Iconografía\n3 - Introducción");
            materia = sc.nextLine();
            switch (materia){
                case "1":
                    System.out.println("Nota de Lógica de Tipografía");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Tipografía: " + notaMateria);
                    break;
                case "2":
                    System.out.println("Nota de Iconografía");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Iconografía: " + notaMateria);
                    break;
                case "3":
                    System.out.println("Nota de Introducción");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Introducción: " + notaMateria);
                    break;
            }
            break;
        case "3":
                System.out.println("Programa de Gatronomía");
            System.out.println("Seleccione la materia:\n1 - Costos\n2 - Panadería\n3 - Cocina Integral");
            materia = sc.nextLine();
            switch (materia){
                case "1":
                    System.out.println("Nota de Costos");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia costos: " + notaMateria);
                    break;
                case "2":
                    System.out.println("Nota de Panadería");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Panadería: " + notaMateria);
                    break;
                case "3":
                    System.out.println("Nota de Cocina Integral");
                    System.out.print("Nota exámen parcial: ");
                    notaExamenParcial = sc.nextDouble();
                    System.out.print("Nota taller: ");
                    notaTaller = sc.nextDouble();
                    System.out.print("Nota final: ");
                    notaFinal = sc.nextDouble();
                    notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                    System.out.print("El estudiante: " + nombreEstudiante + "tiene la siguiente nota en la materia de Cocina Integral: " + notaMateria);
                    break;
            }
            break;
        }
    }
}