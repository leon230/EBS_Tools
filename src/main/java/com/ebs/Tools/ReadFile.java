package com.ebs.Tools;

import com.ebs.Model.Shipment;
import com.ebs.Validation.ShipmentValidation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lukasz.homik on 2016-09-14.
 */
public class ReadFile {
    private String fileName;
    private ArrayList<Shipment> listToReturn;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Shipment> getListToReturn() {
        return listToReturn;
    }

    public void setListToReturn(ArrayList<Shipment> listToReturn) {
        this.listToReturn = listToReturn;
    }
/*
    List generation for csv/txt
 */
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
/*
    List generation for Excel sheets.
 */
    public ArrayList<?> generateListExcel(){

        ArrayList<Shipment> arrList = new ArrayList<>();
        ShipmentValidation shValid;

        try {
            String cellValue;
            Shipment sh;
            URL fileToRead = new URL(fileName);
            InputStream fis = fileToRead.openStream();
            XSSFWorkbook  myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();

            while (rowIterator.hasNext()) {
                sh = new Shipment();
                shValid = new ShipmentValidation();
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();
                    cellValue = "";
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            cellValue = cell.getStringCellValue();
//                            System.out.print(cellValue + "\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
//                            System.out.print(cellValue + "\t");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
//                            System.out.print(cellValue + "\t");
                            break;
                        default:
                    }

                    System.out.println("getting col indexes" + cellValue + "-" + cell.getColumnIndex());

                    if(cell.getColumnIndex() == 0){
                        sh.setId(cellValue);
                    }
                    else if (cell.getColumnIndex() == 1){
                        sh.setDnumber(cellValue);
                    }
                    else if (cell.getColumnIndex() == 2){
                        sh.setSlocation(cellValue);
                    }
                    else if (cell.getColumnIndex() == 2){
                        sh.setSlocation(cellValue);
                    }

                    sh.setErrorMsg(shValid.FindError(sh));
                }
                arrList.add(sh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return arrList;



    }


}
