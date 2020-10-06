package com.codestone.firebasepattern;

import android.util.Log;

/**
 * FPattern
 * Rasel Khan
 * Time: 3:12 PM
 * Date: 10/6/2020
 */
public class FirebasePattern {

    //pattern is -> helloThisIsAPattern
    public String getOccupationPattern(String occupation){
        String value = "";
        String[] array = occupation.toLowerCase().split(" ");
        for(int index = 0;index<array.length;index++){
            if(!array[index].equals(",") || !array[index].equals("&")){
                value+= index == 0 ? array[index].replace(",","") : (array[index].substring(0,1).toUpperCase()+array[index].substring(1)).replace(",","").replace("&","");
            }
        }
        Log.d("occp",value);
        return value;
    }
    //pattern is -> Hello_This_Is_APattern
    public String getSpecialtyPattern(String specialty){
        Log.d("spp",specialty.replace(" ","_").replace(",","").replace("&",""));
        return specialty.replace(" ","_").replace(",","").replace("&","");
    }

}
