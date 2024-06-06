package controller;


	import java.util.ArrayList;
import java.util.Scanner;

import model.Produto;
import repository.ProdutoRepository;

	public class produtocontroller implements ProdutoRepository{


			Scanner leia = new Scanner(System.in);
			
			private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
		    int numero = 0;
			@Override
			public void listarPorid(int numero) {
				
				var produto = buscarNaCollection(numero);
				
				if (produto != null)
					produto.descricao();
				else
					System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
		    }
				
				

			@Override
			public void listarTodas() {
				for (var produto : listaProduto) {
					produto.descricao();
				}      
				// TODO Auto-generated method stub
				
			}
			@Override
			public void cadastrar(Produto produto) {
				listaProduto.add(produto);
				System.out.println("\nProduto com id: " + produto.getId() + " foi criada com sucesso!");
		    }
				

			@Override
			public void atualizar(Produto produto) {
				// TODO Auto-generated method stub
				var buscaProduto = buscarNaCollection(produto.getId());
				
				if (buscaProduto != null) {
					listaProduto.set(listaProduto.indexOf(buscaProduto), produto);
					System.out.println("\nA Conta numero: " + produto.getId() + " foi atualizada com sucesso!");
				}else
					System.out.println("\nA Conta numero: " + produto.getId() + " não foi encontrada!");
		    }
				
			@Override
			public void deletar(int numero) {
				
				var produto = buscarNaCollection(numero);
				
				if (produto != null) {
					if(listaProduto.remove(produto) == true)
						System.out.println("\nA Conta numero: " + numero + " foi deletada com sucesso!");
				}else
					System.out.println("\nA Conta numero: " + numero + " não foi encontrada!");
		    }
				// TODO Auto-generated method stub
				


			public Produto buscarNaCollection(int numero) {
				for (var produto : listaProduto) {
					if (produto.getId() == numero) {
						return produto;
					}
				}
				
				return null;
			}
			

		}
		