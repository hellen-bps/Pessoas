package vetor;

public class pessoa {
	private String nome;
	private String endereco;
	private String cell;
	
	///constructor
	public pessoa(String nome, String endereco, String cell) {
		this.nome = nome;
		this.endereco = endereco;
		this.cell = cell;
	}
	
	//getters e setter
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getCell() {
		return cell;
	}
	
	public String toString() {
		return "Nome: " + nome + " Endereço: " + endereco + " Celular: " + cell;
		
	}
}
