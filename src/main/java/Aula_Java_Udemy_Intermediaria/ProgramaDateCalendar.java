package Aula_Java_Udemy_Intermediaria;

import Entidade.Calcular;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class ProgramaDateCalendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        java.util.Date d = Date.from(Instant.parse("2020-05-06T15:42:07Z"));

        System.out.println(sdf.format(d));

        /*Acrecentar ou diminuir horas utilizando metodo Calender*/

//        Calendar cal = Calendar.getInstance();
//        cal.setTime(d);
//        cal.add(Calendar.HOUR_OF_DAY, 4);
//        d = cal.getTime();
//
//        System.out.println(sdf.format(d));

        /*Manipulando horas por unidade de tempo(minutos)*/

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutos = cal.get(Calendar.MINUTE);/*Minutos*/
        int mes = 1 + cal.get(Calendar.MONTH); /*Mes*/

        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);

    }
}
