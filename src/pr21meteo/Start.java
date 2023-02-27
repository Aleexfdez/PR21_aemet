package pr21meteo;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {

// se crea el vector con los dias deseados
		EstacionMeteorologica[] aemet = new EstacionMeteorologica[30];

		// se van metiendo los datos de temp y hum aleatorios mediante el bucle
		for (int i = 0; i < aemet.length; i++) {
			aemet[i] = new EstacionMeteorologica((int) (Math.random() * 20 + 1), (int) (Math.random() * 30 + 60));
		}
		
//ordenador por temperatura ascendenta
		System.out.println(Arrays.toString(aemet));
		ComparadorMeteo cm = new ComparadorMeteo();
		Arrays.sort(aemet, cm);
		System.out.println(Arrays.toString(aemet));
		
// ordenado por humedad ascendente
		cm.setComoOrdenar(ComparadorMeteo.ASCENDENTE_HUM);
		Arrays.sort(aemet, cm);
		System.out.println(Arrays.toString(aemet));
	}
}
