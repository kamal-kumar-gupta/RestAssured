package GetApi;

public class StringPalindrome {

    public static void main(String[] args) {

        String a = "AMAZON";
        String name = "";

        for (int i = a.length()-1 ; i>=0;i-- ){
            name = name + (a.charAt(i));

        }

        System.out.println(name);
//        System.out.println(checkName("AmbaRani"));

    }

    public static String checkName(String name){
    if (name == null)
        return null;
    StringBuilder stringBuilder = new StringBuilder(name);
    stringBuilder.reverse();
    return stringBuilder.toString();




    }


}
