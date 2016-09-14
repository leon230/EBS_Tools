package com.ebs.Tools;

import com.ebs.Model.Shipment;
import com.ebs.storage.StorageProperties;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lukasz.homik on 2016-09-14.
 */
public class ReadFile {
    private String fileName;
    private List<Shipment> listToReturn;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Shipment> getListToReturn() {
        return listToReturn;
    }

    public void setListToReturn(List<Shipment> listToReturn) {
        this.listToReturn = listToReturn;
    }
    @Autowired
    public void generateList(){

        int str;
        StringBuilder response= new StringBuilder();

        char[] buff = new char[1024];
        try {
            URL fileToRead = new URL(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileToRead.openStream()));

//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
            do {
                str = br.read(buff);
                if(str != -1){
                    response.append(buff,0,str ) ;
                    System.out.print(response.toString());
                    if ((char) str == '\n'){
                        System.out.print("\n");
                    }
                }
            }while (str != -1);



            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void generateListExcel(){

        try {
            String cellValue;
            Shipment sh = new Shipment();
            URL fileToRead = new URL(fileName);
            InputStream fis = fileToRead.openStream();
            XSSFWorkbook  myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {


                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            cellValue = cell.getStringCellValue();
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            break;
                        default:
                    }
                }
                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
