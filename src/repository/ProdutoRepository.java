package repository;

import model.Produto;

public interface ProdutoRepository {
	

		public void listarPorid(int numero);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int numero);
		
	}


