import  java.util.*;
public class conditionstmt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // if (age >=18){
    //   System.out.println("you're and adult");
    //   }else{
    //     System.out.println("you're not an adult");
    //   }
    // }

    // int x = sc.nextInt();

    // if(x%2==0){
    //   System.out.print("even number ");
    // }else{
    //   System.out.print("odd number ");
    // }
    // }
    int button = sc.nextInt();

    switch (button) {
      case 1: System.out.println("hello");
        
        break;
      case 2: System.out.println("Namaste");
        break;
      case 3: System.out.println("Bonjour");  

  
    
      default:System.out.println("chal bye");
        break;
    }
  }


  }
