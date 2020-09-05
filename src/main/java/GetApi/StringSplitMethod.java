package GetApi;

public class StringSplitMethod {
    public static void main(String[] args) {

        String name = "my/name/is/kamal/kumar/gupta";
        String [] strings = name.split("/");
        System.out.println("split string using only regex:");

        for (String a : strings){
            System.out.println(a);
        }


        System.out.println("split string using regex with limit:");
        String[] strings1 = name.split("/",3);
        for (String bb : strings1){
            System.out.println(bb);
        }





    }




}
