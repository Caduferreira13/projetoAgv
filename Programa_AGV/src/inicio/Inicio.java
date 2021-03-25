package inicio;

import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvException;

import csv.Leitor;
import entidades.Pessoa;
import entidades.Veiculo;

public class Inicio {

	public static void main(String[] args) throws IOException, CsvException {

		Leitor l = new Leitor();

		List<Pessoa> pessoasDoArquivo = l.obterPessoas();
		pessoasDoArquivo.forEach(pessoa -> System.out.println(pessoa.toString()));

		List<Veiculo> dadosDoVeiculo = l.obterVeiculos();
		dadosDoVeiculo.forEach(veiculo -> System.out.println(veiculo.toString()));

	}
}
