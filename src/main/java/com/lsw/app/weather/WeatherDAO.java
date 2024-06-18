package com.lsw.app.weather;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.springframework.stereotype.Repository;

@Repository
//객체 생성 + Dao
public class WeatherDAO {

	WeatherDTO weatherDTO;

	public void getList() { // list 메서드
		FileReader fr = null;
		BufferedReader br = null;
		File file = new File("C:\\study", "weather.txt");

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}

				StringTokenizer st = new StringTokenizer(line);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // list 메서드 끝
}
