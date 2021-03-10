package br.encapsulamento;

public class TesteAcesso {

	public static void main(String args[]) {
		Acesso objAcesso = new Acesso();
		
		objAcesso.a = 10; // o atributo a pode ser acessado diretamente
		
		objAcesso.b = 20; // o atributo b pode ser acessado diretamente
		
		// objAcesso.c = 100;  o atributoc n�o pode ser acessado diretamente pois est� PRIVATE
		
		objAcesso.setC(100); // setC � empregado para atribuir um valor a c;
		
		System.out.println("Os valores de a, b e c s�o: " + objAcesso.a + " " + objAcesso.b + " " + objAcesso.getC());
	}
}
