public class Reloj
{
    private int horas;
    private int minutos;
    private int incremento;
    
    public Reloj(int horaInicial, int minInicial)
    {
        horas = horaInicial;
        minutos = minInicial;
        incremento = 1;
    }
    
    public String dimeTuTiempo()
    {
        String cadResultado = "";
        
        cadResultado = cadResultado + horas;
        cadResultado = cadResultado + ":";
        cadResultado += minutos;
        
        return cadResultado;
    }
    
    void ticTac()
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
