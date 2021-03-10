package br.encapsulamento;

public class Carro {
	public String marca;
    public String cor;
    public Motor motor;
 
    public void ligar()
    {
        this.motor.darPartida();
    }
 
    public String toString()
    {
        return marca + " " + cor + " " + motor.potencia;
    }
}
