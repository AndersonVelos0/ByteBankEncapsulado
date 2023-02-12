public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;

		void deposita(double valor) {
			this.saldo = saldo + valor;
		}

		public boolean saca(double valor) {
			if (saldo >= valor) {
				this.saldo = saldo - valor;
				return true;
			} else {
				return false;
			}
		}

		public boolean transfere(double valor, Conta destino) {
			if (saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
			
		}
		//método para retornar o saldo dessa conta
		// criamos o método getters para o saldo
		public double getSaldo(){
				return this.saldo;
		}
		//metodo que irá retornar o numero da conta
		public int getNumero() {
			return this.numero;
		}
		//método que alterará o atributo
		//geralmente, métodos que alteram atributos devolvem vazio
		public void setNumero(int numero) {
			//o numero da esquerda é o atributo e o da direita é só uma variavel numero, um argumento
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia; 
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
			
		}
		public Cliente getTitular() {
			return titular;
		}
	}