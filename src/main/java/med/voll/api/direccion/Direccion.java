package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DatosDireccion;

@Embeddable
@Getter //GENERA LOS GETTER CON LOMBOOK AL COMPILAR
@NoArgsConstructor//CONSTRUCTOR SIN ATRIBUTOS O DEFAULD
@AllArgsConstructor//CONSTRUCTOR CON ATRIBUTOS
public class Direccion {

    private String calle;
    private String numero;
    private String complemento;
    private String distrito;
    private String ciudad;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();
    }
}
