package modulo7;

public class Profesor extends Persona {
	private int seguridadSocial;

	public Profesor() {
		super();
		seguridadSocial = 20210968;
	}

	public Profesor(int seguridadSocial) {
		super();
		this.seguridadSocial = seguridadSocial;
	}

	public int getSeguridadSocial() {
		return seguridadSocial;
	}

	public void setSeguridadSocial(int seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + seguridadSocial;
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
		Profesor other = (Profesor) obj;
		if (seguridadSocial != other.seguridadSocial)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profesor [seguridadSocial=" + seguridadSocial + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
