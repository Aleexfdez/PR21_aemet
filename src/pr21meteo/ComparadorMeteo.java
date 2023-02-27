package pr21meteo;

import java.util.Comparator;

public class ComparadorMeteo implements Comparator<EstacionMeteorologica> {
	private int formaOrdenar;
	public static final int ASCENDENTE_TEMP = 1;
	public static final int ASCENDENTE_HUM = 2;

	public ComparadorMeteo() {
		formaOrdenar = ASCENDENTE_TEMP;
	}
	
	public void setComoOrdenar(int como) {
		if (como == ASCENDENTE_TEMP) {
			formaOrdenar = ASCENDENTE_TEMP;
		} else {
			formaOrdenar = ASCENDENTE_HUM;
		}
	}
	
	@Override
	public int compare(EstacionMeteorologica em1, EstacionMeteorologica em2) {
		int devolver = 0;
		if (formaOrdenar == ASCENDENTE_TEMP) {
			devolver = em1.getTemperatura() - em2.getTemperatura();
		}
		if (formaOrdenar == ASCENDENTE_HUM) {
			devolver = em1.getHumedad() - em2.getHumedad();
		}
		if (devolver == 0) {

		}
		return devolver;
	}

}
