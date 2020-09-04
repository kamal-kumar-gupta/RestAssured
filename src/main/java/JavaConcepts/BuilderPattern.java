package JavaConcepts;

public class BuilderPattern {

    public BuilderPattern M1(){
        System.out.println("M1");
        return this;
    }

    public BuilderPattern M2(String string){
        System.out.println("Pass string is " + string);
        return this;
    }
    public BuilderPattern M3(){
        System.out.println("M3");
        return this;
    }
    public static void main(String[] args) {


    BuilderPattern nbp = new BuilderPattern();
    nbp.M1().M2("Kamal").M3();





}
}