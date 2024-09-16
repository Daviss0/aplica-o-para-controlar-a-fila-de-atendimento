
public class Pessoa {

	private String senha;
	private boolean prioridade;
	
	public Pessoa(String senha, boolean prioridade) {
		this.senha = senha;
		this.prioridade = prioridade;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha){
		this.senha =  senha;
	}	
	
	public boolean getPrioridade() {
		return this.prioridade;
	}
	public void setPrioridade(boolean prioridade) {
		this.prioridade = prioridade;
	}
	
	@Override
	public String toString() {
		return "Senha: " + senha + ", prioridade: " + prioridade;
	}
}
