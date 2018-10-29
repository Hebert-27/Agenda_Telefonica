package br.com.hebertnunes.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection conectar() {

	 try {
	        /* Configura os parâmetros da conexão */
	        String url = "jdbc:mysql://localhost:3306/agenda_telefonica";
	        String username = "root"; 
	        String password = "root";
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        /* Tenta se conectar */
	        Connection con = DriverManager.getConnection(url, username, password);
	        
	        System.out.println("Conectado com sucesso!");
	        /* Caso a conexão ocorra com sucesso, a conexão é retornada */
	        return con;
	        
	    } catch (ClassNotFoundException e) {            
	        System.out.println("O driver expecificado nao foi encontrado.");
	        return null;
	        
	    } catch (SQLException e) {
	        System.out.println("Nao foi possivel conectar ao banco de dados.");
	        return null;
	    }
	}
}
