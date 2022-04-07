import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestesProdutoComTamanho {

	ProdutoComTamanho produto = new ProdutoComTamanho();
	ProdutoComTamanho produto2 = new ProdutoComTamanho();
	ProdutoComTamanho produto3 = new ProdutoComTamanho();
	
	@BeforeClass
	void atribuiValores() {

	}
	
	@Test
	void testeEqualsDoProdutoComCodigoIgualETamanhoIgual() {		
		produto.setCodigo(10);
		produto.setTamanho(42);
		
		produto2.setCodigo(10);
		produto2.setTamanho(42);
		assertEquals(true, produto.equals(produto2));
	}
	
	@Test
	void testeEqualsDoProdutoComCodigoIgualETamanhoDiferente() {		
		produto.setCodigo(10);
		produto.setTamanho(42);
		
		produto2.setCodigo(10);
		produto2.setTamanho(42);
		
		produto3.setCodigo(10);
		produto3.setTamanho(39);	
		
		assertEquals(false, produto.equals(produto3));
	}
	
	@Test
	void testeEqualsDoProdutoComMesmoObjeto() {		
		produto.setCodigo(10);
		produto.setTamanho(42);
		
		produto2.setCodigo(10);
		produto2.setTamanho(42);
		
		produto3.setCodigo(10);
		produto3.setTamanho(39);
		assertEquals(true, produto.equals(produto));
	}
}
