public class ItemSistema {
    public String nomeItem;
    public String tipoItem;
    public int cont=0;
    public int telasEntradaSaida=0;
    public int telasConsulta=0;
    public int telasGravacao=0;
    public int telas = (telasEntradaSaida+telasConsulta+telasGravacao);
    public int complex_EntradaSaida = 0;
    public int complex_Consulta = 0;
    public int complex_Gravacao = 0;
    public int CalcularHorasEntradaSaida() {
        int qtdHorasEntradaSaida = 0;
        switch (complex_EntradaSaida) {
            case 1:
                qtdHorasEntradaSaida = 8;
                break;
            case 2:
                qtdHorasEntradaSaida = 12;
                break;
            case 3:
                qtdHorasEntradaSaida = 16;
                break;
            default:
                qtdHorasEntradaSaida = 0;
                break;
        }
        return qtdHorasEntradaSaida;
    }
    public int CalcularHorasConsulta() {
        int qtdHorasConsulta = 0;
        switch (complex_Consulta) {
            case 1:
                qtdHorasConsulta = 4;
                break;
            case 2:
                qtdHorasConsulta = 6;
                break;
            case 3:
                qtdHorasConsulta = 8;
                break;
            default:
                qtdHorasConsulta = 0;
                break;
        }
        return qtdHorasConsulta;
    }
    public int CalcularHorasGravacao() {
        int qtdHorasGravacao = 0;
        switch (complex_Gravacao) {
            case 1:
                qtdHorasGravacao = 16;
                break;
            case 2:
                qtdHorasGravacao = 24;
                break;
            case 3:
                qtdHorasGravacao = 36;
                break;
            default:
                qtdHorasGravacao = 0;
                break;
        }
        return qtdHorasGravacao;
    }
}