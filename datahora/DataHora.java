package pooemjava.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args) {
        
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        //Todos os fotmatos no site acima.
        
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
        
        
    }
    
}
