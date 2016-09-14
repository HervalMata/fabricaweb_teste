package br.com.fabricadeprogramador;

import br.com.fabricadoprogramador.persistencia.entidade.Usuario;
import br.com.fabricadoprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args){
		testExcluir();
}

	public static void testCadastrar(){
			
	//Criandoo Usuário
	Usuario usu = new Usuario();
	usu.setNome("Joao Grande");
	usu.setLogin("jzao");
	usu.setSenha("12345");
	
	//Cadastrando usuário no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.cadastrar(usu);
	
	System.out.println("Usuário Cadastrado com Sucesso");

  }
	
	public static void testAlterar(){
		
	//Criandoo Usuário
	Usuario usu = new Usuario();
	usu.setId(3);
	usu.setNome("Joao Pequeno");
	usu.setLogin("jzinho");
	usu.setSenha("123456");
	
	//Cadastrando usuário no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.alterar(usu);
	
	System.out.println("Usuário Alterado com Sucesso");

  }
	
	public static void testExcluir(){
		
	//Criandoo Usuário
	Usuario usu = new Usuario();
	usu.setId(3);
	
	//Cadastrando usuário no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.excluir(usu);
	
	System.out.println("Usuário Excluido com Sucesso");

  }	
}
