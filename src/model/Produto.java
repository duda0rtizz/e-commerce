package model;

public abstract class Produto {
	    private String nome;
	    private float preco;
	    private int id , quantidade;

	   

	    
	    public Produto(String nome, float preco, int id, int quantidade) {
			super();
			this.nome = nome;
			this.preco = preco;
			this.id = id;
			this.quantidade = quantidade;
		}

		public abstract String getProduto();

	    public String getNome() {
	        return nome;
	    }

	    public float getPreco() {
	        return (float) preco;
	    }
	    
	    public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public void setPreco(float preco) {
			this.preco = preco;
		}


		public void descricao(){
	        System.out.println("----------------------------------------------------");
	        System.out.println("                                                    ");
	        System.out.println(" Descrição do produto:                              ");
	        System.out.println("                                                    ");
	        System.out.println("ID do Produto: " + this.id);                         
	        System.out.println("Nome do Produto: " + this.nome                      );
	        System.out.println("Preco do produto: " + this.preco                    );
	        System.out.println("Quantidade do produto: " + this.quantidade          );
	        System.out.println("                                                    ");
	        System.out.println("----------------------------------------------------");

	    }
	    
}