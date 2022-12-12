    
    public class Profissional {

    public String Nome;
    public double SalarioMensal;
    public double fhd;
    public int diasUteis = 20;
    
    public double horasUteisMes () {
        double hm;
        hm = 20 * fhd;
        return hm;
    
    }


    public double CalculaValorHora () {
        double vh;
        vh = SalarioMensal / horasUteisMes();
        return vh;
    }
    
        
    }




