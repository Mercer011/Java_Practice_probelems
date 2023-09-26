public class Recursion5 {//printing reverse of a string

  public static void Rev(String s , int idx){
    if(idx==0){
      System.out.println(s.charAt(idx));
      return;
    }
    System.out.print(s.charAt(idx));
    Rev(s, idx-1);
  }
  public static void main(String[] args) {
    String s = "abhishek";
    Rev(s,s.length()-1);
  }
}
