package pe.edu.upc.democrud.Model;


import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    private String sexo;
    private int altura;
    private int peso;
    private String sedentarismo;

    public String getSedentarismo() {
        return sedentarismo;
    }

    public void setSedentarismo(String sedentarismo) {
        this.sedentarismo = sedentarismo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Persona(int id, String name, String telefono, String sexo, int altura, int peso) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(){}

    public Persona(int id, String name, String telefono) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
