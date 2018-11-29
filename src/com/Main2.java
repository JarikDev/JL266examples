package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        //posessive
        Pattern p11= Pattern.compile(".*+xx");
        Matcher m11=p11.matcher("yyxxxyxx");
        while (m11.find()){
            System.out.println(m11.start()+" "+m11.group()+" ");
        }
        System.out.println(" ");


    }
}
