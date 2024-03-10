import javax.swing.JOptionPane;

/**
 * Esta clase contiene un método para ejecutar la lógica de una aplicación que solicita al usuario ingresar números enteros.
 */
public class App {

    /**
     * Método para ejecutar la lógica de la aplicación.
     */
    public static void miAppi(){
       
         // Variable para almacenar el número ingresado por el usuario
         int variableNumero = 0;

         // Solicitar al usuario que ingrese un número entero y manejar posibles excepciones
         do {
             try {
                 // Solicitar al usuario que ingrese un número entero usando un cuadro de diálogo
                 variableNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero", "App", JOptionPane.QUESTION_MESSAGE));
                
             } catch (NumberFormatException err) {
                 // Capturar la excepción si el usuario ingresa una entrada no válida (no es un número)
                 // Mostrar un mensaje de error
                 JOptionPane.showMessageDialog(null, err);
                 // Llamar recursivamente al método para volver a solicitar al usuario que ingrese un número
                 miAppi();
                 // Salir del ciclo actual y continuar con el siguiente ciclo
                 break;
             
             } catch(Exception err) {   
                 // Capturar otras excepciones no esperadas y mostrar un mensaje de error
                 JOptionPane.showMessageDialog(null, err);
             }
             // Repetir el ciclo hasta que el usuario ingrese "0"
         } while (variableNumero != 0);
    }
}
