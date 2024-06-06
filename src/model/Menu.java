package model;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner leia = new Scanner(System.in);
		        String produto; 
		        boolean continuar = true;

		        while (continuar) {
		        	System.out.println("******************************");
		        	System.out.println("                              ");
		            System.out.println("Bem-vindo ao Shirt.Net        ");
		            System.out.println("                              ");
		            System.out.println("******************************");
		            System.out.println("            1 - Criar Produto                          ");
					System.out.println("            2 - Listar todos os produtos               ");
					System.out.println("            3 - Buscar Produto por Id             ");
					System.out.println("            4 - Atualizar Dados do produto              ");
					System.out.println("            5 - Apagar produto                         ");
					System.out.println("            6 - Sair                                 ");
		            int opcao = leia.nextInt();

		            switch (opcao) {
		  
		                case 1:
		                    System.out.println("Adicionar produto ao carrinho.");
		                    
		                    break;
		                case 2:
		                    System.out.println("Obrigada por acessar nosso site. Volte sempre!");	                    
		                    break;
		      
		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		                    break;
		            }
		        }

		    }


	}


