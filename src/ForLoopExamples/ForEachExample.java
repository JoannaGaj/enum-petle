package ForLoopExamples;

public class ForEachExample {
    public static void main(String[] args) {
     String[] names = {"Adam", "Ewa", "Ola", "Tomek"};

     for (String name:
        names) {
         System.out.println("Cześć " + name);
     }
     int[] numbers = {3,6,1,0};

     for(int number: numbers){
         System.out.println("Liczka to " + number);
     }

        System.out.println("");
     for(int i=0; i< names.length; i++){
         System.out.println("Cześć " + names[i]);
     }
    }
}
