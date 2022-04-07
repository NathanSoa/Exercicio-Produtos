
public class Produto {
	private String nome;
	private int codigo;
	private double preco;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this)
			return true;
		
		Produto produto = (Produto) obj;
		
		if((obj instanceof Produto) && produto.codigo == codigo)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return getCodigo();
	}
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected double getPreco() {
		return preco;
	}
	protected void setPreco(double preco) {
		this.preco = preco;
	}
	
}
