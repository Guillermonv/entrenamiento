package com.example.entrenamiento._5_DatesLocalization._2_LocaleResourceBoundle;

import net.bytebuddy.asm.Advice;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
     int moneda = 5000;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(Locale.getDefault());
        System.out.println(numberFormat.format(moneda));

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat1.format(moneda));

        Currency currency = Currency.getInstance(Locale.GERMANY);
        System.out.println(currency.getDisplayName());

        Date date = new Date();
      //  Locale.setDefault(Locale.ITALY);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println(dateFormat.format(date));

        ResourceBundle resourceBundle = ResourceBundle.getBundle("application", Locale.CHINA);
        System.out.println(resourceBundle.getString("saludo"));
        System.out.println(resourceBundle.getString("contenido"));
    }

    static void incrementoneda (int moneda ){

    }
}

