package org.example.e184;


import java.util.ArrayList;
import java.util.List;

public class E184List {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Argentina");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");


        List<String> updatedCountries = removeCountriesStartingWithA(countries);
        System.out.println(updatedCountries);
    }

    public static List<String> removeCountriesStartingWithA(List<String> countryList) {

        countryList.removeIf(country -> country.startsWith("A"));
        return countryList;

    }
}
