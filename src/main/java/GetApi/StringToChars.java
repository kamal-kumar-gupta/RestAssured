package GetApi;

public class StringToChars {

    public static void main(String[] args) {

       String string = "Journal";
       char[] chars = string.toCharArray();
//        System.out.println(chars.length);
       for (char a : chars){
//           System.out.println(a);
       }

        //Copy string characters to char array

       char[] chars1 = new char[7];
       string.getChars(2,7,chars1,2);
        for (char aa : chars1){
            System.out.println(aa);
        }
    }
}
