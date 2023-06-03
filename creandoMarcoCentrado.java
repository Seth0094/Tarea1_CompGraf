package graficos;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

//giorgio baglieri 29.599.848

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		marcoCentrado miMarco = new marcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class marcoCentrado extends JFrame {
	
	public marcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamañoPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamañoPantalla.height;
		int anchoPantalla = tamañoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}