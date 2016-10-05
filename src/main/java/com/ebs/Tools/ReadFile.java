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
import java.util.HashMap;
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
            HashMap<Integer,String> shipmentMap = new HashMap<>();
            URL fileToRead = new URL(fileName);
            InputStream fis = fileToRead.openStream();
            XSSFWorkbook  myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext()) {

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
                    shipmentMap.put(cell.getColumnIndex(),cellValue);

                }
                sh = new Shipment(shipmentMap.get(0),shipmentMap.get(1),shipmentMap.get(2),shipmentMap.get(3),shipmentMap.get(4)
                        ,shipmentMap.get(5),shipmentMap.get(6),shipmentMap.get(7),shipmentMap.get(8),shipmentMap.get(9)
                        ,shipmentMap.get(10),shipmentMap.get(11),shipmentMap.get(12),shipmentMap.get(13),shipmentMap.get(14)
                        ,shipmentMap.get(15),shipmentMap.get(16),shipmentMap.get(17),shipmentMap.get(18),shipmentMap.get(19)
                        ,shipmentMap.get(20),shipmentMap.get(21),shipmentMap.get(22),shipmentMap.get(23),shipmentMap.get(24)
                        ,shipmentMap.get(25),shipmentMap.get(26),shipmentMap.get(27),shipmentMap.get(28),shipmentMap.get(29)
                        ,shipmentMap.get(30),shipmentMap.get(31),shipmentMap.get(32),shipmentMap.get(33),shipmentMap.get(34)
                        ,shipmentMap.get(35),shipmentMap.get(36),shipmentMap.get(37),shipmentMap.get(38),shipmentMap.get(39)
                        ,shipmentMap.get(40),shipmentMap.get(41),shipmentMap.get(42),shipmentMap.get(43),shipmentMap.get(44)
                        ,shipmentMap.get(45),shipmentMap.get(46),shipmentMap.get(47),shipmentMap.get(48),shipmentMap.get(49)
                        ,shipmentMap.get(50),shipmentMap.get(51),shipmentMap.get(52),shipmentMap.get(53),shipmentMap.get(54)
                        ,shipmentMap.get(55),shipmentMap.get(56),shipmentMap.get(57),shipmentMap.get(58),shipmentMap.get(59)
                        ,shipmentMap.get(60),shipmentMap.get(61),shipmentMap.get(62),shipmentMap.get(63));
                sh.setErrorMsg(shValid.FindError(sh));
                arrList.add(sh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return arrList;
    }
}
