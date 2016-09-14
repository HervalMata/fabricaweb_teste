package br.com.fabricadoprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadoprogramador.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection con = ConexaoFactory.getConnection();
	public void cadastrar(Usuario usu) {
			
		String sql = "insert into usuario (nome, login, senha) values ( ?, ?, ? )";
		
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, usu.getNome());
			pre.setString(2, usu.getLogin());
			pre.setString(3, usu.getSenha());
			
			pre.execute();
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void alterar(Usuario usu) {
		// TODO Auto-generated method stub
		String sql = "update usuario set nome=?, login=?, senha=? where id = ? ";
		
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, usu.getNome());
			pre.setString(2, usu.getLogin());
			pre.setString(3, usu.getSenha());
			pre.setInt(4, usu.getId());
			
			pre.execute();
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void excluir(Usuario usu) {
		// TODO Auto-generated method stub
		String sql = "delete from usuario where id = ?";
		
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setInt(1, usu.getId());
			
			pre.execute();
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
