package br.com.classes;

import java.io.FileWriter;
import java.io.IOException;

public class Gravar {
	
	public String Salvar(Produto produto){
		
		FileWriter escrever = null;
		try{
			escrever = new FileWriter("arquivo.txt");
			escrever.write(produto.getId()+" - "+
			produto.getNomeProduto()+" - "+
			produto.getDescricao()+" - "+
			produto.getFornecedor().getRazaoSocial()+" - "+
			produto.getCategoria().getNomeCategoria()+" - "+
			produto.getPreco());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try {
				escrever.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "Produto Salvo com sucesso";
	}

}
