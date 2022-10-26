package pooemjava.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaodeDataeHora {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-08-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-08-21T01:30:26");
        Instant d03 = Instant.parse("2022-08-21T01:30:26Z");
        
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());//Eu converto o meu instant para uma data local considerando o horário do meu compuatador.  
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        
        
        
        
        System.out.println("R1: "+r1);
        System.out.println("R2: "+r2);
        System.out.println("R3: "+r3);
        System.out.println("R4: "+r4);
        
        System.out.println("D01 dia: "+d01.getDayOfMonth());//Pega o dia da data.
        System.out.println("D01 mês: "+d01.getMonthValue());//Pega o mês da data.
        System.out.println("D01 ano: "+d01.getYear());//Pega o ano da data.
        System.out.println("D02 hora: "+d02.getHour());//Pefa a hora do tempo.
        System.out.println("D02 minuto: "+d02.getMinute());//Pega o minuto do tempo
        
        
        
        for (String s : ZoneId.getAvailableZoneIds()){//Mostra todas as ZoneId.
            System.out.println(s);
        }
        

    }

}
