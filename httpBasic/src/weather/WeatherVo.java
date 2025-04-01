package weather;

public class WeatherVo {

	// 온도, 습도, 날씨
	private double temperature;
	private int humidity;
	private String description;
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "WeatherVo [temperature=" + temperature + ", humidity=" + humidity + ", description=" + description
				+ "]";
	}
	public WeatherVo() {}
	public WeatherVo(double temperature, int humidity, String description) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.description = description;
	}
}
	


