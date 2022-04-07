import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestesProduto {
	
	Produto produto = new Produto();
	Produto produto2 = new Produto();
	
	@BeforeClass
	void atribuiValores() {
		produto.setCodigo(10);
		produto2.setCodigo(10);
	}
	
	@Test
	void testeEqualsDoProduto() {
		assertEquals(produto.equals(produto2), true);
		assertEquals(produto2.equals(produto), true);
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
