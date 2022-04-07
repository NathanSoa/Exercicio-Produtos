
public class ProdutoComTamanho extends Produto{

	private int tamanho;
	
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
	
	protected int getTamanho() {
		return tamanho;
	}

	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
