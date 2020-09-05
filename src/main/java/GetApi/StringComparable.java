package GetApi;

public class StringComparable {

    public static void main(String[] args) {
        
        String string1 = "abcd";

         String string2 = "def";
          String string3 = "ABC";
           String string4 = "ABCD";


        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string3));
        System.out.println(string1.compareTo(string4));

                                                          
        System.out.println(string1.equalsIgnoreCase(string2));
        System.out.println(string1.equalsIgnoreCase(string4));


    }

}
