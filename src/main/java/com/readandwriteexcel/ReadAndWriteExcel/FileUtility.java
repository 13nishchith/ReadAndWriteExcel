package com.readandwriteexcel.ReadAndWriteExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtility {

	public static List<MoviesDTO> readExcel(String filePath) throws IOException {
		 List<MoviesDTO>  moviesList = new ArrayList<>();
		 FileInputStream inputStream = new FileInputStream(filePath);
		 
		 Workbook workbook = new XSSFWorkbook(inputStream);
		 
		 Sheet sheet = workbook.getSheetAt(0);
		 int rowCount = sheet.getPhysicalNumberOfRows();
		 
		 for(int rowIndex = 1; rowIndex<rowCount ; rowIndex++) {
			 Row row = sheet.getRow(rowIndex);
			 if(row!=null) {
				 MoviesDTO movies = new MoviesDTO();
				 movies.setMovieName(row.getCell(0).getStringCellValue());
				 movies.setMovieLanguage(row.getCell(1).getStringCellValue());
				 movies.setMovieType(row.getCell(2).getStringCellValue());
				 movies.setActorName(row.getCell(3).getStringCellValue());
				 movies.setActressName(row.getCell(4).getStringCellValue());
				 movies.setMovieBudget(row.getCell(5).getNumericCellValue());
				 movies.setMovieCollection(row.getCell(6).getNumericCellValue());
				 moviesList.add(movies);
			 }
		 }
		 workbook.close();
		 inputStream.close();
		return moviesList;
	}

}
