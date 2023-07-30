package org.degarzonm.simpleCRUD.modelos;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public abstract class SerVivo {
    private String nombre;
    private Date nacimiento;
    private String lugarOrigen;
    private String ubicacion;

}