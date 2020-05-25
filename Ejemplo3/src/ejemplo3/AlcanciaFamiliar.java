package ejemplo3;

import java.util.Observable;
import java.util.Observer;

public class AlcanciaFamiliar implements Observer
{
    Ahorrador ahorrador1;
    Ahorrador ahorrador2;
    Ahorrador ahorrador3;
    double total = 0;
    
    public AlcanciaFamiliar(Ahorrador a1, Ahorrador a2, Ahorrador a3)
    {
        this.ahorrador1 = a1;
        this.ahorrador2 = a2;
        this.ahorrador3 = a3;
        ahorrador1.addObserver(this);
        ahorrador2.addObserver(this);
        ahorrador3.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        Double cantidad = (Double)arg;
        double cant = cantidad.doubleValue();
        total=total+cant;
        if ((Ahorrador)o == ahorrador1)
        {
            System.out.println(((Ahorrador)o).getNombre()+" ha despositado en la alcancía familiar, la cantidad de: "+ cant);
            ahorrador1.setSaldoTotalFamilia(total); //ver si el diseño lo amerita
        }
        else if ((Ahorrador)o == ahorrador2)
        {
            System.out.println(((Ahorrador)o).getNombre()+" ha despositado en la alcancía familiar, la cantidad de: "+ cant);
            ahorrador2.setSaldoTotalFamilia(total);//ver si el diseño lo amerita
        }
        else if ((Ahorrador)o == ahorrador3)
        {
            System.out.println(((Ahorrador)o).getNombre()+" ha despositado en la alcancía familiar, la cantidad de: "+ cant);
            ahorrador3.setSaldoTotalFamilia(total);//ver si el diseño lo amerita
        }
        total=total+cant;
        //se podrían haber simplificado los ifs?
    }
}
