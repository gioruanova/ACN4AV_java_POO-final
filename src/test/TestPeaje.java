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
		cabina3.setMedioPago(pagoEfectivo);

		Cabina cabina4 = new Cabina();
		cabina4.setMedioPago(pagoEfectivo);

		Cabina cabina5 = new Cabina();
		cabina5.setMedioPago(pagoSube);

		// Asigacion cabinas a estacion
		peajeUno.getCabina().add(cabina1);
		peajeUno.getCabina().add(cabina2);
		peajeUno.getCabina().add(cabina3);
		peajeUno.getCabina().add(cabina4);
		peajeUno.getCabina().add(cabina5);

		// Creacion vehiculos
		Vehiculo vehiculo1 = new Vehiculo("AA8888CA", CategoriaVehiculo.MOTO, cabina1);
		Vehiculo vehiculo2 = new Vehiculo("CC1212AB", CategoriaVehiculo.AUTO, cabina2);
		Vehiculo vehiculo3 = new Vehiculo("HA1212AG", CategoriaVehiculo.CAMION, cabina3);

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
		cabina1.imprimirTotal(vehiculo1);
		cabina2.imprimirTotal(vehiculo2);
		cabina3.imprimirTotal(vehiculo3);
		cabina4.imprimirTotal(vehiculo1);
		cabina5.imprimirTotal(vehiculo2);

		// Calculos negocios
		autopistaPanamericana.mostrarPromedioDemoras(peajeUno);

		// ID's de cabina que aceptan efectivo
		autopistaPanamericana.idsCabinasEfectivo(peajeUno);

	}

}
