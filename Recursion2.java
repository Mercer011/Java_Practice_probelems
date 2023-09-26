public class Recursion2 {//factorial of a number
  public static int Calcfactorial(int n){
    if(n==1 || n==0){
      return 1;
    }
    int fact_nm1 = Calcfactorial(n-1);

    int fact = n*fact_nm1;
    return fact;
  }
  public static void main(String[] args) {
    int n =9;
    int ans = Calcfactorial(n);
    System.out.println(ans);

  }
}
