import java.util.Scanner;
public class UserInputt {

    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter a number: ");

            int x = Input.nextInt();
            arr[i] = x;
        }
        for(int i = 4;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
}
