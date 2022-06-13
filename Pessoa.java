
public class Pessoa {

	private String cpf;
	private String nome;
	private boolean bolsista;
	private int sexo;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public Pessoa(String cpf, String nome, boolean bolsista, int sexo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.bolsista = bolsista;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", bolsista=" + bolsista + ", sexo=" + sexo + "]";
	}
	

	
	
	
}
