import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        String firstNumber = JOptionPane.showInputDialog("enter first intergr");
        String secondNumber = JOptionPane.showInputDialog("enter second intergr");


        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "sum" + sum, "sum of two Int", JOptionPane.PLAIN_MESSAGE);
    }

}
