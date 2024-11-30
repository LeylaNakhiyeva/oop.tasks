package person;

 public class Person {
     public static int counter=0;
       public Person(){
        counter++;
       }

    public static void printCounter(){
        System.out.println(counter);

    }
}
