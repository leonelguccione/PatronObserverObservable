package ejemplo3;

import java.util.Observable;
import java.util.Observer;

public class AlcanciaIndividual implements Observer
{
    Ahorrador ahorrador;
    double total = 0.00;
    
    public AlcanciaIndividual(Ahorrador a)
    {
        this.ahorrador = a;
        ahorrador.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if ((Ahorrador)o == ahorrador)
        {
            Double cantidad = (Double)arg;
            double cant = cantidad.doubleValue();
            total=total+cant;
            System.out.println(((Ahorrador)o).getNombre()+" ha despositado en su alcancía propia, la cantidad de: "+ cant);
        }
    }
    
    //como agregaría una actualización a un nuevo atributo del Ahorrador que sea total_alcancia_propia ?
}
