package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter //GENERA LOS GETTER CON LOMBOOK AL COMPILAR
@NoArgsConstructor//CONSTRUCTOR SIN ATRIBUTOS O DEFAULD
@AllArgsConstructor//CONSTRUCTOR CON ATRIBUTOS
@EqualsAndHashCode(of = "id")//USA EL PARAMETRO ID PARA LA COMPARACIONES ENTRE MEDICOS
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GENERAR ID AUTOMATICAMENTE SI REPETIR
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(DTODatosRegistroMedico datosRegistroMedico) {
        this.nombre = datosRegistroMedico.nombre();
        this.email = datosRegistroMedico.email();
        this.documento = datosRegistroMedico.documento();
        this.telefono = datosRegistroMedico.telefono();
        this.especialidad = datosRegistroMedico.especialidad();
        this.direccion = new Direccion(datosRegistroMedico.direccion());
    }
}
