package inicio;

import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvException;

import csv.Leitor;
import entidades.Calculadora;
import entidades.Pessoa;
import entidades.Veiculo;

public class Inicio {

	public static void main(String[] args) throws IOException, CsvException {

		Leitor l = new Leitor();

		List<Pessoa> pessoas = l.obterPessoas();
		List<Veiculo> veiculos = l.obterVeiculos();
		
		// System.out.println("A pessoa com maior peso é: " + Calculadora.obterPessoaComMaiorPeso(pessoasDoArquivo).getPeso());
		// System.out.println("A pessoa com maior altura é: " + Calculadora.obterPessoaComMaiorAltura(pessoasDoArquivo).getAltura());
		//Calculadora.calcularIMC(pessoasDoArquivo);
		Calculadora.obterFuncaoMaisEncontrada(pessoas);
		Calculadora.obterMarcaMaisUtilizada(veiculos);
		Calculadora.obterEmpresasMaisRecorrentes(pessoas);
	}
}
