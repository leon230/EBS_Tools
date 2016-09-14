package com.ebs.Tools;

import com.ebs.Model.Shipment;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.*;
import java.lang.reflect.Array;
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
    public ArrayList<?> generateListExcel(){

        ArrayList<Shipment> arrList = new ArrayList<>();

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
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {



                    Cell cell = cellIterator.next();
                    cellValue = "";
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            cellValue = cell.getStringCellValue();
                            System.out.print(cellValue + "\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            System.out.print(cellValue + "\t");
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            System.out.print(cellValue + "\t");
                            break;
                        default:
                    }
                    System.out.println("getting col indexes" + cellValue + "-" + cell.getColumnIndex());
                    if(cell.getColumnIndex() == 0){
                        System.out.print("===> Inserting ID");
                        System.out.print("\n");
                        sh.setId(cellValue);
                    }
                    else if (cell.getColumnIndex() == 1){
                        System.out.print("===> Inserting name");
                        System.out.print("\n");
                        sh.setName(cellValue);
                    }
                    else if (cell.getColumnIndex() == 2){
                        System.out.print("===> Inserting date");
                        System.out.print("\n");
                        sh.setStartDate(cellValue);
                    }




                }
//                System.out.println("Inserting to list" + "\n" + sh.getId() + "-" + sh.getName() + "-" + sh.getStartDate());
                arrList.add(sh);
//                System.out.println("After Inserting to list" + "\n");
            }
//            for (Shipment str: arrList
//                    ) {
//                System.out.println(str.getId());
//                System.out.println(str.getName());
//                System.out.println(str.getStartDate());
//                System.out.println("\n");
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return arrList;



    }


}
