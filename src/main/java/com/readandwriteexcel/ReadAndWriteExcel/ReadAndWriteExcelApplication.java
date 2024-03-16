package com.readandwriteexcel.ReadAndWriteExcel;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadAndWriteExcelApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(ReadAndWriteExcelApplication.class, args);
		List<MoviesDTO> moviesList = FileUtility.readExcel("src/main/resources/template/moviesList.xlsx");
		for(MoviesDTO movies: moviesList) {
			System.out.println("movie details: "+movies);
		}
	}

}
