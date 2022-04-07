
public class Produto {
	private String nome;
	private int codigo;
	private double preco;
	
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
