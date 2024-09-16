package org.example.e138;
public class E138AccessModifiers {

       private static String privateMethod(){
               return "private";
}
       static String defaultMethod() {
              return "default";
       }

       protected static String protectedMethod() {
              return "protected";
       }

       public static String publicMethod() {
              return "public";
       }

       public static void main(String[] args) {

              //System.out.println(E138AccessModifiers.privateMethod());
              System.out.println(E138AccessModifiers.defaultMethod());
              System.out.println(E138AccessModifiers.protectedMethod());
              System.out.println(E138AccessModifiers.publicMethod());
       }
}
