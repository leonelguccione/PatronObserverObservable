package ejemplo3;


public class Main
{
    public Main()
    {
        super();
    }
    
    public static void main(String args[])
    {
        //este ejemplo contiene un uso exagerado y errado del patron, descubrir las consecuencias
        Ahorrador bart = new Ahorrador("Bart");
        Ahorrador homero = new Ahorrador("Homero");
        Ahorrador lisa = new Ahorrador("Lisa");
        
        AlcanciaFamiliar alcanciaFamiliar= new AlcanciaFamiliar(bart, homero, lisa);
        
        AlcanciaIndividual alcanciaIndividualLisa = new AlcanciaIndividual(lisa);
        AlcanciaIndividual alcanciaIndividualBart = new AlcanciaIndividual(bart);
        
        bart.agregarDineroAlcanciaPropia(100);
        lisa.agregarDineroAlcanciaPropia(200);        
        homero.agregarDineroAlcanciaPropia(300);

        bart.agregarDineroFamilia(1000);
        lisa.agregarDineroFamilia(2000);
        homero.agregarDineroFamilia(3000);
        
    }
}
