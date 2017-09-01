/**
 * clase reloj muestra la hora y cada vez que hace in tic tac suma minutos al reloj.
 * @author Israel Vergara
 */
public class Reloj
{
    private int horas;
    private int minutos;
    private int incremento;
    
    /**
     * Constructor que inicializa variables como horas, minutos e incremento
     * @param horaInicial y minInicia las cuales contienen las horas y  minutos
     * iniciales respectivamente.
     */
    public Reloj(int horaInicial, int minInicial)
    {
        horas = horaInicial;
        minutos = minInicial;
        incremento = 1;
    }
    
    /**
     * metodo que indica el tiempo
     * @return cadRerultado variable de tipo String que contine la hora
     */
    public String dimeTuTiempo()
    {
        String cadResultado = "";
        
        cadResultado = cadResultado + horas;
        cadResultado = cadResultado + ":";
        cadResultado += minutos;
        
        return cadResultado;
    }
    
    /**
     * Metodo que incrementa en uno el valor de los minutos
     */
    public void ticTac()
    {
               
        if(minutos <= 59 && minutos >=0)
        {
            minutos += incremento;
            if(minutos == 60)
            {
                minutos = 0;
                horas += incremento;
                if(horas == 24)
                {
                    horas = 0; 
                }
            }
        }
    }
}
