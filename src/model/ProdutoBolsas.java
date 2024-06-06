package model;

public class ProdutoBolsas extends Produto {
	
	private String marcas;

	public ProdutoBolsas(String nome, float preco, int id, int quantidade, String marcas) {
		super(nome, preco, id, quantidade);
		this.marcas = marcas;
	}

	public String getMarcas() {
		return marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}
	public void descricao(){
        System.out.println("----------------------------------------------------");
        System.out.println("                                                    ");
        System.out.println(" Descrição do produto:                              ");
        System.out.println("                                                    ");
        System.out.println("ID do Produto: " + getId());                         
        System.out.println("Nome do Produto: " + getNome()                     );
        System.out.println("Preco do produto: " + getPreco()                    );
        System.out.println("Quantidade do produto: " + getQuantidade()          );
        System.out.println("Quantidade do produto: " + this.marcas          );
        System.out.println("                                                    ");
        System.out.println("----------------------------------------------------");

    }

	@Override
	public String getProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}


