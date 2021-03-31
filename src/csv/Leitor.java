package csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import entidades.Pessoa;
import entidades.Veiculo;

/**
 * @apiNote EXERCICIO DO CADU
 * @author carlo
 * 
 *         Fazer um programa em java para ler o arquivo em anexo respondendo aos
 *         dados abaixo: Pessoa com maior Peso, Pessoa com maior Altura Calcular
 *         IMC e separar as pessoas Obesas se houver Entre 25,0 e 29,9‎:
 *         ‎Sobrepeso Maior que 40,0‎: ‎Obesidade Grave Entre 30,0 e 39,9‎:
 *         ‎Obesidade Menor que 18,5‎: ‎Magreza. Marca de Veículo Mais Utilizada
 *         + Quantidade Função Mais Encontrada + Quantidade Empresa com mais
 *         Pessoas + Quantidade
 *
 */

public class Leitor {

	private final static String FILE_PATH = "C:\\Users\\carlo\\eclipse-workspace\\Programa_AGV\\src\\baseDados.csv";

	public List<Pessoa> obterPessoas() throws IOException, CsvException {

		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		List<String[]> linhas = Leitor.lerArquivo();

		linhas.forEach(linha -> {
			if (!linha[0].toString().toLowerCase().contains("nome")) {
				String[] conteudo = linha[0].toString().split(";");
				Pessoa novaPessoa = new Pessoa();

				novaPessoa.setNome(conteudo[0]);
				novaPessoa.setSobrenome(conteudo[1]);
				novaPessoa.setFuncao(conteudo[2]);
				novaPessoa.setEmpresa(conteudo[3]);
				novaPessoa.setPeso(Double.parseDouble(conteudo[5]));
				novaPessoa.setAltura(Double.parseDouble(conteudo[6]));

				listaDePessoas.add(novaPessoa);
			}
			
		});

		return listaDePessoas;
	}

	public List<Veiculo> obterVeiculos() throws IOException, CsvException {

		List<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

		List<String[]> linhas = Leitor.lerArquivo();
		linhas.forEach(linha -> {
			String[] conteudo = linha[0].toString().split(";");
			Veiculo novoVeiculo = new Veiculo();
			String[] dadosVeiculo = conteudo[4].split(" ");
			novoVeiculo.setAno(dadosVeiculo[0]);
			novoVeiculo.setModelo(conteudo[4].substring(4));

			listaDeVeiculos.add(novoVeiculo);
		});
		

		return listaDeVeiculos;
	}

	public static List<String[]> lerArquivo() throws IOException, CsvException {
		Reader reader = new FileReader(FILE_PATH, StandardCharsets.UTF_8);

		CSVReader csvReader = new CSVReader(reader);
		List<String[]> linhas = csvReader.readAll();
		return linhas;

	}

}
