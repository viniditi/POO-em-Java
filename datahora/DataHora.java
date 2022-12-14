package pooemjava.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//Parte 02

import java.time.ZoneId;

public class DataHora {

    public static void main(String[] args) {
        
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        //Todos os fotmatos no site acima.
        
        //Parte 01
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Eu indico como o programa deve mostrar a data customizada na impressão.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
       LocalDate d01 = LocalDate.now();//Instância a data de agora.
       LocalDateTime d02 = LocalDateTime.now();//Instância a data e o horário
       Instant d03 = Instant.now();//Gera a Data-Hora no horário de Londres, no formato GMT(Greenwich Mean Time). Pode-se identificar isso olhando pela letra 'z' no fianl da Data-Hora.
       LocalDate d04 = LocalDate.parse("2022-07-20");//Adiciona a Data no formato ISO.
       LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Adiciona a Data-Hora no formato ISO.
       Instant d06 = Instant.parse("2022-07-20T01:30:26z");//Cria a Data-Hora no formato ISO e no padrão GMT.
       Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//Eu posso adianta mais horas no meu horário usando -03:00.
       LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);//Eu coloco aqui a data customizada para que o programa leia e imprima ele.
       LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
       LocalDate d10 = LocalDate.parse("25/12/2125",DateTimeFormatter.ofPattern("dd/MM/yyyy"));//Eu posso indicar diretemente na própria área como eu quero que seja a Data-Hora.
       LocalDate d11 = LocalDate.of(2022, 7, 20);//Esse .of aceita ano, mês e dia respectivamente.
       LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);//Esse mostra ano,mês,dia,hora,minuto respectivamente.
       
       //Parte 02
       
       LocalDate d13 = LocalDate.parse("2022-07-21");
       LocalDateTime d14 = LocalDateTime.parse("2022-07-21T01:30:26");
       Instant d15 = Instant.parse("2022-07-21T01:30:26Z");
       
       
       DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//Chama a Hora com os minutos.
       DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//Uso esse padrão para mostrar o fuso Horário do sistema local do computador que está rodando o programa. 
       //Porém o instant não tem o método format, por isso eu adiociono o '.withZone(ZoneId.systemDefault()'.
       DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
       DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;//Eu chamo assim para mostrar o fuso Horário no formato ISO.
       
       //Parte 01
       
        System.out.println("d01: "+d01);
        System.out.println("d02: "+d02);
        System.out.println("d03: "+d03.toString());//O .toString adiciona a Data-Hora no formato ISO. OBS: Eu posso adicionar o .toString em todas as Data-Hora.
        System.out.println("d04: "+d04);
        System.out.println("d05: "+d05);
        System.out.println("d06: "+d06);
        System.out.println("d07: "+d07);
        System.out.println("d08: "+d08);
        System.out.println("d09: "+d09);
        System.out.println("d10: "+d10);
        System.out.println("d11: "+d11);
        System.out.println("d12: "+d12);
        
        //Parte 02
        
        System.out.println();
        System.out.println("d13: "+d13.format(fmt3));//Eu formato para aparecer da maneira que eu escrevi no DateTimeFormatter, que nesse caso foi usando '/' para separar.
        System.out.println("d13: "+fmt3.format(d13));//Faz a mesma coisa que o de cima.
        System.out.println("d13: "+d13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//Tem como chamar o formato por inteiro também.       
        System.out.println("d14: "+d14.format(fmt3));
        System.out.println("d14: "+d14.format(fmt2));
        System.out.println("d15: "+fmt5.format(d15));//Eu chamo o instant assim. Eu eu estou chamando a data equivalente de São Paulo, com o fuso Horário.
        System.out.println("d14: "+d14.format(fmt6));
        System.out.println("d15: "+fmt7.format(d15));
        System.out.println("d15: "+d15.toString());//Mostra do mesmo jeito.
        
    }
    
}
