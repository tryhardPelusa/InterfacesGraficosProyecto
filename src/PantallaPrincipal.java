import javax.swing.JFrame;
import javax.swing.UIManager;

public class PantallaPrincipal {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Pantalla Principal");

	}

	public PantallaPrincipal() {
		
	}


}
