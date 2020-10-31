package telas.av1;

import java.awt.Color;
import javax.swing.JFrame;

/*
 * Para executar uma das classes retire o comentário do código abaixo !
*/

public class Startup {

	public static void main(String[] args) {

		MenuPrincipal();

		NovoAluno();

		NovoEmprestimo();

		ConsultarAluno();
	}

	public static void MenuPrincipal() {
		MenuPrincipal main = new MenuPrincipal();
		main.setTitle("Biblioteca dos Alunos");
		main.setLocation(300, 200);
		main.setSize(580, 400);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setBackground(Color.DARK_GRAY);
		main.isBackgroundSet();
	}

	public static void NovoAluno() {
		NovoAluno novoAluno = new NovoAluno();
		novoAluno.setResizable(false);
		novoAluno.setTitle("Novo Aluno");
		novoAluno.setLocation(300, 200);
		novoAluno.setSize(400, 160);
		novoAluno.setVisible(true);
		novoAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void NovoEmprestimo() {
		NovoEmprestimo novoEmprestimo = new NovoEmprestimo();
		novoEmprestimo.setTitle("Novo Empréstimo");
		novoEmprestimo.setSize(500, 190);
		novoEmprestimo.setLocation(400, 250);
		novoEmprestimo.setVisible(true);
		novoEmprestimo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void ConsultarAluno() {
		Contatos contatos = new Contatos();
		contatos.setTitle("Consultar Aluno");
		contatos.setSize(600, 535);
		contatos.setLocation(400, 100);
		contatos.setVisible(true);
		contatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contatos.setResizable(false);
		contatos.setBackground(Color.DARK_GRAY);
	}
}
