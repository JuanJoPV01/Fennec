package pruebas;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Genérico");
        Moto m = new Moto();

       
        System.out.println(v.getTipo()); 
        System.out.println(m.getTipo()); 

        
    }
}
