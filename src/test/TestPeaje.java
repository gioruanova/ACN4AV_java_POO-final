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

		EstacionPeaje peajeUno = new EstacionPeaje();

		// Creacion medios de pago
		Sube pagoSube = new Sube();
		Pase pagoPase = new Pase();
		Efectivo pagoEfectivo = new Efectivo();

		// Creacion cabinas
		Cabina cabina1 = new Cabina();
		cabina1.setMedioPago(pagoPase);

		Cabina cabina2 = new Cabina();
		cabina2.setMedioPago(pagoEfectivo);

		Cabina cabina3 = new Cabina();
		cabina3.setMedioPago(pagoPase);

		Cabina cabina4 = new Cabina();
		cabina4.setMedioPago(pagoPase);

		Cabina cabina5 = new Cabina();
		cabina5.setMedioPago(pagoSube);

		// Asigacion cabinas a estacion
		peajeUno.getCabina().add(cabina1);
		peajeUno.getCabina().add(cabina2);
		peajeUno.getCabina().add(cabina3);
		peajeUno.getCabina().add(cabina4);
		peajeUno.getCabina().add(cabina5);

		// Creacion vehiculos
		Vehiculo vehiculo1 = new Vehiculo("BE4582DE", CategoriaVehiculo.CAMION, cabina1);
		Vehiculo vehiculo2 = new Vehiculo("NRG456", CategoriaVehiculo.MOTO, cabina2);
		Vehiculo vehiculo3 = new Vehiculo("JQ9874LC", CategoriaVehiculo.AUTO, cabina3);
		Vehiculo vehiculo4 = new Vehiculo("LMR879", CategoriaVehiculo.MOTO, cabina3);

		// Validaciones cabinas
		System.out
				.println("-------------\nAUTOPISTA\n" + autopistaPanamericana.getNombreAutopista() + "\n-------------");
		System.out.println("CABINAS en Peaje");
		System.out.println(cabina1.toString());
		System.out.println(cabina2.toString());
		System.out.println(cabina3.toString());
		System.out.println(cabina4.toString());
		System.out.println(cabina5.toString());
		System.out.println("-----------------\n");

		// Recorrido vehiculos por cabinas
		cabina1.mostrarTotalCabina(vehiculo1);
		cabina4.mostrarTotalCabina(vehiculo1);
		cabina1.mostrarTotalCabina(vehiculo4);
		cabina2.mostrarTotalCabina(vehiculo2);
		cabina5.mostrarTotalCabina(vehiculo2);
		cabina3.mostrarTotalCabina(vehiculo3);

		// Calculos negocios
		autopistaPanamericana.mostrarPromedioDemoras(peajeUno);

		// ID's de cabina que aceptan efectivo
		autopistaPanamericana.idsCabinasEfectivo(peajeUno);

	}

}
