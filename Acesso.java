package br.encapsulamento;

public class Acesso {
	int a; //acesso padr?o
	
	public int b; // acesso p?blico
	
	private int c; // acesso privado
	
	public int getC() {
		return this.c;
	}
	
	public void setC(int qualquer) {
		this.c = qualquer;
	}
}
