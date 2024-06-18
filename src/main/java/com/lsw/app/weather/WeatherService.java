package com.lsw.app.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//객체 생성+sevice
public class WeatherService {

	@Autowired
	private WeatherDAO weatherDAO;

	public void getList() {

		weatherDAO.getList();

	}
}
