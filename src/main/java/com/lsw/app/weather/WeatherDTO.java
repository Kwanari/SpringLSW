package com.lsw.app.weather;

public class WeatherDTO {
	private Long num;
	private String city;
	private Double temp;
	private String Status;
	private int Humidity;

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getHumidity() {
		return Humidity;
	}

	public void setHumidity(int humidity) {
		Humidity = humidity;
	}

}
