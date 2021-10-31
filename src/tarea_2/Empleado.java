package tarea_2;

import java.util.Scanner;

public class Empleado {
    Scanner scanner;

    Empleado(Scanner scanner, int id){
        this.scanner = scanner;

        setId(id);
        setNombre();
        setTarifaHora();
        setNumeroHorasTrabajadasLaSemanaPasada();
    }
    private int Id;
    private String Nombre;
    private double TarifaHora;
    private double NumeroHorasTrabajadasLaSemanaPasada;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del empleado #" + Id);
        Nombre = scanner.next();
    }

    public double getTarifaHora() {
        return TarifaHora;
    }

    public void setTarifaHora() {
        System.out.println("Ingrese la tarifa de la hora para el empleado #" + Id);
        TarifaHora = scanner.nextDouble();
    }

    public double getNumeroHorasTrabajadasLaSemanaPasada() {
        return NumeroHorasTrabajadasLaSemanaPasada;
    }

    public void setNumeroHorasTrabajadasLaSemanaPasada() {
        System.out.println("Ingrese las horas trabajadas para el empleado #" + Id);
        NumeroHorasTrabajadasLaSemanaPasada = scanner.nextDouble();
    }

    public double getSueldoBruto() {
        int horasNormales = 40;
        double totalPorHorasExtraordinarias = 0;
        double totalPorHorasNormales = 0;


        if (NumeroHorasTrabajadasLaSemanaPasada > horasNormales){
            totalPorHorasExtraordinarias = (NumeroHorasTrabajadasLaSemanaPasada - horasNormales) * (TarifaHora / 2);
            totalPorHorasNormales = horasNormales * TarifaHora;
        } else {
            totalPorHorasNormales = NumeroHorasTrabajadasLaSemanaPasada * TarifaHora;
        }

        return totalPorHorasNormales + totalPorHorasExtraordinarias;
    }

}
