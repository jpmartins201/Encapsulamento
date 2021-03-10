package br.encapsulamento;

public class TesteAcesso {

	public static void main(String args[]) {
		Acesso objAcesso = new Acesso();
		
		objAcesso.a = 10; // o atributo a pode ser acessado diretamente
		
		objAcesso.b = 20; // o atributo b pode ser acessado diretamente
		
		// objAcesso.c = 100;  o atributoc não pode ser acessado diretamente pois está PRIVATE
		
		objAcesso.setC(100); // setC é empregado para atribuir um valor a c;
		
		System.out.println("Os valores de a, b e c são: " + objAcesso.a + " " + objAcesso.b + " " + objAcesso.getC());
	}
}
