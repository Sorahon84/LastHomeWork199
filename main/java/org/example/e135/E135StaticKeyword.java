package org.example.e135;

public class E135StaticKeyword {
static String surround(String s,String search_term){
    s = s.replaceAll(search_term, "(" + search_term + ")");
    return s;
}
  
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o"));//"techn(o)l(o)gy"
        //System.out.println(surround("syntax","y"));
    }
}

