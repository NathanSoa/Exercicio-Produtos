import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesProdutoComTamanho {

	ProdutoComTamanho produto = new ProdutoComTamanho("Produto Teste A", 10, 25.5, 42);
	ProdutoComTamanho produto2 = new ProdutoComTamanho("Produto Teste B", 10, 26, 42);
	ProdutoComTamanho produto3 = new ProdutoComTamanho("Produto Teste C", 10, 26.5, 39);
	ProdutoComTamanho produto4 = new ProdutoComTamanho("Produto Teste D", 12, 27, 43);
	
	@Test
	void testeEqualsDoProdutoComCodigoIgualETamanhoIgual() {		
		assertEquals(true, produto.equals(produto2));
	}
	
	@Test
	void testeEqualsDoProdutoComCodigoIgualETamanhoDiferente() {		
		assertEquals(false, produto.equals(produto3));
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
		assertNotEquals(produto.hashCode(), produto4.hashCode());
	}
}
