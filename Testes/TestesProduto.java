import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesProduto {
	
	Produto produto = new Produto();
	Produto produto2 = new Produto();
	@Test
	void testeEqualsDoProduto() {
		produto.setCodigo(10);
		produto2.setCodigo(10);
		assertEquals(produto.equals(produto2), true);
	}
}
