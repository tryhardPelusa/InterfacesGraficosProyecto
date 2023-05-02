package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JComboBox comboBoxLigas;
	private JComboBox comboBoxApuestas;
	private JComboBox comboBoxEquipos;
	private JButton btnMiCuenta;
	private JButton btnSignOut;

	public static void main(String[] args) {

		PPrincipal frame = new PPrincipal();
		frame.setVisible(true);

	}

	public PPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(62, 11, 885, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		comboBoxLigas = new JComboBox();
		comboBoxLigas.setModel(new DefaultComboBoxModel(new String[] {"Ligas", "Crear Liga", "Unirse a Liga", "Ver Ligas"}));
		comboBoxLigas.setBounds(10, 0, 96, 35);
		panel.add(comboBoxLigas);
		
		comboBoxApuestas = new JComboBox();
		comboBoxApuestas.setModel(new DefaultComboBoxModel(new String[] {"Apuestas", "Mis Apuestas", "Apostar"}));
		comboBoxApuestas.setBounds(116, 0, 96, 35);
		panel.add(comboBoxApuestas);
		
		comboBoxEquipos = new JComboBox();
		comboBoxEquipos.setModel(new DefaultComboBoxModel(new String[] {"Equipos", "Unirse a equipo", "Crear Equipo"}));
		comboBoxEquipos.setBounds(222, 0, 96, 35);
		panel.add(comboBoxEquipos);
		
		btnMiCuenta = new JButton("Mi Cuenta");
		btnMiCuenta.setBounds(678, 0, 96, 35);
		panel.add(btnMiCuenta);
		
		btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(779, 0, 96, 35);
		panel.add(btnSignOut);
	}
}
