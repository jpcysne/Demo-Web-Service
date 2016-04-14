package br.jp.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.jp.Connection.ConnectionFactoryBD;
import br.jp.modelo.Contribuinte;

public class ContribuinteDAO {

private Connection conexao;
	
	public ContribuinteDAO(){
		this.conexao=new ConnectionFactoryBD().getConnection();
		
	}
	
	public void adicionar(Contribuinte contribuinte){
	String sql = "insert into contribuinte" +
				 "(codigo, nome,endereco, numero, complemento, " +
				 "bairro, municipio, UF, cep)" +
				 "values (?,?,?,?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=conexao.prepareStatement(sql);
		
		ps.setInt(1, contribuinte.getCodigo());
		ps.setString(2, contribuinte.getNome());
		ps.setString(3, contribuinte.getEndereco());
		ps.setString(4, contribuinte.getNumero());
		ps.setString(5, contribuinte.getComplemento());
		ps.setString(6, contribuinte.getBairro());
		ps.setString(7, contribuinte.getMunicipio());
		ps.setString(8, contribuinte.getUF());
		ps.setString(9, contribuinte.getCep());
		
		
		ps.execute();
		ps.close();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}

}
	public Contribuinte getInfracao(int codInfracao){
		try {
			PreparedStatement stmt = this.conexao.prepareStatement("select * from infracao where cod_infracao=?");
			
			stmt.setInt(1, codInfracao);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
	public Contribuinte getContribuinte(int codigo){
		
		
		try {
			PreparedStatement stmt= this.conexao.prepareStatement("select * from contribuinte where codigo=?");
			stmt.setInt(1, codigo);
			
			Contribuinte contribuinte = null;
			ResultSet rs= stmt.executeQuery();
			
			if(rs.next()){
				int codContribuinte=rs.getInt("codigo");
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String numero = rs.getString("numero");
				String complemento = rs.getString("complemento");
				String bairro = rs.getString("bairro");
				String municipio= rs.getString("municipio");
				String cep= rs.getString("cep");
				String uf= rs.getString("uf");
			
				
				contribuinte= new Contribuinte();
				
				contribuinte.setCodigo(codContribuinte);
				contribuinte.setNome(nome);
				contribuinte.setEndereco(endereco);
				contribuinte.setNumero(numero);
				contribuinte.setComplemento(complemento);
				contribuinte.setBairro(bairro);
				contribuinte.setMunicipio(municipio);
				contribuinte.setCep(cep);
				contribuinte.setUF(uf);
			}
			
			rs.close();
			stmt.close();
			
			return contribuinte;
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
		
	}
}
