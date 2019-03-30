package testtweet;

import java.util.Scanner;

public class Testetweet {

	public static void main(String[] args) {
		
		//Intanciamento da Classe
		Usuario user = new Usuario();
		
		//Variáveis
		int option = 10;
		boolean pass = false;
		String senha;
		
		//Abertura do scanner
		Scanner entrada = new Scanner(System.in);
		
		//Tela de login para verificar a senha
		while(pass == false){
			System.out.println("Entre com sua senha: ");
			senha = entrada.nextLine();
			
			if(senha.equalsIgnoreCase(user.getSenha())){
				pass = true;
			} else {
				System.out.println("Tente novamente");
				pass = false;
			}
		}
		
		//Menu de opções para Adicionar Tweet, Listar Tweet, Sair do programa
		while(option != 0){
			
			System.out.println("Digite 1 para novo tweet, 2 para listar todos os tweets, 0 para sair.");
			option = entrada.nextInt();
			
			switch(option){
			    case 1:
			    	System.out.println("Entre com o Tweet: ");
			    	user.setTweet(entrada.next());
			            break;
			    case 2:
			           user.listar();
			            break;
			            
			}
		}
	}

}
