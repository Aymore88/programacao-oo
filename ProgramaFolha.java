// Classe abstrata Funcionario
abstract class Funcionario {
	protected String nome;
	protected double salarioBase;

	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("SalC!rio Base: " + salarioBase);
	}

	public abstract double calcularSalario();
}

// Classe concreta FuncionarioCLT
class FuncionarioCLT extends Funcionario {
	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	public double calcularSalario() {
		return salarioBase + 300;
	}
}

// Classe concreta FuncionarioTemporario
class FuncionarioTemporario extends Funcionario {
	public FuncionarioTemporario(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	public double calcularSalario() {
		return salarioBase - 100;
	}
}

// Classe principal
public class ProgramaFolha {
	public static void main(String[] args) {
		FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000);
		FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000);

		carlos.exibirDados();
		System.out.println("SalC!rio Final: " + carlos.calcularSalario());
		System.out.println();

		ana.exibirDados();
		System.out.println("SalC!rio Final: " + ana.calcularSalario());
	}
}
