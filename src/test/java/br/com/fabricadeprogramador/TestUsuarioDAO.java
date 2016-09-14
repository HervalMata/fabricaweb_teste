package br.com.fabricadeprogramador;

import br.com.fabricadoprogramador.persistencia.entidade.Usuario;
import br.com.fabricadoprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args){
		testExcluir();
}

	public static void testCadastrar(){
			
	//Criandoo Usu�rio
	Usuario usu = new Usuario();
	usu.setNome("Joao Grande");
	usu.setLogin("jzao");
	usu.setSenha("12345");
	
	//Cadastrando usu�rio no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.cadastrar(usu);
	
	System.out.println("Usu�rio Cadastrado com Sucesso");

  }
	
	public static void testAlterar(){
		
	//Criandoo Usu�rio
	Usuario usu = new Usuario();
	usu.setId(3);
	usu.setNome("Joao Pequeno");
	usu.setLogin("jzinho");
	usu.setSenha("123456");
	
	//Cadastrando usu�rio no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.alterar(usu);
	
	System.out.println("Usu�rio Alterado com Sucesso");

  }
	
	public static void testExcluir(){
		
	//Criandoo Usu�rio
	Usuario usu = new Usuario();
	usu.setId(3);
	
	//Cadastrando usu�rio no banco de dados
	UsuarioDAO usuDAO = new UsuarioDAO();
	usuDAO.excluir(usu);
	
	System.out.println("Usu�rio Excluido com Sucesso");

  }	
}
