package application;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	private int idade;
	private String sexo;
	private Float altura;
	private Float peso;
	
	//altura
	//peso
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}


	public Pessoa(String primeiroNome, String ultimoNome, int idade) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.idade = idade;
	}
	
	public String Saudacao() {
		return "Olá, meu nome é: " + primeiroNome + " " + ultimoNome;
	}
	
	public void FazerAniversario() {
		idade = idade + 1;
//		idade += 1;
	}
	
	public int RetornaIdade() {
		return idade;
	}
	
	
	public String VisualizarAlturaEPeso() {
		return "fulano tem " + altura + " e " + peso + "KG";
	}
	
	public String ConverterValorParaIMC(Float valor) {
		String variavelAuxiliar = "";
		
//		switch(valor) {
//			case valor <= 18.5f:
//				variavelAuxiliar = "Baixo Peso";
//			case valor > 18.5f && valor <= 24.99f:
//				variavelAuxiliar = "Normal";
//			case valor > 24.99f && valor <= 29.99f:
//				variavelAuxiliar = "Sobrepeso";
//			default:
//				variavelAuxiliar = "Obesidade";
//		}
		
		if(valor <= 18.5f) {
			variavelAuxiliar = "Baixo Peso";
		} else if(valor > 18.5f && valor <= 24.99f) {
			variavelAuxiliar = "Normal";
		} else if(valor > 24.99f && valor <= 29.99f) {
			variavelAuxiliar = "Sobrepeso";
		} else {
			variavelAuxiliar = "Obesidade";
		}
		
		return variavelAuxiliar;
	}
	
	
	public String CalcularIMC() {
		Float alturaEmMetros = (altura / 100); // Convertido de CM para Metros
		
		Float resultadoDoCalculo = peso / (alturaEmMetros * alturaEmMetros);
		
		return this.ConverterValorParaIMC(resultadoDoCalculo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}