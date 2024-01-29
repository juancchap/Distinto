package distinto;
//Importacion de libreria

import javax.swing.JOptionPane;

public class Distinto {

    public static void main(String[] args) {
 //Declaracion de variables
        int numero, dato = 5;
//mandamos un mensaje para que el usuario nos diguite un numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
//si el numero es distinto de dato
        if (numero != dato) {
            JOptionPane.showMessageDialog(null, " lo siento El numero es diferente de 5");
        } //si el numero es igual de dato
        else {
            JOptionPane.showMessageDialog(null, "Felicidades El numero es  5");
        }

    }

}
