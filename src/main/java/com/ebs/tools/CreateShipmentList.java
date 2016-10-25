package com.ebs.tools;

import com.ebs.model.Shipment;
import com.ebs.model.Template;
import com.ebs.validation.ShipmentValidation;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lukasz.homik on 2016-10-07.
 */
public class CreateShipmentList {
    private ArrayList<Shipment> shipmentList;

    /**
     *  Generates list of shipments according to Excel file
     */

    public void generateShipmentList(String fileName){
        Shipment sh;
        ShipmentValidation shValid = new ShipmentValidation();
        Template rf = new Template();
        rf.setTemplateFileName(fileName);
        rf.generateListExcel();
        ArrayList<Shipment> arrTemp = new ArrayList<>();

        for (Object item: rf.getArrList()
             ) {
                sh = new Shipment(((HashMap<Integer, String>) item).get(0),((HashMap<Integer, String>) item).get(1),((HashMap<Integer, String>) item).get(2),((HashMap<Integer, String>) item).get(3),((HashMap<Integer, String>) item).get(4)
                        ,((HashMap<Integer, String>) item).get(5),((HashMap<Integer, String>) item).get(6),((HashMap<Integer, String>) item).get(7),((HashMap<Integer, String>) item).get(8),((HashMap<Integer, String>) item).get(9)
                        ,((HashMap<Integer, String>) item).get(10),((HashMap<Integer, String>) item).get(11),((HashMap<Integer, String>) item).get(12),((HashMap<Integer, String>) item).get(13),((HashMap<Integer, String>) item).get(14)
                        ,((HashMap<Integer, String>) item).get(15),((HashMap<Integer, String>) item).get(16),((HashMap<Integer, String>) item).get(17),((HashMap<Integer, String>) item).get(18),((HashMap<Integer, String>) item).get(19)
                        ,((HashMap<Integer, String>) item).get(20),((HashMap<Integer, String>) item).get(21),((HashMap<Integer, String>) item).get(22),((HashMap<Integer, String>) item).get(23),((HashMap<Integer, String>) item).get(24)
                        ,((HashMap<Integer, String>) item).get(25),((HashMap<Integer, String>) item).get(26),((HashMap<Integer, String>) item).get(27),((HashMap<Integer, String>) item).get(28),((HashMap<Integer, String>) item).get(29)
                        ,((HashMap<Integer, String>) item).get(30),((HashMap<Integer, String>) item).get(31),((HashMap<Integer, String>) item).get(32),((HashMap<Integer, String>) item).get(33),((HashMap<Integer, String>) item).get(34)
                        ,((HashMap<Integer, String>) item).get(35),((HashMap<Integer, String>) item).get(36),((HashMap<Integer, String>) item).get(37),((HashMap<Integer, String>) item).get(38),((HashMap<Integer, String>) item).get(39)
                        ,((HashMap<Integer, String>) item).get(40),((HashMap<Integer, String>) item).get(41),((HashMap<Integer, String>) item).get(42),((HashMap<Integer, String>) item).get(43),((HashMap<Integer, String>) item).get(44)
                        ,((HashMap<Integer, String>) item).get(45),((HashMap<Integer, String>) item).get(46),((HashMap<Integer, String>) item).get(47),((HashMap<Integer, String>) item).get(48),((HashMap<Integer, String>) item).get(49)
                        ,((HashMap<Integer, String>) item).get(50),((HashMap<Integer, String>) item).get(51),((HashMap<Integer, String>) item).get(52),((HashMap<Integer, String>) item).get(53),((HashMap<Integer, String>) item).get(54)
                        ,((HashMap<Integer, String>) item).get(55),((HashMap<Integer, String>) item).get(56),((HashMap<Integer, String>) item).get(57),((HashMap<Integer, String>) item).get(58),((HashMap<Integer, String>) item).get(59)
                        ,((HashMap<Integer, String>) item).get(60),((HashMap<Integer, String>) item).get(61),((HashMap<Integer, String>) item).get(62),((HashMap<Integer, String>) item).get(63));
                sh.setErrorMsg(shValid.FindError(sh));

            arrTemp.add(sh);
        }

        this.setShipmentList(arrTemp);
    }

    public ArrayList<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(ArrayList<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }
}
