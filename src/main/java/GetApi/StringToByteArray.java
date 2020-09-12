package GetApi;

import java.util.Arrays;

public class StringToByteArray {

    public static void main(String[] args) {
        String str = "PANKAJ";
        byte[] byteArr = str.getBytes();
        // print the byte[] elements
        System.out.println("String to byte array: " + Arrays.toString(byteArr));

    for (byte bb : byteArr){
//        System.out.println(bb);
    }

    }
}


// https://www.journaldev.com/770/string-byte-array-java