 public class Test {
    public static void main(String... args) {
        System.out.println(sum(1,2,3,4));
    }
    public static int sum(int a, int b){
        return(a+b);
    }
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
