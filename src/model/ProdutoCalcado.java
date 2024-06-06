package model;

public class ProdutoCalcado extends Produto {
	
	private String numeracao;

	public ProdutoCalcado(String nome, float preco, int id, int quantidade, String numeracao) {
		super(nome, preco, id, quantidade);
		this.numeracao = numeracao;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
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
        System.out.println("Quantidade do produto: " + this.numeracao          );
        System.out.println("                                                    ");
        System.out.println("----------------------------------------------------");

    }

	@Override
	public String getProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}
