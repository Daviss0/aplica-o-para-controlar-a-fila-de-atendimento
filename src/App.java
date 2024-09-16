import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String opcao;
		Fila fila = new Fila();
		
		do {
			
			System.out.println("===== Menu de Opcoes =====");
			System.out.println("1. Solicitar nova senha");
			System.out.println("2. Excluir senha");
			System.out.println("3. Listar senhas");
			System.out.println("4. Visualizar proximo paciente");
			System.out.println("5. Chamar proximo paciente");
			System.out.println("0. Sair");
			opcao = scan.next();
			
			switch(opcao) {
			case "1":
				System.out.println("Informe a senha do paciente");
				String senha = scan.next();
				System.out.println("O paciente e de prioridade? (s / n)");
				boolean prioritario = scan.next().equalsIgnoreCase("s");
				Pessoa pessoa = new Pessoa(senha, prioritario);
				fila.pedirSenha(pessoa);
				break;
				
			case "2":
				System.out.println("informe a senha do paciente para ser excluida: ");
				String senhaExcluir = scan.nextLine();
				fila.excluirSenha(senhaExcluir);
				break;
				
			case "3":
				fila.listarSenha();
				break;
				
			case "4": 
				Pessoa proxima = fila.proximoAtendimento();
				if (proxima != null) {
					System.out.println("proximo paciente: " + proxima);
				}
				else {
					System.out.println("fila vazia");
				}
				break;
				
			case "5": 
				fila.chamarProximo();
				break;
				
			case "0":
				System.out.println("saindo..");
				break;
				
				default: System.out.println("opcao invalida");
			}
		}while (!opcao.equals("0"));
		scan.close();
 }
}
