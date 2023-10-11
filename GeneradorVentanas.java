import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeneradorVentanas extends JFrame {
     GeneradorVentanas(String titulo,int alto, int ancho, int posX, int posY) {
        
        super(titulo);
        setSize(ancho,alto);
       // setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        GeneradorVentanas miVentana = new GeneradorVentanas("Prueba de crear ventanas",200,400,150,150);
        GeneradorVentanas vetanaBonita= new GeneradorVentanas("Manolito",1000,79,50,50);
    }
}
