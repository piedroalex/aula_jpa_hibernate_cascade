package principal;

import java.util.ArrayList;
import java.util.List;

import dao.PessoaDAO;
import entities.Despesa;
import entities.Pessoa;
import entities.Receita;

/**
 * @author Pedro Alex
 */
public class Principal {
	
	public static void main(String[] args) {	
		Receita receita1 = new Receita();
		receita1.setDescricao("Salário Empresa 1");
		receita1.setValor(1250.0);
		
		Receita receita2 = new Receita();
		receita2.setDescricao("Salário Empresa 2");
		receita2.setValor(1050.98);
		
		List<Receita> receitas = new ArrayList<Receita>();
		receitas.add(receita1);
		receitas.add(receita2);
		
		Despesa despesa1 = new Despesa();
		despesa1.setDescricao("Energia");
		despesa1.setValor(272.47);
		
		Despesa despesa2 = new Despesa();
		despesa2.setDescricao("Aluguel");
		despesa2.setValor(408.76);
		
		List<Despesa> despesas = new ArrayList<Despesa>();
		despesas.add(despesa1);
		despesas.add(despesa2);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setReceitas(receitas);
		pessoa.setDespesas(despesas);
		
		//Ao salvar a pessoa, as despesas e receitas são salvas "em cascata"
		pessoaDAO.salvar(pessoa);
		
	}
}
