package ejemplo1;

import java.util.Observable;

public class Observador extends Observable
{

    private int colorSeleccionado;
    private String color;

    public Observador()
    {

    }

    public void setColorSeleccionado(int i)
    {
        this.colorSeleccionado = i;
        setChanged();
        notifyObservers();
    }

    public int getColorSeleccionado()
    {
        return colorSeleccionado;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }
}