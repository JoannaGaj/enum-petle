package WhileLoopExamples;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        int[] numbers = {20, 0, 11, 3, 6};

        printNumbers(10);
        System.out.println("Wartości tablicy:");
        printTableElements(numbers);
    }

    public static void printNumbers(int numberCount) {
        int i = 0;
        while (i < numberCount) {
            System.out.println(i + 1);
            i++;
        }
    }
    public static void printTableElements(int[] tab){
        int i=0;
        while(i< tab.length){
            System.out.println(tab[i]);
            i++;
        }
    }
}
