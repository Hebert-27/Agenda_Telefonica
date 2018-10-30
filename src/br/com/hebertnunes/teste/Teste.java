package br.com.hebertnunes.teste;


import br.com.hebertnunes.dao.ContatoDAO;
import br.com.hebertnunes.model.Contato;

public class Teste {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		/*Contato contato = new Contato();
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		List<Contato> contatos = new ArrayList();
		
		contato1.setId(6);
		contato1.setNome("Maria");
		contato1.setSobrenome("Silva");
		contato1.setCelular("98756-0215");
		contato1.setTelefone("3635-1524");
		contato1.setEmail("maria@gmail.com");
		
		/*contato2.setNome("Acmon");
		contato2.setSobrenome("Agumon");
		contato2.setCelular("98547-2535");
		contato2.setTelefone("3235-1512");
		contato2.setEmail("acmon@gmail.com");*/
		
		//contatos.add(contato1);
		
		/*contatoDao.inserirContato(contato);
		
		contatoDao.inserirContato(contato2);*/
		//contatoDao.inserirContato(contato1);
		//contatoDao.listarContatos();
		
		//contatoDao.deletarContato(5);
		
		//contatoDao.alterarContato(contato1);
		
		Contato contato = new Contato("Mario", "Soares", "98568-9658", "2527-2624", "mario@gmail.com");
		
		contatoDao.inserirContato(contato);

	}

}
