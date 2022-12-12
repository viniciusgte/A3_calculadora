    
    public class Profissional {

    public String Nome;
    public double ValorMensalDesejado;
    public double hdd;
    public int diasUteis = 20;
    


    // Fórmula original: VH = VMD/(20 * HDD)
    // Fórmula dividida em métodos:  hm = 20 * HDD
    public double horasLivresMes () {
        double hm;
        hm = 20 * hdd;
        return hm; 
    }

    // Sequência da fórmula dividida em métodos VH = VMD/(hm) 
    public double CalculaValorHora () {
        double VH = ValorMensalDesejado / horasLivresMes();
        return VH;
    }
    
    // VMD = valor mensal desejado | HDD = horas diárias disponíveis | VH = valor hora
    
        
    }




