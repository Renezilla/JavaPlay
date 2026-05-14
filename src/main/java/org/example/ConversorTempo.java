package org.example;

public class ConversorTempo {

        public static String formatarMinutos(int minutos) {
            int horas = minutos / 60;
            int minRestantes = minutos % 60;
            return String.format("%dh %02dmin", horas, minRestantes);
        }
    }


