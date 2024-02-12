/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juanmi
 */
public class MoneyUtilTest {

    public MoneyUtilTest() {
    }

    @Test
    public void testFormat() {
        double money = 1000;
        String expResult = "€1000.00";
        String result = MoneyUtil.format(money);
        assertEquals(expResult, result);
    }

}
