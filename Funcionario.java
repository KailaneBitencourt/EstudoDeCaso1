package funcionarios;

public abstract class Funcionario {
	public String nome;
    public String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularPagamento();
	
}
