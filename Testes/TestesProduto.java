import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesProduto {
	
	Produto produto = new Produto("Produto Teste A", 10, 25.70);
	Produto produto2 = new Produto("Produto Teste B", 10, 29);
	
	@Test
	void testeEqualsDoProdutoComutativamente() {
		assertEquals(true, produto.equals(produto2));
		assertEquals(true, produto2.equals(produto));
	}
	
	@Test
	void testeEqualsDoProdutoComMesmoObjeto() {
		assertEquals(true, produto.equals(produto));
	}
	
	@Test
	void testeHashCodeDoProdutoComCodigoIgual() {	
		assertEquals(produto.hashCode(), produto2.hashCode());
	}
	
	@Test
	void testeHashCodeDoProdutoComCodigoDiferente() {
		produto.setCodigo(10);
		produto2.setCodigo(12);
		assertNotEquals(produto.hashCode(), produto2.hashCode());
	}
}
