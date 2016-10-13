//package com.ebs.Tools;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//
///**
// * Created by lukasz.homik on 2016-10-12.
// */
//public class ValidationReport {
//    private String filename;
//
//    public ValidationReport(String filename) {
//        this.filename = filename;
//    }
//
//    public void CreateFile(){
//
//    }
//    public void StoreData(){
//
//        int str;
//        StringBuilder response= new StringBuilder();
//
//        char[] buff = new char[1024];
//        try {
//            File fileToRead = new File(filename);
//            BufferedReader br = new BufferedReader(new FileReader(fileToRead));
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
//}
