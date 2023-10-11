/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brcordeiro
 */
import javax.swing.*;
import java.awt.*;

/**
 * Ejemplo de uso del GridBagLayout. Ya está todo correctamente colocado.
 */
public class CosicaBonica20 extends JFrame {
    JTextArea cajaTexto;
    JButton  boton2, boton4;
    JTextField campoTexto;
    JLabel texto1;
    JCheckBox check;
    /**
     * Constructor por defecto.
     */
    public CosicaBonica20
() {
        super("Ejemplo 3 GridBagLayout");
        this.getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        cajaTexto = new JTextArea("Introduce un texto cualquiera");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        // El area de texto debe estirarse en ambos sentidos.
        constraints.fill = GridBagConstraints.CENTER;
        constraints.weighty = 1.0;
        this.getContentPane().add(cajaTexto, constraints);
        constraints.weighty = 0.0;

        check = new JCheckBox("Esto es solo un texto");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.getContentPane().add(check, constraints);
        constraints.weighty = 0.0;
/* 

        texto1 = new JLabel("Esto es solo un texto");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.getContentPane().add(texto1, constraints);
        constraints.weighty = 0.0;

       
        // El botón 1 debe ocupar la posición NORTH de su celda
        // constraints.anchor = GridBagConstraints.NORTH;
        // El botón 1 no debe estirarse. Habíamos cambiado este valor en el
        // area de texto, asi que lo restauramos.
        constraints.fill = GridBagConstraints.NONE;
        this.getContentPane().add(texto1, constraints);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weighty = 0.0;

        */

        campoTexto = new JTextField("Campo texto");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.getContentPane().add(campoTexto, constraints);
        constraints.weighty = 0.0;
        // El campo de texto debe estirarse sólo en horizontal.
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.getContentPane().add(campoTexto, constraints);
        
    }

    public static void main(String args[]) {
        CosicaBonica20
    
     miVentana = new CosicaBonica20
    
    ();
        miVentana.setSize(300, 200);
        miVentana.setVisible(true);
    }

}
