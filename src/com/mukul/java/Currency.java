package com.mukul.java;
/*
*  Working with Big Decimal
*
* */

import java.math.BigDecimal;

public class Currency {

    double value = .012;

    String val = Double.toString(value);
    BigDecimal bigValue = new BigDecimal(val);
    BigDecimal bSum =  bigValue.add(bigValue).add(bigValue).add(bigValue);

    Currency(){
         System.out.println("The sum of Big Decimal "+ bSum.toString());
    }

}
