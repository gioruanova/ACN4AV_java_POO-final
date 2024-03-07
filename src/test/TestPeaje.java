package test;

import domain.Autopista;
import domain.EstacionPeaje;
import domain.Cabina;

import domain.Pase;
import domain.Efectivo;
import domain.Sube;

import domain.CategoriaVehiculo;
import domain.Vehiculo;

public class TestPeaje {

	public static void main(String[] args) {

		Autopista autopistaPanamericana = new Autopista("Autopista Panamericana S.A.");

		EstacionPeaje peajeDos = new EstacionPeaje();
		autopistaPanamericana.addEstacion(peajeDos);

		// Creacion medios de pago
		Sube pagoSube = new Sube();
		Pase pagoPase = new Pase();
		Efectivo pagoEfectivo = new Efectivo();

		// Creacion cabinas
		Cabina cabina1 = new Cabina(pagoPase);
		Cabina cabina2 = new Cabina(pagoEfectivo);
		Cabina cabina3 = new Cabina(pagoPase);
		Cabina cabina4 = new Cabina(pagoPase);
		Cabina cabina5 = new Cabina(pagoSube);

		// Asigacion cabinas a estacion
		peajeDos.getCabina().add(cabina1);
		peajeDos.getCabina().add(cabina2);
		peajeDos.getCabina().add(cabina3);
		peajeDos.getCabina().add(cabina4);
		peajeDos.getCabina().add(cabina5);

		// Creacion vehiculos
		Vehiculo vehiculo1 = new Vehiculo("BE4582DE", CategoriaVehiculo.CAMION, cabina1);
		Vehiculo vehiculo2 = new Vehiculo("NRG456", CategoriaVehiculo.MOTO, cabina2);
		Vehiculo vehiculo3 = new Vehiculo("JQ9874LC", CategoriaVehiculo.AUTO, cabina3);
		Vehiculo vehiculo4 = new Vehiculo("LMR879", CategoriaVehiculo.MOTO, cabina3);

		// Validaciones cabinas
		System.out
				.println("-------------\nAUTOPISTA\n" + autopistaPanamericana.getNombreAutopista() + "\n-------------");
		System.out.println("CABINAS en Peaje");
		autopistaPanamericana.recorridoCabinas(peajeDos);
		System.out.println("-----------------\n");

		// Detalle cobros cabinas
		System.out.println("---------------------------------------------------");
		cabina1.mostrarTotalCabina(vehiculo1);
		cabina4.mostrarTotalCabina(vehiculo1);
		cabina1.mostrarTotalCabina(vehiculo4);
		cabina2.mostrarTotalCabina(vehiculo2);
		cabina5.mostrarTotalCabina(vehiculo2);
		cabina3.mostrarTotalCabina(vehiculo3);

		// Calculos negocios
		System.out.println("Diferido pago:");
		autopistaPanamericana.mostrarPromedioDemoras(peajeDos);

		// ID's de cabina que aceptan efectivo
		System.out.println("\nCabinas aceptando efectivo");
		autopistaPanamericana.idsCabinasEfectivo(peajeDos);

	}

}
