package br.com.hebertnunes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import br.com.hebertnunes.conexao.ConnectionFactory;
import br.com.hebertnunes.model.Contato;

public class ContatoDAO {

	//Inserir produtos no banco
	public void inserirContato(Contato contato) {
		
		Connection con = (Connection) new ConnectionFactory().conectar();
		PreparedStatement ps;
		
		try {
			String query = "INSERT INTO contatos(nome, sobrenome, telefone, celular, email)values(?,?,?,?,?)";
			ps = con.prepareStatement(query);
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
	
	
	//Listar produtos do banco 
	public void listarContatos() {
		
		try {
			Connection con = (Connection) new ConnectionFactory().conectar();
			String query = "SELECT * FROM contatos";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("sobrenome"));
				System.out.println(rs.getString("celular"));
				System.out.println(rs.getString("telefone"));
				System.out.println(rs.getString("email"));
				
				
				/*System.out.println(contato.getNome());
				System.out.println(contato.getSobrenome());
				System.out.println(contato.getTelefone());
				System.out.println(contato.getCelular());
				System.out.println(contato.getEmail());*/
			}
			
			con.close();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletarContato(int id) {
		
		try {
			Connection con = (Connection) new ConnectionFactory().conectar();
			String query = "DELETE FROM contatos WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			
			con.close();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void alterarContato(Contato contato) {
		Connection con = (Connection) new ConnectionFactory().conectar();
		try {
			String query = "UPDATE contatos SET nome=?, sobrenome=?, celular=?, telefone=?, email=? WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setString(3, contato.getCelular());
			ps.setString(4, contato.getTelefone());
			ps.setString(5, contato.getEmail());
			ps.setInt(6, contato.getId());
			
			ps.execute();
			con.close();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
