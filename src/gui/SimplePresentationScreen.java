package gui;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField tfGitHub;
	private JTextField tfEmail;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfLU;
	private JLabel lbFoto;

	public SimplePresentationScreen(Student studentData) {
		setBackground(new Color(255, 204, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setForeground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 290));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 204, 255));
		tabbedPane.setBounds(5, 5, 430, 213);
		tabInformation = new JPanel();
		tabInformation.setBackground(new Color(204, 255, 255));
		tabInformation.setForeground(new Color(255, 204, 255));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		//Labels
		JLabel lbLU = new JLabel("LU:");
		lbLU.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbLU.setForeground(new Color(255, 105, 180));
		lbLU.setBounds(10, 12, 49, 14);
		tabInformation.add(lbLU);
			
		JLabel lbApellido = new JLabel("Apellido:");
		lbApellido.setForeground(new Color(255, 105, 180));
		lbApellido.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbApellido.setBounds(10, 45, 81, 14);
		tabInformation.add(lbApellido);
		
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbNombre.setForeground(new Color(255, 105, 180));
		lbNombre.setBounds(10, 80, 81, 14);
		tabInformation.add(lbNombre);
		
		JLabel lbEmail = new JLabel("E-mail:");
		lbEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbEmail.setForeground(new Color(255, 105, 180));
		lbEmail.setBounds(10, 115, 49, 14);
		tabInformation.add(lbEmail);
		
		JLabel lbGitHub = new JLabel("Github URL:");
		lbGitHub.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbGitHub.setForeground(new Color(255, 105, 180));
		lbGitHub.setBounds(10, 150, 81, 14);
		tabInformation.add(lbGitHub);
		
		lbFoto = new JLabel(new ImageIcon(getClass().getResource(studentData.getPathPhoto())));
		lbFoto.setForeground(new Color(255, 255, 204));
		lbFoto.setBackground(new Color(255, 255, 204));
		lbFoto.setBounds(445, 28, 140, 190);
		contentPane.add(lbFoto);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDate fechaActual = LocalDate.now();
		LocalTime horaActual = LocalTime.now();
		

		JLabel lbFechayHora = new JLabel("Esta ventana fue generada el " + formatoFecha.format(fechaActual) + " a las " + formatoHora.format(horaActual));
		lbFechayHora.setForeground(new Color(255, 51, 153));
		lbFechayHora.setBackground(new Color(255, 204, 255));
		lbFechayHora.setFont(new Font("Perpetua", Font.BOLD, 18));
		lbFechayHora.setBounds(15, 223, 420, 21);
		contentPane.add(lbFechayHora);

		//texts
		tfLU = new JTextField();
		tfLU.setBackground(new Color(204, 255, 255));
		tfLU.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfLU.setForeground(new Color(255, 20, 147));
		tfLU.setEditable(false);
		tfLU.setBounds(135, 9, 255, 20);
		tabInformation.add(tfLU);
		tfLU.setColumns(10);
		tfLU.setText("" + studentData.getId());
	
		tfApellido = new JTextField();
		tfApellido.setBackground(new Color(204, 255, 255));
		tfApellido.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfApellido.setForeground(new Color(255, 20, 147));
		tfApellido.setEditable(false);
		tfApellido.setBounds(135, 43, 255, 20);
		tabInformation.add(tfApellido);
		tfApellido.setColumns(10);
		tfApellido.setText(studentData.getLastName());
		
		tfNombre = new JTextField();
		tfNombre.setBackground(new Color(204, 255, 255));
		tfNombre.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNombre.setForeground(new Color(255, 20, 147));
		tfNombre.setEditable(false);
		tfNombre.setBounds(135, 77, 255, 20);
		tabInformation.add(tfNombre);
		tfNombre.setColumns(10);
		tfNombre.setText(studentData.getFirstName());
		
		tfEmail = new JTextField();
		tfEmail.setBackground(new Color(204, 255, 255));
		tfEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfEmail.setForeground(new Color(255, 20, 147));
		tfEmail.setEditable(false);
		tfEmail.setBounds(135, 113, 255, 20);
		tabInformation.add(tfEmail);
		tfEmail.setColumns(10);
		tfEmail.setText(studentData.getMail());
		
		tfGitHub = new JTextField();
		tfGitHub.setBackground(new Color(204, 255, 255));
		tfGitHub.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfGitHub.setForeground(new Color(255, 20, 147));
		tfGitHub.setEditable(false);
		tfGitHub.setBounds(135, 148, 255, 20);
		tabInformation.add(tfGitHub);
		tfGitHub.setColumns(10);
		tfGitHub.setText(studentData.getGithubURL());
		
		
		contentPane.add(tabbedPane);
		
	}
}
