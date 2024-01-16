package test;

import domain.EstacionPeaje;

public class TestPeaje {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			Integer dameHoraActualConMath = EstacionPeaje.dameHoraActualConMath();
			System.out.println("dameHoraActualConMath   -> " + dameHoraActualConMath);
			Integer dameHoraActualConRandom = EstacionPeaje.dameHoraActualConRandom();
			System.out.println("dameHoraActualConRandom -> " + dameHoraActualConRandom);

			if (dameHoraActualConMath == 0) {
				System.out.println("AAAAAAAAAAA");
			}
			if (dameHoraActualConRandom == 0) {
				System.out.println("BBBBBBBBBBB");
			}
		}

	}

}
