
public class EditorVideo extends Funcionario {
	
	public double getBonitifacao() {
		System.out.println("Classe EditorVideo calculando a Bonificacao");
		return super.getBonificacao() + 150;
	}

}
