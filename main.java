public class main {
  public static void main(String[] args){
  String[][] cars = {{"Verna","corvette","mustang"},{"i20","Baleno","Scorpio"}};
 
  for (int i=0; i<cars.length ; i++){
    System.out.println();
    for(int j=0;j<cars[i].length;j++){
      System.out.println(cars[i][j]+" ");
    }
  }
}
}
