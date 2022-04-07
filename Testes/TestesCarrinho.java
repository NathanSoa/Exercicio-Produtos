import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarrinho {

	CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
	Produto produtoA = new Produto("Produto Teste A", 1, 50);
	Produto produtoB = new Produto("Produto Teste B", 1, 50);
	Produto produtoC = new Produto("Produto Teste C", 2, 30);
	Produto produtoD = new ProdutoComTamanho("Produto Teste D", 2, 30, 42);
	Produto produtoE = new ProdutoComTamanho("Produto Teste E", 2, 30, 42);
	
	@Test
	void testeValorTotalDoCarrinho() {
		carrinho.adicionaProduto(produtoA, 10);
		carrinho.adicionaProduto(produtoB, 10);
		carrinho.adicionaProduto(produtoD, 5);
		carrinho.adicionaProduto(produtoE, 5);
		assertEquals(1300, carrinho.getPrecoTotal());
	}
	
	@Test
	void testeProdutosDiferentesNoCarrinho() {
		int quantidadeNoCarrinho = 0;
		carrinho.adicionaProduto(produtoA, 10);
		carrinho.adicionaProduto(produtoB, 10);
		carrinho.adicionaProduto(produtoC, 5);
		
		//produto A e B são o mesmo produto
		
		for(Produto p : CarrinhoDeCompra.carrinho.keySet()) {
			quantidadeNoCarrinho += 1;
		}
		
		assertEquals(2, quantidadeNoCarrinho);
	}
	
	@Test
	void testeProdutosIguais() {
		
		carrinho.adicionaProduto(produtoA, 10);
		carrinho.removeProduto(produtoA, 3);
		
		assertEquals(7, CarrinhoDeCompra.carrinho.get(produtoA));
	}

}
