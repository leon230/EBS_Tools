package com.ebs.Tools;

import com.ebs.Model.Shipment;
import com.ebs.Validation.ShipmentValidation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by lukasz.homik on 2016-09-14.
 */
public class ReadFile {
    private String fileName;


    public String getFileName() {
        return fileName;
    }
    private static ArrayList<Object> arrList;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /*
        Read Template type
     */
    public String ReadTemplateType(){

        String cellValue = null;

        try {
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
                            cellValue = cell.getStringCellValue();
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            break;
                        default:
                    }
                }
                return cellValue;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cellValue;
    }

    /*
        List generation for Excel sheets.
     */
    public void generateListExcel(){

        ArrayList<Object> arrTemp = new ArrayList<>();

        try {
            String cellValue;
            HashMap<Integer,String> returnMap;
            URL fileToRead = new URL(fileName);
            InputStream fis = fileToRead.openStream();
            XSSFWorkbook  myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();
            rowIterator.next();
            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                returnMap = new HashMap<>();
                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();
                    cellValue = "";
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            cellValue = cell.getStringCellValue();
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            break;
                        default:
                    }

                    returnMap.put(cell.getColumnIndex(),cellValue);
                }

//                System.out.println(returnMap.toString());
                arrTemp.add(returnMap);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setArrList(arrTemp);
    }

    public ArrayList<Object> getArrList() {
        return arrList;
    }

    public void setArrList(ArrayList<Object> arrList) {
        this.arrList = arrList;
    }
}
//    /*
//        List generation for csv/txt
//     */
//    public void generateList(){
//
//        int str;
//        StringBuilder response= new StringBuilder();
//
//        char[] buff = new char[1024];
//        try {
//            URL fileToRead = new URL(fileName);
//            BufferedReader br = new BufferedReader(new InputStreamReader(fileToRead.openStream()));
//            do {
//                str = br.read(buff);
//                if(str != -1){
//                    response.append(buff,0,str ) ;
//                    System.out.print(response.toString());
//                    if ((char) str == '\n'){
//                        System.out.print("\n");
//                    }
//                }
//            }while (str != -1);
//            br.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
