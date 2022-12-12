public class ItemSistema {
    public String nomeItem;
    public String tipoItem;
    public int cont=0;
    public int telasEntSai=0;
    public int telasCons=0;
    public int telasGrav=0;
    public int telas = (telasEntSai+telasCons+telasGrav);
    public int complexidadeEntSai = 0;
    public int complexidadeCons = 0;
    public int complexidadeGrav = 0;
    public int CalcularQuantidadeHorasEntSai() {
        int qtdHorasEntSai = 0;
        switch (complexidadeEntSai) {
            case 1:
                qtdHorasEntSai = 8;
                break;
            case 2:
                qtdHorasEntSai = 12;
                break;
            case 3:
                qtdHorasEntSai = 16;
                break;
            default:
                qtdHorasEntSai = 0;
                break;
        }
        return qtdHorasEntSai;
    }
    public int CalcularQantidadeHorasCons() {
        int qtdHorasCons = 0;
        switch (complexidadeCons) {
            case 1:
                qtdHorasCons = 4;
                break;
            case 2:
                qtdHorasCons = 6;
                break;
            case 3:
                qtdHorasCons = 8;
                break;
            default:
                qtdHorasCons = 0;
                break;
        }
        return qtdHorasCons;
    }
    public int CalcularQantidadeHorasGrav() {
        int qtdHorasGrav = 0;
        switch (complexidadeGrav) {
            case 1:
                qtdHorasGrav = 16;
                break;
            case 2:
                qtdHorasGrav = 24;
                break;
            case 3:
                qtdHorasGrav = 36;
                break;
            default:
                qtdHorasGrav = 0;
                break;
        }
        return qtdHorasGrav;
    }
}