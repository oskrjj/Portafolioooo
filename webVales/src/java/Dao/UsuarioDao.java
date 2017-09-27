
package Dao;
import Dto.UsuarioDto;

public interface UsuarioDao extends BaseDao<UsuarioDto>{
    public boolean validarUsuario(String rut, String password);
    
}
