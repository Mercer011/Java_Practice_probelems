public class Recursion6 {
  public static int first = -1;
  public static int last = -1;

  public static void FindOccurance(String s, int idx , char element){
    if(idx==s.length()){
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char currChar = s.charAt(idx);
    if(currChar==element){
      if(first == -1){
        first = idx;
      }else{
        last=idx;
      }
    }
    FindOccurance(s, idx+1, element);
  }
  public static void main(String[] args) {
    String s ="aaamiiijeetommaarrrr";
    FindOccurance(s, 0,'a');
    
  }
}
