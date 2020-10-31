package telas.av1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;

class NovoAluno extends JFrame {

	private JTextField nomeAluno;
	private JTextField numeroMatricula;
	private JTextField endecoEmail;
	private JTextField numroCelular;
	
	private class Cancelar extends JFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ("Cancelar".equals(e.getActionCommand()))
				System.exit(0);
		}
	}

	public NovoAluno() {

		super();
		NovoAlunoPainel();
	}

	protected void NovoAlunoPainel() {

		JPanel painel = new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

		JLabel lblNome = new JLabel("Nome: ");
		nomeAluno = new JTextField(30);
		JLabel lblamtricula = new JLabel("Matricula: ");
		numeroMatricula = new JTextField(30);
		JLabel lblEmail = new JLabel("Email: ");
		endecoEmail = new JTextField(30);
		JLabel lblCelular = new JLabel("Celular: ");
		numroCelular = new JTextField(30);

		Box linha1 = Box.createHorizontalBox();
		linha1.add(Box.createHorizontalGlue());
		linha1.add(lblNome);
		linha1.add(Box.createHorizontalGlue());
		linha1.add(nomeAluno);

		painel.add(linha1, BorderLayout.CENTER);

		Box linha2 = Box.createHorizontalBox();
		linha2.add(Box.createHorizontalGlue());
		linha2.add(lblamtricula);
		linha2.add(Box.createHorizontalGlue());
		linha2.add(numeroMatricula);
		painel.add(linha2, BorderLayout.CENTER);

		Box linha3 = Box.createHorizontalBox();
		linha3.add(lblEmail);
		linha3.add(endecoEmail);
		painel.add(linha3, BorderLayout.CENTER);

		Box linha4 = Box.createHorizontalBox();
		linha4.add(lblCelular);
		linha4.add(numroCelular);
		painel.add(linha4, BorderLayout.CENTER);

		JPanel botoes = new JPanel();
		botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton salvar = new JButton("Salvar");
		JButton cancelar = new JButton("Cancelar");
		botoes.add(cancelar);
		Cancelar fecharAluno = new Cancelar();
		cancelar.addActionListener(fecharAluno);
		botoes.add(salvar);
		botoes.setLocation(10, 10);

		//Orientação dos COmponetes na tela
		add(painel, BorderLayout.NORTH);
		add(botoes, BorderLayout.LINE_END);
	}
}
