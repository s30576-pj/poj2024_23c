package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GenericList<String> stringList = new GenericList<>();
        stringList.add("Ala");
        stringList.add("ma");
        stringList.add("kota");

        List<String> moreStrings = new ArrayList<>();
        moreStrings.add("a");
        moreStrings.add("kot");
        moreStrings.add("ma");
        moreStrings.add("Ale");
        stringList.addAll(moreStrings);

        List<String> uppercaseStrings = stringList.getList().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);
    }
}