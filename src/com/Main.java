package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("ab");
        Matcher m=p.matcher("abababa");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }
        System.out.println(" ");


        Pattern p2= Pattern.compile("aba");
        Matcher m2=p2.matcher("abaaaba");
        while (m2.find()){
            System.out.println(m2.start()+" "+m2.group()+" ");
        }
        System.out.println(" ");

       // Pattern p3= Pattern.compile("\\d");
        Pattern p3= Pattern.compile("\\d+");
        Matcher m3=p3.matcher("a12c3e456f");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group()+" ");
        }
        System.out.println(" ");

        Pattern p4= Pattern.compile("\\w");
        Matcher m4=p4.matcher("a 1 56 Z");
        while (m4.find()){
            System.out.println(m4.start()+" "+m4.group()+" ");
        }
        System.out.println(" ");

        Pattern p5= Pattern.compile("[a-c]");
        Matcher m5=p5.matcher("abc");
        while (m5.find()){
            System.out.println(m5.start()+" "+m5.group()+" ");
        }
        System.out.println(" ");


        Pattern p6= Pattern.compile("proj1([^,])*");
        Matcher m6=p6.matcher("proj3.txt,proj1sched.dpf,proj1,proj2,proj.java");
        while (m6.find()){
            System.out.println(m6.start()+" "+m6.group()+" ");
        }
        System.out.println(" ");

        Pattern p7= Pattern.compile("\\d\\d\\d([-\\s])\\d\\d\\d\\d");
        Matcher m7=p7.matcher("123 4567");
        while (m7.find()){
            System.out.println(m7.start()+" "+m7.group()+" ");
        }
        System.out.println(" ");


        Pattern p8= Pattern.compile("a.c");
        Matcher m8=p8.matcher("ac abc a c");
        while (m8.find()){
            System.out.println(m8.start()+" "+m8.group()+" ");
        }
        System.out.println(" ");

        //greedy
        Pattern p9= Pattern.compile(".*xx");
        Matcher m9=p9.matcher("yyxxxyxx");
        while (m9.find()){
            System.out.println(m9.start()+" "+m9.group()+" ");
        }
        System.out.println(" ");

        //reluctant
        Pattern p10= Pattern.compile(".*?xx");
        Matcher m10=p10.matcher("yyxxxyxx");
        while (m10.find()){
            System.out.println(m10.start()+" "+m10.group()+" ");
        }
        System.out.println(" ");

        //posessive
        Pattern p11= Pattern.compile(".*+xx");
        Matcher m11=p11.matcher("yyxxxyxx");
        while (m11.find()){
            System.out.println(m11.start()+" "+m11.group()+" ");
        }
        System.out.println(" ");


    }
}
