/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjunit;

import java.util.Locale;

/**
 *
 * @author Juanmi
 */
class MoneyUtil {

    public static String format(double money) {
        return format(money, "€");
    }

    public static String format(double money, String symbol) {
        if (!(symbol instanceof String)) {
            throw new IllegalArgumentException();
        }
        if (money < 0) {
            symbol = "-" + symbol;
            money *= -1;
        }
        String roundedMoney = String.format(Locale.US, "%.2f", money);
        return symbol + roundedMoney;
    }
}
