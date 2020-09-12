package GetApi;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class StringSubStringExample {


    public static void main(String[] args) {

        String name = "Donald Trump";
//        System.out.println(name);
        name = name.substring(5);
//        System.out.println(name); // this will subtract the n number of char from the string and display onwards

        List<String> word = Arrays.asList(new String[]{"Hello","World","2020"});
        String name1 = String.join(" ", word);
        System.out.println(name1);



    }
}
