/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spark.project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 *
 * @author Dell
 */
public class Example_1 {
    
    public static void main(String arg[]){
        
        List<Double> inputData= new ArrayList<>();
        inputData.add(35.5);
        inputData.add(122.3);
        inputData.add(32.5);
        inputData.add(98.5);
        inputData.add(20.5);
        
        Logger.getLogger("org.apache").setLevel(Level.WARNING);
        try{
            SparkConf conf = new SparkConf().setAppName("startingSpark").setMaster("local[*]");
            JavaSparkContext sc = new JavaSparkContext(conf);

            JavaRDD<Double> myRdd= sc.parallelize(inputData);
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
