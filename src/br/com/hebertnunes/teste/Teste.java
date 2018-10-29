package br.com.hebertnunes.teste;

import br.com.hebertnunes.conexao.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		
		ConnectionFactory con = new ConnectionFactory();
		
		con.conectar();

	}

}
