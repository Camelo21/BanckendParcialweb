package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.amazonaws.util.json.JSONObject;
import java.util.Iterator;
import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;


@Entity
@Table(name="libros_CamMelo")
public class Libro {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titulo;
	String referencia;
	String autor;
	Double precio;
	String ubicacion;
	
    public Libro(String titulo, String referencia, String autor, Double precio, String ubicacion) {
		super();
		this.titulo = titulo;
		this.referencia = referencia;
		this.autor = autor;
		this.precio = precio;
        this.ubicacion = ubicacion;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }



    public void setLibro(String titulo, String referencia, String autor, Double precio, String ubicacion) {
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }
    
    
    


}
