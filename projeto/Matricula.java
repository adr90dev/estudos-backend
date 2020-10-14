package ProjetoAcademia;

public class Matricula extends Academia 
{
		private int matricula;//criar mais tipo rg id ******
		private long id;
		private long cpf;
		
		public Matricula (String nome, int idade, String genero,double altura, double peso,int matricula,long id,long cpf)
		{
			super(nome,idade,genero,altura,peso);
			this.matricula = matricula;
			this.id = id;
			this.cpf =cpf;
		}
		//criando get e set

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getCpf() {
			return cpf;
		}

		public void setCpf(long cpf) {
			this.cpf = cpf;
		}
		
}