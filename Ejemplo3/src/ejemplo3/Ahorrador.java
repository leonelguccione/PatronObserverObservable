package ejemplo3;

import java.util.Observable;

public class Ahorrador extends Observable
{
    String nombre;
    double saldoPropioFamilia = 0.00;

    //opcional, ver si el diseño lo amerita
    double saldoTotalFamilia = 0.00;

    double saldoPropioMio;

    public Ahorrador()
    {
        super();
    }

    public void setSaldoTotalFamilia(double saldoTotal)
    {
        this.saldoTotalFamilia = saldoTotal;
    }

    public double getSaldoTotalFamilia()
    {
        return saldoTotalFamilia;
    }

    public Ahorrador(String nombre)
    {
        super();
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void agregarDineroFamilia(double cantidad)
    {
        this.saldoPropioFamilia = this.saldoPropioFamilia + cantidad;
        setChanged();
        notifyObservers(new Double(cantidad));
    }

    public double getSaldoPropioFamilia()
    {
        return saldoPropioFamilia;
    }

    public void agregarDineroAlcanciaPropia(double dinero)
    {
        this.saldoPropioMio = this.saldoPropioMio + dinero;
        setChanged();
        notifyObservers(new Double(dinero));//Ojo con esto
    }


    public double getSaldoPropioMio()
    {
        return saldoPropioMio;
    }
}
