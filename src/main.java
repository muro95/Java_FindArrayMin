import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(array);
        System.out.print("The smallest element in the array is: " + array[index]);
    }
    public static int minValue(int [] array){
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
