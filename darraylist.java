import java.util.*;

public class darraylist {
  public static void main(String[] args){

    ArrayList<ArrayList<String>> GroceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

   ArrayList<String> produceList = new ArrayList();
   produceList.add("tomatoes");
   produceList.add("potatoes");
   produceList.add("cabbage");

   ArrayList<String> DrinksList = new ArrayList();
   DrinksList.add("coffee");
   DrinksList.add("tea");
   DrinksList.add("water");
   //adding all the lists to a single list using addAll() method of List interface
   GroceryList.add(produceList);
   GroceryList.add(DrinksList);
   GroceryList.add(bakeryList);
   
   System.out.println(GroceryList);
  }
}
