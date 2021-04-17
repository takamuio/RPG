package Viewers;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Point;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class Tela01 extends JFrame {
	private JTextField txtBemVindoJogador;

	/**
	 * Create the panel.
	 */
	public Tela01() {
		
		txtBemVindoJogador = new JTextField();
		txtBemVindoJogador.setDisabledTextColor(Color.BLACK);
		txtBemVindoJogador.setCaretColor(Color.RED);
		txtBemVindoJogador.setHorizontalAlignment(SwingConstants.CENTER);
		txtBemVindoJogador.setFont(new Font("Candara", Font.PLAIN, 11));
		txtBemVindoJogador.setText("Bem vindo jogador");
		getContentPane().add(txtBemVindoJogador, BorderLayout.NORTH);
		txtBemVindoJogador.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setMaximumSize(new Dimension(750, 750));
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JTextArea txtrAPartirDe = new JTextArea();
		txtrAPartirDe.setText("A partir de agora, vamos come\u00E7ar nossa nova aventura. \n"
				+ "Uma aventura pelas terras magicas de Forgotten Realms \n"
				+ "Você será o novo Herói que salvara nosso lar \n"
				+ "Preparece para a aventura !");
		panel.add(txtrAPartirDe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.DARK_GRAY);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Come\u00E7ar Aventura !");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		panel_1.add(btnNewButton);

	}

}
