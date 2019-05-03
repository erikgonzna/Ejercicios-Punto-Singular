package modelo;

public class Cubo extends Cuadrado{
	public float calcularVolumen() {
		return getLado()*getLado()*getLado();
	}
	@Override
	public float calcularPerimetro() {
		return 12*getLado();
	}
}
