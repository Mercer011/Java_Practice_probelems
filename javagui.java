import javax.swing.*;
public class javagui {
  public static void main(String[] args){
  
    String name = JOptionPane.showInputDialog("what is your name:");
    JOptionPane.showMessageDialog(null,"hello "+name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age:"));
    JOptionPane.showMessageDialog(null,"you are "+age +" years old");

  }
}
