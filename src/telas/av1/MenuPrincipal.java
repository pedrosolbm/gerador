package telas.av1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	   private JMenuItem iconeSair;
	   private JMenuItem itemNovo;
	   private JMenuItem atalhoConsulta;
	   private JMenuItem atalhoNovosLivros;
	   private JMenuItem atalhoConsultaLivros;
	   private JMenuItem atalhoNovoEmprestimo;
	   private JMenuItem atalhoNovoDevolucoesEmprestimo;
	   private JMenuItem atalhoConsultaEmprestimo;
	   private JMenuItem atalhoTopicosAjuda;
	   private JMenuItem atalhoSobreAjuda;
	   
	   public MenuPrincipal(){
	      super(); 
	      IniarComponentes();
	   }
	   
	   private class FecharTela extends JFrame implements ActionListener{
		   
		      @Override
		      public void actionPerformed(ActionEvent e){      
		         if ("Sair".equals(e.getActionCommand()))   
		            System.exit(0);
		      }
		   }
	   
	   public void IniarComponentes(){	    
		   
	      //Start da tela com os componentes		     
	      JMenu sistema = new JMenu("Sistema");
	      JMenu alunos = new JMenu("Alunos");
	      JMenu livros = new JMenu("Livros");
	      JMenu emprestimos = new JMenu("Emprestimos");
	      JMenu ajuda = new JMenu("Ajuda");   
	      FecharTela sairAction = new FecharTela();
	      
	      iconeSair = new JMenuItem("Sair");	 
	      itemNovo = new JMenuItem("Novo");	      
	      atalhoConsulta = new JMenuItem("Consulta");	      
	      atalhoNovosLivros = new JMenuItem("Novo");
	      atalhoConsultaLivros = new JMenuItem("Consulta");	      
	      atalhoNovoEmprestimo = new JMenuItem("Novo empréstimo");
	      atalhoNovoDevolucoesEmprestimo = new JMenuItem("Nova devolução");
	      atalhoConsultaEmprestimo = new JMenuItem("Consulta");	      
	      atalhoTopicosAjuda = new JMenuItem("Tópicos de Ajuda");
	      atalhoSobreAjuda = new JMenuItem("Sobre");
	      	      
	     
	      iconeSair.addActionListener(sairAction);	   
	      sistema.add(iconeSair);
	      
	      alunos.add(itemNovo);
	      alunos.addSeparator();
	      alunos.add(atalhoConsulta);
	      
	      livros.add(atalhoNovosLivros);
	      livros.addSeparator();
	      livros.add(atalhoConsultaLivros);
	      
	      emprestimos.add(atalhoNovoEmprestimo);
	      emprestimos.add(atalhoNovoDevolucoesEmprestimo);
	      emprestimos.addSeparator();
	      emprestimos.add(atalhoConsultaEmprestimo);
	      
	      ajuda.add(atalhoTopicosAjuda);
	      ajuda.add(atalhoSobreAjuda);
	      
	      //Decalrando a barra do menu 
	      JMenuBar barra = new JMenuBar(); 
	      setJMenuBar(barra);
	      barra.add(sistema);
	      barra.add(alunos);
	      barra.add(livros);
	      barra.add(emprestimos);
	      barra.add(ajuda);
	   } 
}
