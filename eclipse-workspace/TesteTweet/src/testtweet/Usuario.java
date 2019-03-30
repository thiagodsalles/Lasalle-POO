package testtweet;

import java.util.ArrayList;


public class Usuario {
	
	//Atributos da Classe
	private String login;
	private String senha;
	private ArrayList<Tweet> tweets;
	
	//Construct da Classe
	public Usuario(){
		this.login = "admin";
		this.senha = "OOP";
		this.tweets = new ArrayList<>();
	}
	
	//Métodos da classe
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public String getSenha(){
		return this.senha;
	}

	public void setTweet(String descricao){
		Tweet tweet = new Tweet();
		tweet.setDescricao(descricao);
		this.tweets.add(tweet);
	}
	
	public void listar(){
		for (Tweet item: this.tweets) {
	         System.out.println(item.getDescricao());
	      }
	}
}
