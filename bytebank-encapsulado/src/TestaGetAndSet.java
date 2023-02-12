
public class TestaGetAndSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// não irá compilar o código abaixo devido ao set criado
		// conta.numero = 1232;
		// funcionará da seguinte forma
		// a vantagem é que o novo método deixa inacessivel a alteração, podendo ocorrer
		// ifs, logicas e validações.
		// você não precisará se preocupar com isso fora do método
		conta.setNumero(13121);
		// o método get dará permissão de imprimir o valor armazenado através do set na
		// conta
		System.out.println(conta.getNumero());

		Cliente andre = new Cliente();
		// o código abaixo não irá funcionar porque titular é privado
		// e não pode ser acessado diretamente
		// conta.titular = andre;
		
		//abaixo é a forma correta de atribuir ao atributo nome o titular
		andre.setNome("Andre Geraldo");
		
		// no setTitular duas classes estão se encontrando, há uma ligação entre o nome
		// da classe Cliente e o titular da classe Conta.
		// Não trata-se de um objeto dentro do outro, mas sim, um referenciando o outro
		conta.setTitular(andre);
		andre.setCpf("108.234.234-56");
		andre.setProfissao("Programador");
		
		// aqui foi necessário ligar os dois métodos para poder referencia-los e haver
		// uma ligação
		//caso não houvesse o .getNome, impriria o valor armazenado na memória"
		System.out.println(conta.getTitular().getNome());

		// caso você queira mudar em uma e referenciar em outra classe, podemos fazer o
		// seguinte:
		Cliente titularDaConta = conta.getTitular();
		// pedimos a permissão de alterar a profissão do titular da conta
		titularDaConta.setProfissao("Pedreito");
		// pedimos permissão para mostrar o que está armazenado nesse get após
		// alterarmos
		System.out.println(titularDaConta.getProfissao());
	}

}
