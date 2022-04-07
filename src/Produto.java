
public class Produto {
	private String nome;
	private int codigo;
	private double preco;
	
	@Override
	public boolean equals(Object obj) {
		
		Produto produto = (Produto) obj;
		
		if(produto.codigo == codigo)
			return true;
		else
			return false;
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
