package modelo;

public class Cuadrado {
	private float lado;
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float calcularArea() {
		return lado*lado;
	}
	public float calcularPerimetro() {
		return 4*lado;
	}
}
