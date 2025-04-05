package edu.ilkiv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
/*
  @author Bodya
  @project lab3
  @class ConverterTest
  version 1.0.0
  @since 05.04.2025 - 21:25 
*/

   
class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertToRoman(3));
    }

    @Test
    void whenArabic_4_ThenRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
    void whenArabic_5_ThenRoman_V() {
        Assertions.assertEquals("V", Converter.convertToRoman(5));
    }

    @Test
    void whenArabic_6_ThenRoman_VI() {
        Assertions.assertEquals("VI", Converter.convertToRoman(6));
    }

    @Test
    void whenArabic_8_ThenRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertToRoman(8));
    }

    @Test
    void whenArabic_9_ThenRoman_IX() {
        Assertions.assertEquals("IX", Converter.convertToRoman(9));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertToRoman(10));
    }

    @Test
    void whenArabic_11_ThenRoman_XI() {
        Assertions.assertEquals("XI", Converter.convertToRoman(11));
    }

    @Test
    void whenArabic_15_ThenRoman_XV() {
        Assertions.assertEquals("XV", Converter.convertToRoman(15));
    }

    @Test
    void whenArabic_18_ThenRoman_XVIII() {
        Assertions.assertEquals("XVIII", Converter.convertToRoman(18));
    }

    @Test
    void whenArabic_20_ThenRoman_XX() {
        Assertions.assertEquals("XX", Converter.convertToRoman(20));
    }

    @Test
    void whenArabic_28_ThenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", Converter.convertToRoman(28));
    }

    @Test
    void whenArabic_38_ThenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", Converter.convertToRoman(38));
    }

    @Test
    void whenArabic_40_ThenRoman_XL() {
        Assertions.assertEquals("XL", Converter.convertToRoman(40));
    }
    @Test
    void whenArabic_48_ThenRoman_XLVIII() {
        Assertions.assertEquals("XLVIII", Converter.convertToRoman(48));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", Converter.convertToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        Assertions.assertEquals("LVIII", Converter.convertToRoman(58));
    }

    @Test
    void whenArabic_88_ThenRoman_LXXXVIII() {
        Assertions.assertEquals("LXXXVIII", Converter.convertToRoman(88));
    }

    @Test
    void whenArabic_90_ThenRoman_XC() {
        Assertions.assertEquals("XC", Converter.convertToRoman(90));
    }

    @Test
    void whenArabic_98_ThenRoman_XCVIII() {
        Assertions.assertEquals("XCVIII", Converter.convertToRoman(98));
    }

    @Test
    void whenArabic_108_ThenRoman_CVIII() {
        Assertions.assertEquals("CVIII", Converter.convertToRoman(108));
    }

    @Test
    void whenArabic_399_ThenRoman_CCCXCIX() {
        Assertions.assertEquals("CCCXCIX", Converter.convertToRoman(399));
    }

    @Test
    void whenArabic_408_ThenRoman_CDVIII() {
        Assertions.assertEquals("CDVIII", Converter.convertToRoman(408));
    }

    @Test
    void whenArabic_599_ThenRoman_DXCIX() {
        Assertions.assertEquals("DXCIX", Converter.convertToRoman(599));
    }

    @Test
    void whenArabic_608_ThenRoman_DCVIII() {
        Assertions.assertEquals("DCVIII", Converter.convertToRoman(608));
    }

    @Test
    void whenArabic_908_ThenRoman_CMVIII() {
        Assertions.assertEquals("CMVIII", Converter.convertToRoman(908));
    }

    @Test
    void whenArabic_949_ThenRoman_CMXLIX() {
        Assertions.assertEquals("CMXLIX", Converter.convertToRoman(949));
    }

    @Test
    void whenArabic_1008_ThenRoman_MVIII() {
        Assertions.assertEquals("MVIII", Converter.convertToRoman(1008));
    }

    @Test
    void whenArabic_1108_ThenRoman_MCVIII() {
        Assertions.assertEquals("MCVIII", Converter.convertToRoman(1108));
    }

    @Test
    void whenArabic_1555_ThenRoman_MDLV() {
        Assertions.assertEquals("MDLV", Converter.convertToRoman(1555));
    }

    @Test
    void whenArabic_2888_ThenRoman_MMDCCCLXXXVIII() {
        Assertions.assertEquals("MMDCCCLXXXVIII", Converter.convertToRoman(2888));
    }

    @Test
    void whenArabic_3444_ThenRoman_MMMCDXLIV() {
        Assertions.assertEquals("MMMCDXLIV", Converter.convertToRoman(3444));
    }

    @Test
    void whenArabic_3666_ThenRoman_MMMDCLXVI() {
        Assertions.assertEquals("MMMDCLXVI", Converter.convertToRoman(3666));
    }

    @Test
    void whenArabic_4000_ThenRoman_MMMM() {
        Assertions.assertEquals("MMMM", Converter.convertToRoman(4000));
    }
}