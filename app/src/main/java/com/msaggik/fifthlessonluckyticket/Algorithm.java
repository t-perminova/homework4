package com.msaggik.fifthlessonluckyticket;

public class Algorithm {

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод определения счастливый билет или нет
    public boolean isHappyTicket(int ticketNumber) {


        // чётные числа
        int s1 = 0;

        // нечётные числа
        int s2 = 0;

        // подсчёт суммы чётных и нечётных цифр
        for(int i = 0; i < 6; i++) {
            if((ticketNumber % 10) % 2 > 0) s1 += ticketNumber % 10;
            else s2 += ticketNumber % 10;

            ticketNumber = ticketNumber / 10;
        }
        // проверка равенства
        if (s1 == s2) { // если суммы равны
            return true;   // то билет счастливый
        } else { // иначе
            return false; // билет не счастливый
        }
    }

    // метод определения следующего счастливого билета
    public int getHappyTicket(int ticketNumber) {
       if(!isHappyTicket(ticketNumber)) {
         while(!isHappyTicket(ticketNumber)) {
               ticketNumber++;
           }
           return ticketNumber;
        } else {
           return ticketNumber;
       }
    }
}
