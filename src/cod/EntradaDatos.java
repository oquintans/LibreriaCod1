package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @param 0 o 1. 0= pide datos por consola, 1= pide datos en una ventana
 * emergente
 * @return un valor numerico o 0 en caso de introducir un parámetro mal
 * @author oquintansocampo
 */
public class EntradaDatos {

    public int introducir(int t) {
        int r = 0;
        if (t == 0) {
            System.out.println("Introducir Datos");
            Scanner dato = new Scanner(System.in);
            r = dato.nextInt();
        } else if (t == 1) {
            r = Integer.parseInt(JOptionPane.showInputDialog("Introducir Datos"));

        }
        return r;
    }
}
