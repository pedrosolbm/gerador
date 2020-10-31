package telas.av1;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Contatos extends JFrame {
	
	private class FecharConsulta extends JFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if ("Fechar".equals(e.getActionCommand()))
				System.exit(0);
		}
	}

	public Contatos() {
		super();
		Run();
	}

	public void Run() {

		JPanel painel = new JPanel();
		JPanel botoes = new JPanel();

		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

		JLabel lblpesquisar = new JLabel("Pesquisar ");
		JTextField txtPesquisar = new JTextField(30);
		JButton buttonPesquisar = new JButton("Pesquisar");

		String[] titulosTabela = { "Matrícula", "Nome", "Email", "Celular" };
		Object[][] dadosTabela = {};
		JTable listaAluno = new JTable(dadosTabela, titulosTabela);
		JScrollPane scrollAlunos = new JScrollPane(listaAluno);
		listaAluno.setFillsViewportHeight(true);

		Box linha1 = Box.createHorizontalBox();
		linha1.add(lblpesquisar);
		linha1.add(txtPesquisar);
		linha1.add(buttonPesquisar);

		painel.add(linha1, BorderLayout.CENTER);

		Box linha2 = Box.createHorizontalBox();
		linha2.add(scrollAlunos);
		painel.add(linha2, BorderLayout.CENTER);
		
		botoes.setLayout(new FlowLayout(FlowLayout.RIGHT));		
		FecharConsulta fecharConsulta = new FecharConsulta();
		JButton fechar = new JButton("Fechar");
		fechar.addActionListener(fecharConsulta);
		botoes.add(fechar);

		add(painel, BorderLayout.NORTH);
		add(botoes, BorderLayout.SOUTH);
	}

}