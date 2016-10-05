package com.ebs.Validation;

import com.ebs.Model.Shipment;

/**
 * Created by Leon on 2016-09-14.
 */
public class ShipmentValidation {

    public String FindError(Shipment sh){
        if (sh.getId().equals("2.0")){
            return "id equals 2!";
        }
        else{
            return "No errors";
        }



    }
}
