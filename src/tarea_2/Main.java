package tarea_2;
import java.util.*;

public class Main {
    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Opcion opcionSeleccionada;

        do {
            System.out.flush();
            ImprimirMenu();
            opcionSeleccionada = Opcion.valueOf(scanner.nextInt());

            switch (opcionSeleccionada){
                case Ejercico1:
                    Ejercicio1();
                    break;
                case Ejercicio2:
                    Ejercicio2();
                    break;
                case Ejercicio3:
                    Ejercico3();
                    break;
                case Ejercicio4:
                    Ejercico4();
                    break;
                case Salir:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("La opción es incorrecta");
                    break;
            }
        } while (opcionSeleccionada != Opcion.Salir);
    }

    public static void ImprimirMenu(){
        System.out.println("Seleccione una opción:");
        System.out.println("1 - Verificar Ejercicio 1");
        System.out.println("2 - Verificar Ejercicio 2");
        System.out.println("3 - Verificar Ejercicio 3");
        System.out.println("4 - Verificar Ejercicio 4");
        System.out.println("5 - Salir");
    }

    public static void Ejercicio1(){
        double sueldoColaborador = 200, totalVendido = 0, valorIngresado;
        double comision = 0.09;

        int numeroArticulo = 0;

        System.out.println("Ingrese los articulos vendidos, escriba -1 para dejar de ingresar");

        do{
            numeroArticulo++;
            System.out.println("Precio del articulo #" + numeroArticulo +":");

            valorIngresado = scanner.nextDouble();

            if(valorIngresado != -1){
                totalVendido += valorIngresado;
            }
        }
        while (valorIngresado != -1);

        System.out.println("El total que ha ganado el vendedor es:" + (sueldoColaborador + (comision * totalVendido)));
    }

    public static void Ejercicio2(){
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        int numeroEmpleadosLimite = 3, numeroEmpleadosIngresados = 0;

        do {
            numeroEmpleadosIngresados++;
            empleados.add(new Empleado(scanner, numeroEmpleadosIngresados));
        } while (numeroEmpleadosIngresados < numeroEmpleadosLimite);

        for (Empleado empleado :
                empleados) {
            System.out.println("El sueldo bruto del empleado #" + empleado.getId() + " " + empleado.getNombre() + " es: " + empleado.getSueldoBruto());
        }
    }

    public static void Ejercico3() {
        System.out.println("Escriba 10 numeros");
        int numero = 0;
        int numeroMayor = 0;
        for (int i = 0; i < 10; i++){
            numero = scanner.nextInt();

            if(i == 0 || numero > numeroMayor)
                numeroMayor = numero;
        }

        System.out.println("El numero mayor es: " + numeroMayor);
    }

    public static void Ejercico4(){
        for (int i = 1; i <= 5; i++){
            if(i== 1){
                System.out.println("N          10*N          100*N          1000*N");
            }
            System.out.println(i + "          " + i*10 + "            " + i*100 + "            "+ i*1000);
        }
    }
}
