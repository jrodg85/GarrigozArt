package buluju.GarrigozArt.entidades;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CUADROS")
public class Cuadro {


  // atributo de id del cuadro

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, name = "ID_CUADRO", length = 50, nullable = false)
  private long idCuadro;

  // atributo de titulo de cuadro
  @Basic(optional = false)
  @Column(name = "TITULO_DEL_CUADRO", length = 15)
  private String titulo;

  // atributo de descripcion del cuadro

  @Basic(optional = false)
  @Column(name = "DESCRIPCION_DEL_CUADRO", length = 100)
  private String descripcion;


  // atributo de tecnica del cuadro

  @Basic(optional = false)
  @Column(name = "TECNICA_DEL_CUADRO", length = 15)
  private String tecnica;


  // atributo ancho del lienzo, en centimetros


  @Basic(optional = false)
  @Column(name = "ANCHO_EN_CENTIMETROS", length = 3)
  private int anchoCm;


  // atributo de alto del cuadro

  @Basic(optional = false)
  @Column(name = "ALTO_EN_CENTIMETROS", length = 3)
  private int altoCm;


  // atributo del precio

  @Basic(optional = false)
  @Column(name = "PRECIO_DEL_CUADRO", length = 10)
  private double precio;


  // getters

  public long getIdCuadro() {
    return idCuadro;
  }


  public String getTitulo() {
    return titulo;
  }


  public String getDescripcion() {
    return descripcion;
  }


  public String getTecnica() {
    return tecnica;
  }


  public int getAnchoCm() {
    return anchoCm;
  }


  public int getAltoCm() {
    return altoCm;
  }

  public double getPrecio() {
    return precio;
  }


  // setters


  public void setIdCuadro(long idCuadro) {
    this.idCuadro = idCuadro;
  }


  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }


  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  public void setTecnica(String tecnica) {
    this.tecnica = tecnica;
  }


  public void setAnchoCm(int anchoCm) {
    this.anchoCm = anchoCm;
  }


  public void setAltoCm(int altoCm) {
    this.altoCm = altoCm;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  // contructores

  public Cuadro() {
    super();
  }


  public Cuadro(String titulo, String descripcion, String tecnica, int anchoCm, int altoCm,
      double precio) {
    super();
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.tecnica = tecnica;
    this.anchoCm = anchoCm;
    this.altoCm = altoCm;
    this.precio = precio;
  }


  @Override
  public int hashCode() {
    return Objects.hash(descripcion, tecnica, titulo);
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cuadro other = (Cuadro) obj;
    return Objects.equals(descripcion, other.descripcion) && Objects.equals(tecnica, other.tecnica)
        && Objects.equals(titulo, other.titulo);
  }



}
