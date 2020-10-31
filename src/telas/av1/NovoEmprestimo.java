package telas.av1;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovoEmprestimo extends JFrame {
	
	JLabel lblAluno = new JLabel("Aluno: ");
	JComboBox<String> nomeAluno = new JComboBox<String>();
	JLabel lblLivro = new JLabel("Livro: ");
	JComboBox<String> nomeLivro = new JComboBox<>();
	JLabel lblDataEmprestimo = new JLabel("Data do empréstimo: ");
	JTextField dataEmprestimo = new JTextField(10);
	JLabel lblDataDevolucao = new JLabel("Data prevista para Devolução: ");
	JTextField dataDevolucao = new JTextField(10);
	
	private class Cancelar extends JFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ("Cancelar".equals(e.getActionCommand()))
				System.exit(0);
		}
	}

	public NovoEmprestimo() {

		super();
		NovoEmprestimo();
	}

	public void NovoEmprestimo() {
		
		JPanel painel = new JPanel();
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		
		Box linha1 = Box.createHorizontalBox();
		linha1.add(lblAluno);
		linha1.add(nomeAluno);

		painel.add(linha1, BorderLayout.CENTER);

		Box linha2 = Box.createHorizontalBox();
		linha2.add(lblLivro);
		linha2.add(nomeLivro);
		painel.add(linha2, BorderLayout.CENTER);

		Box linha3 = Box.createHorizontalBox();
		linha3.add(lblDataEmprestimo);
		linha3.add(dataEmprestimo);
		painel.add(linha3, BorderLayout.CENTER);

		Box linha4 = Box.createHorizontalBox();
		linha4.add(lblDataDevolucao);
		linha4.add(dataDevolucao);
		painel.add(linha4, BorderLayout.CENTER);
		

		JPanel botoes = new JPanel();
		botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton salvar = new JButton("Salvar");
		JButton cancelar = new JButton("Cancelar");
		
		Cancelar fecharEmprestimo = new Cancelar();
		cancelar.addActionListener(fecharEmprestimo);
		
		botoes.add(cancelar);
		botoes.add(salvar);
		
		//Orientação dos COmponetes na tela
		add(painel, BorderLayout.NORTH);
		add(botoes, BorderLayout.LINE_END);

	}
}
