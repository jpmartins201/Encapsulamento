package br.encapsulamento;

public class Acesso {
	int a; //acesso padr�o
	
	public int b; // acesso p�blico
	
	private int c; // acesso privado
	
	public int getC() {
		return this.c;
	}
	
	public void setC(int qualquer) {
		this.c = qualquer;
	}

	// Esse código está na branch "branch_exemplo"

	// E agora eu faço mais alterações que eu como programador decidi que eram necessárias ao código

	// Depois de um tempo botei mais uma funcionalidade aqui
}
