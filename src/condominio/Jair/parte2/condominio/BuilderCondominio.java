package condominio.Jair.parte2.condominio;

import java.util.ArrayList;

import condominio.Jair.parte2.builder.*;
import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.imovel.Imovel;

public class BuilderCondominio implements Builde {
	
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setImoveis(ArrayList<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	
	public Condominio getBuilderCondominio()
	{
		return new Condominio(nome,cnpj,endereco,imoveis);
	}

}
