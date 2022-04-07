import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompra {
	
	/*  Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto adicionado no carrinho 
	 *  e sua respectiva quantidade. 
	 *  
	 *  O m�todo adicionaProduto() deve receber a instancia do produto e a quantidade. 
	 *  
	 *  Caso o produto j� exista no HashMap,
	 *  a quantidade deve ser somada a que j� existe no carrinho.
	 *  
	 *   Deve haver tamb�m um m�todo removeProduto() que tamb�m recebe a instancia do produto 
	 *  e a quantidade a ser removida. 
	 *  
	 *  Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes no carrinho. 
	 *  O carrinho deve possuir um m�todo que calcula o valor total da compra.
	*/
	
	public static HashMap<Produto, Integer> carrinho = new HashMap<Produto, Integer>();
	private double precoTotal = 0;

	public void adicionaProduto(Produto produto, int quantidade) {	
		if(carrinho.containsKey(produto)) 
			carrinho.put(produto, carrinho.get(produto) + quantidade);
		else 
			carrinho.put(produto, quantidade);			
		
		valorCompra(quantidade * produto.getPreco());
	}
	
	public void removeProduto(Produto produto, int quantidade) {	
		if(carrinho.containsKey(produto)) 
			carrinho.put(produto, carrinho.get(produto) - quantidade);
		
		valorCompra(quantidade * produto.getPreco() * -1);
	}	
	
	public double valorCompra(double valor) {
		setPrecoTotal(getPrecoTotal() + valor);
		return getPrecoTotal();
	}
	
	protected double getPrecoTotal() {
		return precoTotal;
	}

	protected void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
}
