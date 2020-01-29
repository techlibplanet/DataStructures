import java.util.Scanner;

public class LinearSearchAlgorithm {

    public static void main(String[]args){
        int[] array= new int[]{15,5,20,35,2,42,67,17};
        println("Enter element to find in array...");
        Scanner in = new Scanner(System.in);
        int findElement = in.nextInt();
        int result = linearSearchAlgorithm(array, findElement);
        if (result!=-1) println("Element is at " +result +" position."); else println("Element not found.");
    }

    // Linear search or Sequential Algorithm
    private static int linearSearchAlgorithm(int[] array, int find) {
        int temp = -1;
        for(int i=0; i<array.length; i++){
            if (array[i] == find){
                temp = i;
                break;
            }
        }
        return temp;
    }

    private static void println(String message){
        System.out.println(message);
    }
}
