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
	private JComboBox comboBoxApuestas;
	private JMenuBar menuBar;
	private JComboBox comboBoxLigas;
	private JComboBox comboBoxEquipos;
	private JButton btnCuenta;
	private JButton btnSignOut;
	private JPanel panelLigasPublicas;
	private JPanel panelLigasPrivadas;

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
		
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBounds(62, 11, 885, 35);
		contentPane.add(menuBar);
		
		comboBoxLigas = new JComboBox();
		comboBoxLigas.setModel(new DefaultComboBoxModel(new String[] {"Ligas", "Crear Liga", "Unirse a Liga", "Ver Ligas"}));
		menuBar.add(comboBoxLigas);
		
		comboBoxApuestas = new JComboBox();
		comboBoxApuestas.setModel(new DefaultComboBoxModel(new String[] {"Apuestas", "Mis Apuestas", "Apostar"}));
		menuBar.add(comboBoxApuestas);
		
		comboBoxEquipos = new JComboBox();
		comboBoxEquipos.setModel(new DefaultComboBoxModel(new String[] {"Equipos", "Unirse a equipo", "Crear equipo"}));
		menuBar.add(comboBoxEquipos);
		
		btnCuenta = new JButton("Mi cuenta");
		menuBar.add(btnCuenta);
		
		btnSignOut = new JButton("Sign Out");
		menuBar.add(btnSignOut);
		
		panelLigasPublicas = new JPanel();
		panelLigasPublicas.setBounds(62, 111, 313, 355);
		contentPane.add(panelLigasPublicas);
		
		panelLigasPrivadas = new JPanel();
		panelLigasPrivadas.setBounds(419, 111, 313, 355);
		contentPane.add(panelLigasPrivadas);
	}
}
