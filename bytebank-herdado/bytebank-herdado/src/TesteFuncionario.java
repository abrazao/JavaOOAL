
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("0222220-26");
		nico.setSalario(8000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		

	}

}
