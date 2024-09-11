import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args)
    {
        Calculadora cal = new Calculadora();
        String texto = JOptionPane.showInputDialog(null, "ingrese la operacion , + - * /");
        String[] div = texto.split(" ");

        try
        {
            Float a = Float.parseFloat(div[0]);
            Float b = Float.parseFloat(div[2]);
            switch (div[1])
            {
                case "+":
                    JOptionPane.showMessageDialog(null,"la Suma es : " + cal.Suma(a,b));
                break;
                case "-":
                    JOptionPane.showMessageDialog(null,"la Resta es : " + cal.Resta(a,b));
                break;
                case "*":
                    JOptionPane.showMessageDialog(null,"la Multiplicacion es : " + cal.Multiplicar(a,b));
                break;
                case "/":
                    if (b == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre 0");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La división es: " + cal.Dividir(a, b));
                    }
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Operador no válido");
                break;
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos.");
            return;
        }

        
    }
    Float Suma(Float a, Float b)
    {
        return(a + b);
    }
    Float Resta(Float a, Float b)
    {
        return(a - b);
    }
    Float Multiplicar(Float a, Float b)
    {
        return(a * b);
    }
    Float Dividir(Float a, Float b)
    {
        return(a / b);
    }
}