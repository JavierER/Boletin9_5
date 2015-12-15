package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin9_5 {

    
    public static void main(String[] args) {
    String numelemento = JOptionPane.showInputDialog("Numero de elementos:");
    int sec = Integer.parseInt(numelemento);
    String elemento = JOptionPane.showInputDialog("elige opción:\n1) suma 2\n2) impar negativo par positivo\n3) fibonacci");
    int op = Integer.parseInt(elemento);
    switch (op){
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
        default:JOptionPane.showMessageDialog(null,"opción incorrecta.");
            break;
    }

    }
    
}
