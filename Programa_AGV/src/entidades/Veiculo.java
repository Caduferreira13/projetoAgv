package entidades;

public class Veiculo {
	
	private String ano;
	private String modelo;
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
    public String toString() {
        return "Veiculo{ano='" + ano + "\', modelo=" + modelo +"}";
    }
	
}
