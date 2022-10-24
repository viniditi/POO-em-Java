package pooemjava.datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosdeDataHora {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);// O .minusDays retira a quantidade de dias desejado.
        LocalDate nextWeekLocalDate = d01.plusDays(7);// O .plusDays adiciona a quantidade de dias desejado.
        LocalDate nextYearLocalDate = d01.plusYears(7);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);// Quando é LocalDateTime, também tem as opções de horas, minutos, segundos, nanos segundo etc.
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);// Para modificar os dia, mês, ano, hora e minuto no instant, eu preciso chamar o ChronoUnit e colocar o que eu quero modificar nele.
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nexttWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("nexttWeekLocalDate: " + nextYearLocalDate);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
        //Ou posso uasar Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDays());
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);// A posição das datas importam para não aparecer o resultado em números negativos.
        
        
        System.out.println("T1 dias: " + t1.toDays());
        System.out.println("T2 dias: " + t2.toDays());
        System.out.println("T3 dias: "+t3.toDays());
        System.out.println("T4 dias: "+t4.toDays());
    }

}
