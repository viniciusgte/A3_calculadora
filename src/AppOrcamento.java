import java.text.DecimalFormat;
import java.util.Scanner;

public class AppOrcamento {
    public static double hd = 0;
    public static void main(String[] args) {
        ItemSistema itemSistema = new ItemSistema();
        Profissional calculadora = new Profissional();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        calculadora.Nome=sc.next();
        System.out.println("Digite abaixo sua pretensão salarial: ");
        calculadora.SalarioMensal=sc.nextDouble();
        System.out.println("Digite abaixo quantas horas dísponíveis você tem por dia:  ");
        calculadora.fhd = sc.nextDouble();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de entrada e saida de dados (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_EntradaSaida = sc.nextInt();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de consulta (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_Consulta = sc.nextInt();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de gravação (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_Gravacao = sc.nextInt();
    //    Formatação com padrão de moeda em Real
        DecimalFormat money = new DecimalFormat("R$###,###,###,##0.00");
    //    Formatação das horas
        DecimalFormat time = new DecimalFormat("######0 horas");

        System.out.println("\nNome: " + calculadora.Nome);
        System.out.println("Salário Mensal Pretendido: " + money.format(calculadora.SalarioMensal));
        System.out.println("Horas Mês: " + time.format(calculadora.horasUteisMes()));
        System.out.println("Valor/Hora: " + money.format(calculadora.CalculaValorHora()));
    

        ItemSistema[] lista_Itens_Sistemas = new ItemSistema[3];

        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela de operação com E/S de dados";
        tela1.tipoItem = "Entrada e saida de dados";
        tela1.complex_EntradaSaida = itemSistema.complex_EntradaSaida;
        lista_Itens_Sistemas[0] = tela1;

        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de consulta com visualização de dados";
        tela2.tipoItem = "Consulta de dados";
        tela2.complex_Consulta = itemSistema.complex_Consulta;
        lista_Itens_Sistemas[1] = tela2;

        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de cadastro com gravação de dados";
        tela3.tipoItem = "Gravação de dados";
        tela3.complex_Gravacao = itemSistema.complex_Gravacao;
        lista_Itens_Sistemas[2] = tela3;

        System.out.println(" ");
        System.out.println("Item 1 do orçamento: " + tela1.nomeItem);
        System.out.println("------------------------------------");
        System.out.println("Tipo do Item: " + tela1.tipoItem);
        System.out.println("------------------------------------");
        System.out.println("Complexidade do Item: " + tela1.complex_EntradaSaida);
        System.out.println("------------------------------------");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela1.CalcularHorasEntradaSaida()));
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Item 2 do orçamento: " + tela2.nomeItem);
        System.out.println("------------------------------------");
        System.out.println("Tipo do Item: " + tela2.tipoItem);
        System.out.println("------------------------------------");
        System.out.println("Complexidade do Item: " + tela2.complex_Consulta);
        System.out.println("------------------------------------");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela2.CalcularHorasConsulta()));
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Item 3 do orçamento: " + tela3.nomeItem);
        System.out.println("------------------------------------");
        System.out.println("Tipo do Item: " + tela3.tipoItem);
        System.out.println("------------------------------------");
        System.out.println("Complexidade do Item: " + tela3.complex_Gravacao);
        System.out.println("------------------------------------");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela3.CalcularHorasGravacao()));
        System.out.println("------------------------------------");

        int total_Horas_Telas = tela1.CalcularHorasEntradaSaida()+tela2.CalcularHorasConsulta()+tela3.CalcularHorasGravacao();
        
        int total_final_tempo = total_Horas_Telas + (30 * total_Horas_Telas / 100);

        System.out.println("Horas totais necessárias para conclusão do sistema: " + total_final_tempo);
        System.out.println("------------------------------------");

        double valor_Total_Sistema = calculadora.CalculaValorHora() * total_Horas_Telas;

        System.out.println("\nValor Total do Orçamento: " + money.format(valor_Total_Sistema));
   
   sc.close();

    }
}