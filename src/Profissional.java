    
    public class Profissional {

    public String Nome;
    public double ValorMensalDesejado;
    public double hdd;
    public int diasUteis = 20;
    
    public double horasLivresMes () {
        double hm;
        hm = 20 * hdd;
        return hm;
    
    }


    public double CalculaValorHora () {
        double VH;
        VH = ValorMensalDesejado / horasLivresMes();
        return VH;
    }
    
        
    }




