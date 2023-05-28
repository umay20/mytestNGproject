package com.myfirstproject;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
public class Day15_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
        String path = "resources/Capitals.xlsx";
//        open the file
        FileInputStream fileInputStream = new FileInputStream(path);
//        Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet1 = workbook.getSheet("Sheet1");//getting Sheet1 by name
//        workbook.getSheetAt(0);//ALTERNATIVELY getting Sheet1 by index.
//        Go to first row
        Row row1 = sheet1.getRow(0); //index starts at 0
//        Go to first cell on that first row and print
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);
//        Go to second cell on that first row and print
        Cell c2r1 = row1.getCell(1);
        System.out.println(c2r1);
//       Go to 2nd row first cell  and assert if the data equal to USA
        Cell c1r2 = sheet1.getRow(1).getCell(0);
        System.out.println(c1r2.toString().toLowerCase());
//        Go to 3rd row 2nd cell-chain the row and cell
        Cell c2r3 = sheet1.getRow(2).getCell(1);
        System.out.println(c2r3.toString().toUpperCase());
//        Find the number of row
        int totalRowCount = sheet1.getLastRowNum()+1;//index starts at 0
        System.out.println(totalRowCount);
//        Find the number of used row
        int usedRowCount = sheet1.getPhysicalNumberOfRows();
        System.out.println(usedRowCount);//index starts at 1
//        Print country, capitol key value pairs as map object
//        create a map, and use a loop, and add all countries as key, and capitals as value
//        String country = sheet1.getRow(ROW INDEX).getCell(CELL INDEX).toString();
//        String capital = sheet1.getRow(ROW INDEX).getCell(CELL INDEX).toString();
    }
}