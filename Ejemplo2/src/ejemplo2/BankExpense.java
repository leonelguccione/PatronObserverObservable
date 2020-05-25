package ejemplo2;

import java.util.Observable;
import java.util.Observer;

public class BankExpense implements Observer
{
    BankAccount bankAccount;
    private String type;
    private Double totalCalculated = new Double(0D);
    private final Double rateCoefficient;

    public BankExpense(BankAccount bankAccount, String type, Double rateCoefficient)
    {
        this.bankAccount = bankAccount;
        bankAccount.addObserver(this);//agrego al observado/ble, un nuevo observador/ver
        this.type = type;
        this.rateCoefficient = rateCoefficient;
    }

    @Override
    public void update(Observable o, Object value)
    {
        if((BankAccount)o == bankAccount)//se refiere al objeto observado
        {
            this.totalCalculated = ((Double) value) * rateCoefficient;
        }
    }

    public Double getTotalCalculated()
    {
        return totalCalculated;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "BankExpense{" + "type='" + type + '\'' + ", rateCoefficient=" + rateCoefficient + ", totalCalculated=" +
               totalCalculated + '}';
    }
}
