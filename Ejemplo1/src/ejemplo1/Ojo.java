package ejemplo1;

import java.util.Observable;
import java.util.Observer;

public class Ojo implements Observer
{
    Usuario observado;

    public Ojo(Usuario usuario)
    {
        observado = usuario;
        observado.addObserver(this);
    }

    public void update(Observable usuario, Object queEstado)
    {
        if (usuario != observado)
        {
            throw new IllegalArgumentException();
        }
        EstadoUsuario estado = (EstadoUsuario) queEstado;
        if (observado.conectados(estado))
            añadirUsuario(estado);
        else
            borrarUsuario(estado);
    }
}

