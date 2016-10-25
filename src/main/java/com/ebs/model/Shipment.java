package com.ebs.model;

/**
 * Created by lukasz.homik on 2016-09-13.
 */
public class Shipment {
    private String id;
    private String dnumber;
    private String slocation;
    private String dlocation;
    private String servprov;
    private String earlyPickDate;
    private String latePickDate;
    private String earlyDelDate;
    private String lateDelDate;
    private String matCategory;
    private String transcond;
    private String event1Qc;
    private String event1Date;
    private String event1Stop;
    private String event2Qc;
    private String event2Date;
    private String event2Stop;
    private String thu;
    private String thuCount;
    private String totalGrossWeight;
    private String eru;
    private String pfsCount;
    private String basecost;
    private String currency;
    private String addCostTypeVal;
    private String addCostType;
    private String addCostTypeVal2;
    private String addCostType2;
    private String addCostTypeVal3;
    private String addCostType3;
    private String addCostTypeVal4;
    private String addCostType4;
    private String hazmId;
    private String orType;
    private String region;
    private String distance;
    private String transMode;
    private String releaseAttribute;
    private String mattype;
    private String stream;
    private String incoTemrs;
    private String eqGroupId;
    private String event3Qc;
    private String event3Date;
    private String event3Stop;
    private String otc;
    private String city;
    private String street;
    private String zip;
    private String country;
    private String referenceGid;
    private String referenceVal;
    private String referenceGid2;
    private String referenceVal2;
    private String referenceGid3;
    private String referenceVal3;
    private String referenceGid4;
    private String referenceVal4;
    private String referenceGid5;
    private String referenceVal5;
    private String referenceGid6;
    private String referenceVal6;
    private String commCode;
    private String otm_sh_id;
    private String errorMsg;

    public Shipment(String id, String dnumber, String slocation, String dlocation, String servprov, String earlyPickDate, String latePickDate, String earlyDelDate,
                    String lateDelDate, String matCategory, String transcond, String event1Qc, String event1Date, String event1Stop, String event2Qc, String event2Date,
                    String event2Stop, String thu, String thuCount, String totalGrossWeight, String eru, String pfsCount, String basecost, String currency, String addCostTypeVal,
                    String addCostType, String addCostTypeVal2, String addCostType2, String addCostTypeVal3, String addCostType3, String addCostTypeVal4, String addCostType4,
                    String hazmId, String orType, String region, String distance, String transMode, String releaseAttribute, String mattype, String stream, String incoTemrs, String eqGroupId,
                    String event3Qc, String event3Date, String event3Stop, String otc, String city, String street, String zip, String country, String referenceGid, String referenceVal,
                    String referenceGid2, String referenceVal2, String referenceGid3, String referenceVal3, String referenceGid4, String referenceVal4, String referenceGid5, String referenceVal5,
                    String referenceGid6, String referenceVal6, String commCode, String otm_sh_id) {
        this.id = id;
        this.dnumber = dnumber;
        this.slocation = slocation;
        this.dlocation = dlocation;
        this.servprov = servprov;
        this.earlyPickDate = earlyPickDate;
        this.latePickDate = latePickDate;
        this.earlyDelDate = earlyDelDate;
        this.lateDelDate = lateDelDate;
        this.matCategory = matCategory;
        this.transcond = transcond;
        this.event1Qc = event1Qc;
        this.event1Date = event1Date;
        this.event1Stop = event1Stop;
        this.event2Qc = event2Qc;
        this.event2Date = event2Date;
        this.event2Stop = event2Stop;
        this.thu = thu;
        this.thuCount = thuCount;
        this.totalGrossWeight = totalGrossWeight;
        this.eru = eru;
        this.pfsCount = pfsCount;
        this.basecost = basecost;
        this.currency = currency;
        this.addCostTypeVal = addCostTypeVal;
        this.addCostType = addCostType;
        this.addCostTypeVal2 = addCostTypeVal2;
        this.addCostType2 = addCostType2;
        this.addCostTypeVal3 = addCostTypeVal3;
        this.addCostType3 = addCostType3;
        this.addCostTypeVal4 = addCostTypeVal4;
        this.addCostType4 = addCostType4;
        this.hazmId = hazmId;
        this.orType = orType;
        this.region = region;
        this.distance = distance;
        this.transMode = transMode;
        this.releaseAttribute = releaseAttribute;
        this.mattype = mattype;
        this.stream = stream;
        this.incoTemrs = incoTemrs;
        this.eqGroupId = eqGroupId;
        this.event3Qc = event3Qc;
        this.event3Date = event3Date;
        this.event3Stop = event3Stop;
        this.otc = otc;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.country = country;
        this.referenceGid = referenceGid;
        this.referenceVal = referenceVal;
        this.referenceGid2 = referenceGid2;
        this.referenceVal2 = referenceVal2;
        this.referenceGid3 = referenceGid3;
        this.referenceVal3 = referenceVal3;
        this.referenceGid4 = referenceGid4;
        this.referenceVal4 = referenceVal4;
        this.referenceGid5 = referenceGid5;
        this.referenceVal5 = referenceVal5;
        this.referenceGid6 = referenceGid6;
        this.referenceVal6 = referenceVal6;
        this.commCode = commCode;
        this.otm_sh_id = otm_sh_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDnumber() {
        return dnumber;
    }

    public void setDnumber(String dnumber) {
        this.dnumber = dnumber;
    }

    public String getSlocation() {
        return slocation;
    }

    public void setSlocation(String slocation) {
        this.slocation = slocation;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }

    public String getServprov() {
        return servprov;
    }

    public void setServprov(String servprov) {
        this.servprov = servprov;
    }

    public String getEarlyPickDate() {
        return earlyPickDate;
    }

    public void setEarlyPickDate(String earlyPickDate) {
        this.earlyPickDate = earlyPickDate;
    }

    public String getLatePickDate() {
        return latePickDate;
    }

    public void setLatePickDate(String latePickDate) {
        this.latePickDate = latePickDate;
    }

    public String getEarlyDelDate() {
        return earlyDelDate;
    }

    public void setEarlyDelDate(String earlyDelDate) {
        this.earlyDelDate = earlyDelDate;
    }

    public String getLateDelDate() {
        return lateDelDate;
    }

    public void setLateDelDate(String lateDelDate) {
        this.lateDelDate = lateDelDate;
    }

    public String getMatCategory() {
        return matCategory;
    }

    public void setMatCategory(String matCategory) {
        this.matCategory = matCategory;
    }

    public String getTranscond() {
        return transcond;
    }

    public void setTranscond(String transcond) {
        this.transcond = transcond;
    }

    public String getEvent1Qc() {
        return event1Qc;
    }

    public void setEvent1Qc(String event1Qc) {
        this.event1Qc = event1Qc;
    }

    public String getEvent1Date() {
        return event1Date;
    }

    public void setEvent1Date(String event1Date) {
        this.event1Date = event1Date;
    }

    public String getEvent1Stop() {
        return event1Stop;
    }

    public void setEvent1Stop(String event1Stop) {
        this.event1Stop = event1Stop;
    }

    public String getEvent2Qc() {
        return event2Qc;
    }

    public void setEvent2Qc(String event2Qc) {
        this.event2Qc = event2Qc;
    }

    public String getEvent2Date() {
        return event2Date;
    }

    public void setEvent2Date(String event2Date) {
        this.event2Date = event2Date;
    }

    public String getEvent2Stop() {
        return event2Stop;
    }

    public void setEvent2Stop(String event2Stop) {
        this.event2Stop = event2Stop;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getThuCount() {
        return thuCount;
    }

    public void setThuCount(String thuCount) {
        this.thuCount = thuCount;
    }

    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    public String getEru() {
        return eru;
    }

    public void setEru(String eru) {
        this.eru = eru;
    }

    public String getPfsCount() {
        return pfsCount;
    }

    public void setPfsCount(String pfsCount) {
        this.pfsCount = pfsCount;
    }

    public String getBasecost() {
        return basecost;
    }

    public void setBasecost(String basecost) {
        this.basecost = basecost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAddCostTypeVal() {
        return addCostTypeVal;
    }

    public void setAddCostTypeVal(String addCostTypeVal) {
        this.addCostTypeVal = addCostTypeVal;
    }

    public String getAddCostType() {
        return addCostType;
    }

    public void setAddCostType(String addCostType) {
        this.addCostType = addCostType;
    }

    public String getAddCostTypeVal2() {
        return addCostTypeVal2;
    }

    public void setAddCostTypeVal2(String addCostTypeVal2) {
        this.addCostTypeVal2 = addCostTypeVal2;
    }

    public String getAddCostType2() {
        return addCostType2;
    }

    public void setAddCostType2(String addCostType2) {
        this.addCostType2 = addCostType2;
    }

    public String getAddCostTypeVal3() {
        return addCostTypeVal3;
    }

    public void setAddCostTypeVal3(String addCostTypeVal3) {
        this.addCostTypeVal3 = addCostTypeVal3;
    }

    public String getAddCostType3() {
        return addCostType3;
    }

    public void setAddCostType3(String addCostType3) {
        this.addCostType3 = addCostType3;
    }

    public String getAddCostTypeVal4() {
        return addCostTypeVal4;
    }

    public void setAddCostTypeVal4(String addCostTypeVal4) {
        this.addCostTypeVal4 = addCostTypeVal4;
    }

    public String getAddCostType4() {
        return addCostType4;
    }

    public void setAddCostType4(String addCostType4) {
        this.addCostType4 = addCostType4;
    }

    public String getHazmId() {
        return hazmId;
    }

    public void setHazmId(String hazmId) {
        this.hazmId = hazmId;
    }

    public String getOrType() {
        return orType;
    }

    public void setOrType(String orType) {
        this.orType = orType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    public String getReleaseAttribute() {
        return releaseAttribute;
    }

    public void setReleaseAttribute(String releaseAttribute) {
        this.releaseAttribute = releaseAttribute;
    }

    public String getMattype() {
        return mattype;
    }

    public void setMattype(String mattype) {
        this.mattype = mattype;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getIncoTemrs() {
        return incoTemrs;
    }

    public void setIncoTemrs(String incoTemrs) {
        this.incoTemrs = incoTemrs;
    }

    public String getEqGroupId() {
        return eqGroupId;
    }

    public void setEqGroupId(String eqGroupId) {
        this.eqGroupId = eqGroupId;
    }

    public String getEvent3Qc() {
        return event3Qc;
    }

    public void setEvent3Qc(String event3Qc) {
        this.event3Qc = event3Qc;
    }

    public String getEvent3Date() {
        return event3Date;
    }

    public void setEvent3Date(String event3Date) {
        this.event3Date = event3Date;
    }

    public String getEvent3Stop() {
        return event3Stop;
    }

    public void setEvent3Stop(String event3Stop) {
        this.event3Stop = event3Stop;
    }

    public String getOtc() {
        return otc;
    }

    public void setOtc(String otc) {
        this.otc = otc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReferenceGid() {
        return referenceGid;
    }

    public void setReferenceGid(String referenceGid) {
        this.referenceGid = referenceGid;
    }

    public String getReferenceVal() {
        return referenceVal;
    }

    public void setReferenceVal(String referenceVal) {
        this.referenceVal = referenceVal;
    }

    public String getReferenceGid2() {
        return referenceGid2;
    }

    public void setReferenceGid2(String referenceGid2) {
        this.referenceGid2 = referenceGid2;
    }

    public String getReferenceVal2() {
        return referenceVal2;
    }

    public void setReferenceVal2(String referenceVal2) {
        this.referenceVal2 = referenceVal2;
    }

    public String getReferenceGid3() {
        return referenceGid3;
    }

    public void setReferenceGid3(String referenceGid3) {
        this.referenceGid3 = referenceGid3;
    }

    public String getReferenceVal3() {
        return referenceVal3;
    }

    public void setReferenceVal3(String referenceVal3) {
        this.referenceVal3 = referenceVal3;
    }

    public String getReferenceGid4() {
        return referenceGid4;
    }

    public void setReferenceGid4(String referenceGid4) {
        this.referenceGid4 = referenceGid4;
    }

    public String getReferenceVal4() {
        return referenceVal4;
    }

    public void setReferenceVal4(String referenceVal4) {
        this.referenceVal4 = referenceVal4;
    }

    public String getReferenceGid5() {
        return referenceGid5;
    }

    public void setReferenceGid5(String referenceGid5) {
        this.referenceGid5 = referenceGid5;
    }

    public String getReferenceVal5() {
        return referenceVal5;
    }

    public void setReferenceVal5(String referenceVal5) {
        this.referenceVal5 = referenceVal5;
    }

    public String getReferenceGid6() {
        return referenceGid6;
    }

    public void setReferenceGid6(String referenceGid6) {
        this.referenceGid6 = referenceGid6;
    }

    public String getReferenceVal6() {
        return referenceVal6;
    }

    public void setReferenceVal6(String referenceVal6) {
        this.referenceVal6 = referenceVal6;
    }

    public String getCommCode() {
        return commCode;
    }

    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public String getOtm_sh_id() {
        return otm_sh_id;
    }

    public void setOtm_sh_id(String otm_sh_id) {
        this.otm_sh_id = otm_sh_id;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


}
