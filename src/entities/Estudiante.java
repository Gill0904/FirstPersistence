package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante {

	private int numerodecontrol;
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;

	public Estudiante() {
		super();
	}

	public Estudiante(int numerodecontrol, String nombre, String apellidopaterno, String apellidomaterno) {
		super();
		this.numerodecontrol = numerodecontrol;
		this.nombre = nombre;
		this.apellidopaterno = apellidopaterno;
		this.apellidomaterno = apellidomaterno;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getNumerodecontrol() {
		return numerodecontrol;
	}

	public void setNumerodecontrol(int numerodecontrol) {
		this.numerodecontrol = numerodecontrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidopaterno() {
		return apellidopaterno;
	}

	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}

	public String getApellidomaterno() {
		return apellidomaterno;
	}

	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}
}
