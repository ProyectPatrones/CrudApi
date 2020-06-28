package pe.edu.upc.democrud.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="persona")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idnews;
    private String name;
    private String telefono;
    private int nactividad;
    private String correo;
    private String sexo;
    private int edad;
    private int altura;
    private int peso;


    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private static final long serialVersionUID = 1L;

}
