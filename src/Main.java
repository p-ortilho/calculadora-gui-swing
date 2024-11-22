import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        // Janelas de input de valor
        String valor1 = JOptionPane.showInputDialog("Digite um valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite um segundo valor: ");

        // Casting de String para Double
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double resultado = num1 + num2;

        // Janela de resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}