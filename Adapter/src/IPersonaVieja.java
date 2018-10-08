
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public interface IPersonaVieja {
    public String getNombre();
    public void setNombre (String nombre);
    public String getApellido();
    public void setApellido (String apellido);
    public Date getFechaDeNacimiento();
    public void setFechaDeNacimiento( Date fechaDeNacimiento);
    
    
}
