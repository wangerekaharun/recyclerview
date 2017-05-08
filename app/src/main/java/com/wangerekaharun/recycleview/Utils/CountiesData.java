package com.wangerekaharun.recycleview.Utils;

import com.wangerekaharun.recycleview.Models.Counties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harun on 5/8/17.
 */

public class CountiesData {
    public  static List<Counties>getCounties(){
        List<Counties>countiesList= new ArrayList<>();

        Counties counties= new Counties("Nairobi");
        countiesList.add(counties);

        Counties counties1= new Counties("Baringo");
        countiesList.add(counties1);

        Counties counties2= new Counties("Bungoma");
        countiesList.add(counties2);

        Counties counties3= new Counties("Uasin Gishu");
        countiesList.add(counties3);

        Counties counties4= new Counties("Embu");
        countiesList.add(counties4);

        Counties counties5= new Counties("Busia");
        countiesList.add(counties5);

        Counties counties6= new Counties("Homa Bay");
        countiesList.add(counties6);

        Counties counties9= new Counties("Kiambu");
        countiesList.add(counties9);

        Counties counties10= new Counties("Bomet");
        countiesList.add(counties10);

        Counties counties11= new Counties("Mombasa");
        countiesList.add(counties11);

        Counties counties12= new Counties("Kilifi");
        countiesList.add(counties12);

        return countiesList;
    }
}
