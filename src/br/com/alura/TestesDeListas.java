package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestesDeListas {
    public static void main(String[] args) {

        String time1 = "São paulo";
        String time2 =  "Santos";
        String time3 = "Palmeiras";

        ArrayList<String> times = new ArrayList<>();
        times.add(time1);
        times.add(time2);
        times.add(time3);

        times.remove(2);

        System.out.println(times + " verdadeiro ");

        for (String time : times) {
            System.out.println("time: " + time);
        }

        String primeiroTime = times.get(0);
        System.out.println("O primero time é " + primeiroTime);

        for(int i = 0; i < times.size(); i++){
            System.out.println("time :" + times.get(i));
        }

        System.out.println(times.size());

        times.forEach(time -> {
            System.out.println("percorrendo :" + time);
        });

        times.add("Audax");
        System.out.println(times + "Não ordenado");
        Collections.sort(times);
        System.out.println(times+ "Ordenado ");

    }
}
