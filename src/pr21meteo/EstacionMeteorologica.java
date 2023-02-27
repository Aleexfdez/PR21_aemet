package pr21meteo;

public class EstacionMeteorologica {

	protected int temperatura = 0;
	protected int humedad = 0;

	public EstacionMeteorologica(int temperatura, int humedad) {
		this.temperatura = temperatura;
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return "[" + temperatura + "º" + "/" + humedad + "%" + "]";
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

}
