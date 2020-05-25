package ejemplo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Usuario extends Observable
{
    private Map conectados = new HashMap();

    public void login(String nombre, String contraseña) throws UsuarioIncorrectoException
    {
        if (!contraseñaValida(nombre, contraseña))
        {
            throw new UsuarioIncorrectoException(nombre);
        }
        EstadoUsuario estado = new EstadoUsuario(nombre);
        conectados.put(nombre, estado);
        setChanged();
        notifyObservers(estado);
    }

    public void logout(EstadoUsuario estado)
    {
        conectados.remove(estado.nombre());
        setChanged();
        notifyObservers(estado);
    } //.....
}
