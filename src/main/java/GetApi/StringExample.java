package GetApi;

public class StringExample {

    public static void main(String[] args) {


        String string1= "abc";

        char[] myName = {'a','b','C'};

        String string2 = new String(myName);

//        System.out.println(string1);
//        System.out.println(string2);

        System.out.println(string1.equalsIgnoreCase(string2));


    }

}
