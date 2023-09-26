//package dscodes.problems;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static void push(int elem){
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(elem);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    static int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        char choice = 'y';
        do{
            System.out.println("Stack : ");
// Code to display stack. . . .
            System.out.println("1. Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int elem = sc.nextInt();
                    push(elem);
                    break;
                case 2:
                    int poppedElem = pop();
                    if (poppedElem== -1)
                        System.out.println("Stack is empty!!");
                    else
                        System.out.println(poppedElem);

                    break;
                    
// case 3: // Do nothing and exit the code...
                default:
                    System.out.println("Wrong Choice!!");
            }
            System.out.println("The stack now is : ");
            System.out.println(q1 + " <--(top)");
            System.out.println("Do you want to continue (y/n):");
            choice = sc.next().charAt(0);
        }while(choice=='y' || choice=='Y');
    }

    public static void main(String[] args) {
        menu();
    }
    
}
