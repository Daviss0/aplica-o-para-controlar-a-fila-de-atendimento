import java.util.LinkedList;

public class Fila {

	private LinkedList<Pessoa> filaPrioritaria;
	private LinkedList<Pessoa> filaComum;
	
	public Fila () {
		this.filaComum = new LinkedList<>();
		this.filaPrioritaria = new LinkedList<>();
		}
	
	public void pedirSenha(Pessoa pessoa) {
		if (pessoa.getPrioridade()) {
			filaPrioritaria.add(pessoa);
		}
		else {
			filaComum.add(pessoa);
		}
	}
	
	public void excluirSenha (String senha) {
		filaComum.removeIf(pessoa -> pessoa.getSenha().equals(senha));
		filaPrioritaria.removeIf(pessoa-> pessoa.getSenha().equals(senha));
	}
	
	public void listarSenha() {
	  System.out.println("Fila prioritaria: ");
	  for (Pessoa p : filaPrioritaria) {
		System.out.println(p);
	}
	  System.out.println("Fila comum: ");
	  for (Pessoa p : filaComum) {
		  System.out.println(p);
	  }
	}
	
	public Pessoa proximoAtendimento() {
		if(!filaPrioritaria.isEmpty()) {
			return filaPrioritaria.peek();
		}
		else if (!filaComum.isEmpty()) {
			return filaComum.peek();
		}
		return null;
	}
	
	public void chamarProximo() {
		if (!filaPrioritaria.isEmpty()) {
			System.out.println("Proximo: " + filaPrioritaria.poll());
		}
		else if (!filaComum.isEmpty()) {
			System.out.println("Proximo: " + filaComum.poll());
		}
		else {
			System.out.println("Ninguem na fila");
		}
	}
}
