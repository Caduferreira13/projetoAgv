package entidades;
	
	import java.io.IOException;
	import java.io.Reader;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.List;
		
	public class Pessoa {
	    private String nome;
	    private String sobrenome;
	    private String peso;
	    private String altura;
	    private String funcao;

	    
	    public String getFuncao() {
			return funcao;
		}

		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		private String empresa;
	    
	    // Gets e Sets omitidos para ficar menor
	    
	    
	    public String toString() {
	        return "Pessoa{nome='" + nome + "\', sobrenome=" + sobrenome + ", peso='" + peso + ", altura=" + altura + "\'}";
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getPeso() {
			return peso;
		}

		public void setPeso(String peso) {
			this.peso = peso;
		}

		public String getAltura() {
			return altura;
		}

		public void setAltura(String altura) {
			this.altura = altura;
		} 
}