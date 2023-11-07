package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String>nombres=new ArrayList<>();
        nombres.add("Abel");
        nombres.add("tomas");
        nombres.add("lucas");
        nombres.add("Santiago");
        nombres.add("Christian");
        //Se aplica interface
        TransfString.transformador(nombres).forEach(System.out::println);
        //Se aplica un metodo
        //mayus(nombres).forEach(System.out::println);

        System.out.println(concatenar(nombres,5));
    }

    public static List<String>mayus(List<String>palabras){
        return palabras.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
    }
    public static String concatenar(List<String>palabras, int n){
        List<String>result=palabras.stream().filter(x->x.length()>n).collect(Collectors.toList());
        String cadena=String.join(", ",result);
        String msg=(cadena.equals(""))?"Null":cadena;
        return msg;
    }
}