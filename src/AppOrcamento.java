import java.text.DecimalFormat;
import java.util.Scanner;
import java.sql.SQLException;

public class AppOrcamento {
    public static double hd = 0;
    public static void main(String[] args) {
        
        ItemSistema itemSistema = new ItemSistema();
        Profissional calculadora = new Profissional();
        Scanner sc = new Scanner(System.in);
        
        // Input das Informações Necessárias
        System.out.println("Digite seu nome abaixo: ");
        calculadora.Nome=sc.nextLine();
        System.out.println("Digite abaixo sua pretensão salarial: ");
        calculadora.ValorMensalDesejado=sc.nextDouble();
        System.out.println("Digite abaixo quantas horas dísponíveis você tem por dia:  ");
        calculadora.hdd = sc.nextDouble();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de entrada e saida de dados (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_EntradaSaida = sc.nextInt();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de consulta (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_Consulta = sc.nextInt();
        System.out.print("Digite ao lado a complexidade de 1 a 3 da tela de gravação (Caso ela não exista, digite 0 para continuar): ");
        itemSistema.complex_Gravacao = sc.nextInt();
   
        // Formatação com padrão de moeda em Real
        DecimalFormat money = new DecimalFormat("R$###,###,###,##0.00");
        // Formatação das horas
        DecimalFormat time = new DecimalFormat("######0 horas");

        // Dados do Profissional
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ORÇAMENTO: ");
        System.out.println("\nNome do profissional: " + calculadora.Nome);
        System.out.println("Valor Mensal Desejado: " + money.format(calculadora.ValorMensalDesejado));
        System.out.println("Horas Disponíveis Mês: " + time.format(calculadora.horasLivresMes()));
        System.out.println("Valor/Hora: " + money.format(calculadora.CalculaValorHora()));
        System.out.println(" ");
    
        // Lista de itens do sistema 
        ItemSistema[] lista_Itens_Sistemas = new ItemSistema[3];

        // Cálculo Item 1 
        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela E/S de dados";
        tela1.tipoItem = "Entrada e saida de dados";
        tela1.complex_EntradaSaida = itemSistema.complex_EntradaSaida;
        lista_Itens_Sistemas[0] = tela1;
       
        // Cálculo Item 2
        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de consulta com visualização de dados";
        tela2.tipoItem = "Consulta de dados";
        tela2.complex_Consulta = itemSistema.complex_Consulta;
        lista_Itens_Sistemas[1] = tela2;

        // Cálculo Item 3
        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de cadastro com gravação de dados";
        tela3.tipoItem = "Gravação de dados";
        tela3.complex_Gravacao = itemSistema.complex_Gravacao;
        lista_Itens_Sistemas[2] = tela3;

        // Impressão Item 1
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Item 1 do orçamento: " + tela1.nomeItem);
        System.out.println(" ");
        System.out.println("Tipo do Item: " + tela1.tipoItem);
        System.out.println(" ");
        System.out.println("Complexidade do Item: " + tela1.complex_EntradaSaida);
        System.out.println(" ");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela1.CalcularHorasEntradaSaida()));
        System.out.println(" ");

        // Impressão Item 2 
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Item 2 do orçamento: " + tela2.nomeItem);
        System.out.println(" ");
        System.out.println("Tipo do Item: " + tela2.tipoItem);
        System.out.println(" ");
        System.out.println("Complexidade do Item: " + tela2.complex_Consulta);
        System.out.println(" ");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela2.CalcularHorasConsulta()));
        System.out.println(" ");

        // Impressão Item 3
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Item 3 do orçamento: " + tela3.nomeItem);
        System.out.println(" ");
        System.out.println("Tipo do Item: " + tela3.tipoItem);
        System.out.println(" ");
        System.out.println("Complexidade do Item: " + tela3.complex_Gravacao);
        System.out.println(" ");
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela3.CalcularHorasGravacao()));
        System.out.println(" ");
        System.out.println("------------------------------------");

        // Tempo de construção do sistema
        int tempoTotalTelas = tela1.CalcularHorasEntradaSaida()+tela2.CalcularHorasConsulta()+tela3.CalcularHorasGravacao();
        System.out.println(" ");
        System.out.println("Prazo para conclusão do sistema: Cerca de " + time.format(tempoTotalTelas));
        
        // Valor sem adição dos valores de gestão, encargos e risco
        double valor_Sistema = calculadora.CalculaValorHora() * tempoTotalTelas;
                
        // Valor Sistema + 30% de gestão, encargos e risco.
        double valor_Total_Sistema = valor_Sistema + valor_Sistema*30/100; 

        // Impressão final do orçamento
        System.out.println("\n Valor/Hora do Orçamento: " + money.format(calculadora.CalculaValorHora()));
        System.out.println("\n Valor final do Orçamento: " + money.format(valor_Total_Sistema));
        System.out.println(" ");
        System.out.println("Orçamento Concluído com Sucesso!");
        System.out.println(" ");
        System.out.println("------------------------------------");

        sc.close();

// Banco de dados 

        //  Conexao db1 = new Conexao();
        //  String sql = " CREATE TABLE Orcamento if not exists "+
            //"(id int(11) not null auto_increment primary key,
            //tela1 varchar(70),
            //tela2 varchar(70),
            //tela3 varchar(70),
            //tempoTotalTelas int,
            // valortotalsistema DOUBLE");

        // db1.OpenDatabase();
        // db1.ExecutaQuery(sql);
                
        // sql =    "INSERT into Orcamento "+
                // "(tela1) value ('') ,
                // (tela2) value (''),
                // (tela3) value (''),
                // (tempoTotalTelas) value (''),
                // (valortotalsistema) value ('')";

        // db1.ExecutaQuery(sql);
        // db1.CloseDatabase();

    }
}