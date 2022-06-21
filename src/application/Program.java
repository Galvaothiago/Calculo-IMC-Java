package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		
		Double valor = 126.3D;
		
		Pessoa pessoa1 = new Pessoa("Thiago","Galvão", 29);
		
		
//		System.out.println(pessoa1.RetornaIdade());
		
//		pessoa1.FazerAniversario();
//		pessoa1.FazerAniversario();
//		pessoa1.FazerAniversario();
		
		
		
		
		Pessoa fulano = new Pessoa(172f, 62f);
		
		
		
		System.out.println(fulano.CalcularIMC());
		
		
	}

}
