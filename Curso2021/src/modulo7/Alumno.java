package modulo7;

public class Alumno extends Persona {
	private int numeroExpdiente;

	public Alumno() {
		super();
		numeroExpdiente = 202109;
	}

	public Alumno(int numeroExpdiente) {
		super();
		this.numeroExpdiente = numeroExpdiente;
	}

	public int getNumeroExpdiente() {
		return numeroExpdiente;
	}

	public void setNumeroExpdiente(int numeroExpdiente) {
		this.numeroExpdiente = numeroExpdiente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroExpdiente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (numeroExpdiente != other.numeroExpdiente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [numeroExpdiente=" + numeroExpdiente + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
