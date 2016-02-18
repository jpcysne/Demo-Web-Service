package br.jp.teste;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.jp.dao.ContribuinteDAO;
import br.jp.modelo.Contribuinte;

public class DemoWS {
	private Connection conexao;

	
	public Contribuinte registrarContri(String nome, String endereco, String numero,String complemento, String bairro, String municipio
			,String cep, String uf){
		
		Contribuinte con=new Contribuinte();
		
		con.setNome(nome);
		con.setEndereco(endereco);
		con.setNumero(numero);
		con.setComplemento(complemento);
		con.setBairro(bairro);
		con.setMunicipio(municipio);
		con.setCep(cep);
		con.setUF(uf);
		
		/*
		con.setEndereco("rua aldeota");
		con.setNumero("100");
		con.setComplemento("ap 2p");
		con.setBairro("Aldeota");
		con.setMunicipio("Fortaleza");
		con.setCep("6000111");
		con.setUF("CE");
		*/
		ContribuinteDAO dao = new ContribuinteDAO();
		dao.adicionar(con);
		System.out.println(nome);
		
		return con;
		
	
	}

	public Contribuinte getContri(int id){
		
		ContribuinteDAO dao =new ContribuinteDAO();
		
		String o=dao.getContribuinte(id).getNome();
		
		
		System.out.println(o);
		return dao.getContribuinte(id);
	
	
	}
	}

