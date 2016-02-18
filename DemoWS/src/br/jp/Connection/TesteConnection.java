package br.jp.Connection;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteConnection {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		try {
			 connection= new ConnectionFactoryBD().getConnection();
			
			System.out.println("Conectado, bem vindo ao Banco de Deados com Java!");
		} finally {
			connection.close();
		}

		
	}

}
