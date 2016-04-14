package br.jp.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.jp.Connection.ConnectionFactoryBD;
import br.jp.modelo.Contencioso;
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
	
	public List<Contencioso> getLista(){
		try {
			List<Contencioso> contenciosos=new ArrayList<Contencioso>();
			PreparedStatement stmt = this.conexao.prepareStatement("select * from contencioso");
			ResultSet rs=stmt.executeQuery();
			
			while (rs.next()) {
				Contencioso contencioso=new Contencioso();
				contencioso.setAnodoAuto(rs.getInt(""));
				contencioso.setAutuacao(rs.getDate(""));
				contencioso.setBairro(rs.getString("bairro"));
				contencioso.setCEP(rs.getString("cep"));
				contencioso.setCGM(rs.getString("cgm"));
				contencioso.setCidade(rs.getString("cidade"));
				contencioso.setCiencia(rs.getDate(""));
				contencioso.setCodigo(rs.getString("codigo"));
				contencioso.setComplemento(rs.getString("complemento"));
				contencioso.setDateCalCorrecao(rs.getDate(""));
				contencioso.setDescriInfracao(rs.getString(""));
				contencioso.setDesignante(rs.getString("designante"));
				contencioso.setDiasPrazo(rs.getInt(""));
				contencioso.setEndereco(rs.getString("endereco"));
				contencioso.setEstado(rs.getString("estado"));
				contencioso.setInicioProcesso(rs.getDate(""));
				contencioso.setMercadoriaPerecivel(rs.getBoolean(""));
				contencioso.setMulta(rs.getFloat(""));
				contencioso.setNome(rs.getString("nome"));
				contencioso.setNumero(rs.getString("numero"));
				contencioso.setNumeroAuto(rs.getString(""));
				contencioso.setNumeroProcesso(rs.getString(""));
				
				
				
				
				
				
				
				contenciosos.add(contencioso);
			}
			rs.close();
			stmt.close();
			return contenciosos;
			
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
