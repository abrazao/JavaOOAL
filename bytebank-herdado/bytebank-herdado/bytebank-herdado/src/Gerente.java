// Gerente herda da Class Funcion�rio
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
		
    public double getBonificacao() {
    	System.out.println(super.getBonificacao());
    	System.out.println(super.getSalario());
    	
        return (super.getBonificacao()) + super.getSalario();
        
    }
    
    
}
