import java.util.ArrayList;

public class A2rraylist {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> KitchenList = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("Cakes");
        bakerylist.add("Pastries");
        bakerylist.add("Biscuits");

        ArrayList<String> Grocerylist = new ArrayList();

        Grocerylist.add("Chawal");
        Grocerylist.add("Besan");
        Grocerylist.add("Maida");

        ArrayList<String> Drinkslist = new ArrayList();

        Drinkslist.add("Soda");
        Drinkslist.add("Coffee");

        KitchenList.add(bakerylist);
        KitchenList.add(Grocerylist);
        KitchenList.add(Drinkslist);

        System.out.println(KitchenList);










    }
}
