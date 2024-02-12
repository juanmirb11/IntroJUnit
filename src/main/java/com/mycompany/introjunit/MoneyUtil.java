/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjunit;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Juanmi
 */
class MoneyUtil {

    public static String format(double money) {
        BigDecimal roundedMoney = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP);
        return "$" + roundedMoney;
    }
}
