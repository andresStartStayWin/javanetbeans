
package principal.persistencia;

import principal.dominio.usuario.Usuario;


public final class UsuarioDAO extends DAO {
    
    public void guardarUsuario(Usuario usuario) {
        
        try {
            if (usuario = null) {
                throw new Exception("Debe indicar un usuario");
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
}
