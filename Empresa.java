package funcionarios;

public class Empresa {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new FuncionarioHorista("Kailane", "987.987.900-12", 40, 40.0);
        funcionarios[1] = new FuncionarioMensalista("Bruno", "222.344-786-34", 3000.0);
        funcionarios[2] = new FuncionarioHorista("Sofia", "333.876.900-70", 30, 25.0);
        funcionarios[3] = new FuncionarioMensalista("Daiane", "490.484.449-44", 5500.0);

        for (Funcionario f : funcionarios) {
            System.out.printf("%s (%s): R$ %.2f%n",
                    f.nome, f.getClass().getSimpleName(), f.calcularPagamento());
        }

	}

}
