package main.spilt_string;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplittingStrings {

    //TODO define the patter by which We want to spilt the string
    private static final Pattern REGEX = Pattern.compile(" ");

    public static void main(String[] args) {

        String  rawData = "My Name is going to write in spilt form";
        System.out.println("Row Data : "+rawData);
       String [] spilattedArray =  REGEX.split(rawData);

        System.out.println("Performant split: ");
        for (String data : spilattedArray) {
            System.out.println(data);
        }
    }

}