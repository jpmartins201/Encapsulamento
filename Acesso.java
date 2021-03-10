package br.encapsulamento;

public class Acesso {
	int a; //acesso padrão
	
	public int b; // acesso público
	
	private int c; // acesso privado
	
	public int getC() {
		return this.c;
	}
	
	public void setC(int qualquer) {
		this.c = qualquer;
	}
}
