package com.mukul.java;

/*
* Byte range between -128 to 127
* */

public class MaxValues {

    byte b=127;

    MaxValues(){

        System.out.println("Byte value is " + b);

        if(b < Byte.MAX_VALUE){
            b++; //Increment by 1
        }

        System.out.println("Byte value is " + b);
    }

}
