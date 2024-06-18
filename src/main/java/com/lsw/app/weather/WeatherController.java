package com.lsw.app.weather;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//객체 생성 + controller 역할 수행
public class WeatherController {

	@Autowired // 만든것을 주입
	private WeatherService weatherservice;

	@RequestMapping("/weather/list")
	public String getList(HttpServletRequest request) {

		request.getParameter("");

		weatherservice.getList();

		return "weather/list";
	}

	@RequestMapping("/weather/detail") // url요청할 때
	public String getDetail() {

		return "weather/detail";
	}
}
