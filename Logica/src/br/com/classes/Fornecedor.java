package br.com.classes;

public class Fornecedor {
	
	
	private int id;
	private String razaoSocial;
	private String telefone;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
	}
	
	public String getRazaoSocial(){
		return razaoSocial;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}

}
