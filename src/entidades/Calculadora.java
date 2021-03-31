package entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculadora {

	public static Pessoa obterPessoaComMaiorPeso(List<Pessoa> pessoas) {
		Pessoa pessoaComMaiorPeso = pessoas.get(0);
		for (Pessoa pessoa : pessoas) {

			if (pessoa.getPeso() > pessoaComMaiorPeso.getPeso()) {

				pessoaComMaiorPeso = pessoa;
			}

		}

		return pessoaComMaiorPeso;
	}

	
	public static Pessoa obterPessoaComMaiorAltura(List<Pessoa> pessoas) {
		Pessoa pessoaComMaiorAltura = pessoas.get(0);
		for (Pessoa pessoa : pessoas) {

			if (pessoa.getAltura() > pessoaComMaiorAltura.getAltura()) {

				pessoaComMaiorAltura = pessoa;
			}

		}

		return pessoaComMaiorAltura;
	}

	public static void calcularIMC(List<Pessoa> pessoas) {
		List<Pessoa> pessoasMagras = new ArrayList<Pessoa>();
		List<Pessoa> pessoasSobrePeso = new ArrayList<Pessoa>();
		List<Pessoa> pessoasObesas = new ArrayList<Pessoa>();
		List<Pessoa> pessoasObesidadeGrave = new ArrayList<Pessoa>();
		List<Pessoa> pessoasComObesidade = new ArrayList<Pessoa>();

		for (Pessoa pessoa : pessoas) {
			double imcPessoa = pessoa.getPeso() / (Math.pow(pessoa.getAltura(), pessoa.getAltura()));

			if (imcPessoa <= 18.5) {
				pessoasMagras.add(pessoa);
			} else if (imcPessoa >= 25.0 && imcPessoa <= 29.9) {
				pessoasSobrePeso.add(pessoa);
			} else if (imcPessoa >= 30.0 && imcPessoa <= 39.9) {
				pessoasObesas.add(pessoa);
			} else if (imcPessoa >= 40.0) {
				pessoasObesidadeGrave.add(pessoa);
			} else if (imcPessoa > 30.0) {
				pessoasComObesidade.add(pessoa);
			}
		}
		
		imprimirDetalhesLista(pessoasMagras, "Lista de pessoas magras: ");
		imprimirDetalhesLista(pessoasSobrePeso, "Lista de pessoas com sobrepeso: ");
		imprimirDetalhesLista(pessoasObesas, "Lista de pessoas com obesidade: ");
		imprimirDetalhesLista(pessoasObesidadeGrave, "Lista de pessoas com obesidade grave: ");
		imprimirDetalhesLista(pessoasObesidadeGrave, "Lista de pessoas com obesidade grave: ");
		imprimirDetalhesLista(pessoasComObesidade, "Pessoas com obesidade: ");
		

		
	}
	
	private static void imprimirDetalhesLista(List<Pessoa> pessoas, String tipoLista) {
		System.out.println(tipoLista + pessoas.size());
		pessoas.forEach(pessoa -> System.out.println(pessoa.toString()));
	}
	
	public static void obterFuncaoMaisEncontrada(List<Pessoa> pessoas) {
		List<String> funcoes  = pessoas.stream().map(p -> p.getFuncao()).collect(Collectors.toList());
		
		funcoes.stream()
	      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
	}
	
	public static void obterMarcaMaisUtilizada(List<Veiculo> veiculos) {
		List<String> marcas  = veiculos.stream().map(veiculo -> veiculo.getModelo()).collect(Collectors.toList());
		
		marcas.stream()
	      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
	}
	
	public static void obterEmpresasMaisRecorrentes(List<Pessoa> pessoas) {
		List<String> empresas = pessoas.stream().map(pessoa -> pessoa.getEmpresa()).collect(Collectors.toList());
		
		empresas.stream()
	      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
	}	
}
// peso /altura * altura