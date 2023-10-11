import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FuncionesColores {
    public static void todoAbsoluto(){
        accionesColores();
    }
   


public static void accionesColores(){
                Colores.colorRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento){
                Colores.framePrincipal=(JFrame) SwingUtilities.getWindowAncestor(Colores.colorRojo);
                Colores.framePrincipal.getContentPane().setBackground(Color.red);
            }
        });
}

}
