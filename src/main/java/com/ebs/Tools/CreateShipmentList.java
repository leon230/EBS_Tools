package com.ebs.Tools;

import com.ebs.Model.Shipment;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by lukasz.homik on 2016-10-07.
 */
public class CreateShipmentList {
    private ArrayList<Shipment> shipmentList = new ArrayList<>();

    public void generateShipmentList(String fileName){
        ReadFile rf = new ReadFile();
        rf.setFileName(fileName);

        //                sh = new Shipment(returnMap.get(0),returnMap.get(1),returnMap.get(2),returnMap.get(3),returnMap.get(4)
//                        ,returnMap.get(5),returnMap.get(6),returnMap.get(7),returnMap.get(8),returnMap.get(9)
//                        ,returnMap.get(10),returnMap.get(11),returnMap.get(12),returnMap.get(13),returnMap.get(14)
//                        ,returnMap.get(15),returnMap.get(16),returnMap.get(17),returnMap.get(18),returnMap.get(19)
//                        ,returnMap.get(20),returnMap.get(21),returnMap.get(22),returnMap.get(23),returnMap.get(24)
//                        ,returnMap.get(25),returnMap.get(26),returnMap.get(27),returnMap.get(28),returnMap.get(29)
//                        ,returnMap.get(30),returnMap.get(31),returnMap.get(32),returnMap.get(33),returnMap.get(34)
//                        ,returnMap.get(35),returnMap.get(36),returnMap.get(37),returnMap.get(38),returnMap.get(39)
//                        ,returnMap.get(40),returnMap.get(41),returnMap.get(42),returnMap.get(43),returnMap.get(44)
//                        ,returnMap.get(45),returnMap.get(46),returnMap.get(47),returnMap.get(48),returnMap.get(49)
//                        ,returnMap.get(50),returnMap.get(51),returnMap.get(52),returnMap.get(53),returnMap.get(54)
//                        ,returnMap.get(55),returnMap.get(56),returnMap.get(57),returnMap.get(58),returnMap.get(59)
//                        ,returnMap.get(60),returnMap.get(61),returnMap.get(62),returnMap.get(63));
//                sh.setErrorMsg(shValid.FindError(sh));
    }


}
