import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class Colores{
    static JFrame framePrincipal;

    static JButton colorRojo;
   static JButton colorAzul;
   static JButton colorNegro;
   static JButton colorAmarillo;
   static JButton colorMorado;
   static JButton colorBlanco;

   static JScrollPane  scrollBarRojo;
   static JScrollPane  scrollBarCian;
   static JScrollPane  scrollBarGreen;
    
   static JLabel labelRojo;
   static JLabel labelCian;
   static JLabel labelGreen;

   static JTextArea areaRojo;
   static JTextArea areaCian;
   static JTextArea areaGreen;

    public static JPanel panelDerecha(){
    
        JPanel panelDerecha;
        botonesColores();


           panelDerecha =new JPanel(new GridLayout(6,1));
            panelDerecha.add(colorRojo);
            panelDerecha.add(colorAzul);
            panelDerecha.add(colorNegro);
            panelDerecha.add(colorAmarillo);
            panelDerecha.add(colorMorado);
            panelDerecha.add(colorBlanco);

            return panelDerecha; 
}

public static JPanel panelIzquierda(){
        JPanel panelIzquierda;


           panelIzquierda =new JPanel(new GridLayout(1,3));


          scrollBarRojo =new JScrollPane();
          scrollBarGreen=new JScrollPane();
          scrollBarCian=new JScrollPane();


          scrollBarRojo.setPreferredSize(new Dimension(30, 20));
        scrollBarGreen.setPreferredSize(new Dimension(30, 20));
        scrollBarCian.setPreferredSize(new Dimension(30, 20));


scrollBarRojo.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scrollBarRojo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
scrollBarGreen.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scrollBarGreen.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
scrollBarCian.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scrollBarCian.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

          panelIzquierda.add(scrollBarRojo);
          panelIzquierda.add(scrollBarGreen);
          panelIzquierda.add(scrollBarCian);

            return panelIzquierda; 
}

public static JPanel panelAbajo(){
        JPanel panelAbajo;


           panelAbajo =new JPanel(new GridLayout(1,6));

            labelRojo=new JLabel("Rojo");

            labelRojo.setBackground(Color.red);
            areaRojo=new JTextArea();
            labelRojo.setOpaque(true);
            labelGreen=new JLabel("Green");
            labelGreen.setBackground(Color.green);
            areaGreen=new JTextArea();
            labelGreen.setOpaque(true);
            labelCian=new JLabel("AzulonNenita");
            labelCian.setBackground(Color.blue);
            areaCian=new JTextArea();
            labelCian.setOpaque(true);

            panelAbajo.add(labelRojo);
        panelAbajo.add(areaRojo);
        panelAbajo.add(labelGreen);
        panelAbajo.add(areaGreen);
        panelAbajo.add(labelCian);
        panelAbajo.add(areaCian);



            return panelAbajo; 
}

public static void botonesColores(){
    colorRojo=new JButton();
    colorAzul=new JButton();
    colorNegro=new JButton();
    colorAmarillo=new JButton();
    colorMorado=new JButton();
    colorBlanco=new JButton();

    //TO DO

    colorRojo.setBackground(Color.red);
    colorAzul.setBackground(Color.blue);
    colorNegro.setBackground(Color.BLACK);
    colorAmarillo.setBackground(Color.yellow);
    colorMorado.setBackground(new Color(87,35,100));
    colorBlanco.setBackground(Color.white);


}

    public static void crearFramePrincipal(){
        framePrincipal=new JFrame();

                framePrincipal.setTitle("Titulo Generico");
                             framePrincipal.getContentPane().setBackground(Color.black);
            framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            framePrincipal.setSize(400,400);
            framePrincipal.add(panelDerecha(),BorderLayout.EAST);
            framePrincipal.add(panelIzquierda(),BorderLayout.WEST);
            framePrincipal.add(panelAbajo(),BorderLayout.SOUTH);

            framePrincipal.setVisible(true);
           

            }
            public static void main(String[] args) {
                crearFramePrincipal();
                FuncionesColores.todoAbsoluto();
            }

}
