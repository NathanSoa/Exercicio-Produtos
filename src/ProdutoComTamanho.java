
public class ProdutoComTamanho extends Produto{

	private int tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this)
			return true;
		
		ProdutoComTamanho produto = (ProdutoComTamanho) obj;
		
		if((obj instanceof ProdutoComTamanho) && produto.getCodigo() == this.getCodigo() && produto.getTamanho() == this.getTamanho())
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.getCodigo();
	}
	
	protected int getTamanho() {
		return tamanho;
	}

	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
