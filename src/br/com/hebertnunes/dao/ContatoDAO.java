package br.com.hebertnunes.dao;

import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import br.com.hebertnunes.conexao.ConnectionFactory;
import br.com.hebertnunes.model.Contato;

public class ContatoDAO {

	
	public void inserirContato(Contato contato) {
		
		Connection con = (Connection) new ConnectionFactory().conectar();
		
		try {
			String query = "INSERT INTO contatos(nome, sobrenome, telefone, celular, email)values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setString(3, contato.getTelefone());
			ps.setString(4, contato.getCelular());
			ps.setString(5, contato.getEmail());
			
			ps.execute();
			con.close();
			ps.close();
			
		}catch(Exception e) {
			System.out.println("Erro de: " +e);
		}
		
		
	}
}
