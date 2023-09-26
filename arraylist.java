import java.util.ArrayList;

public class arraylist {
  public static void main(String[] args) {
    {
      ArrayList<String> food = new ArrayList<String>();
      food.add("pizza");
      food.add("momo");
      food.add("chicken");
      food.add("burger");
      food.add("chips");
      food.add("biryani");
      food.add("egg");
      food.add("biscuit");
      food.add("hotdog");

      // food.clear();
      for(int i=0;i<food.size();i++){
        System.out.println(food.get(i));
      }
    }
  }
}

