package ru.geekbrains.java2.ht3;

import java.lang.reflect.Array;
import java.util.*;

public class ht3 {
    public static void main(String[] args){
//1.1 можно конечно было бы сразу лист создать, но если четко по тз, тогда именно массив строк, строку сделал для удобства просто - сплитом массив короче получился)
       String data = "морж, слон, дятел, рысь, хвост, лось, уши, нос, слон, уши, свинья, антилопа, осёл, кот, собака, тигр, медведь, ястреб, дятел, лев";
       String [] arrayData = data.split(",");

//1.2 только уникальные выводим
       HashSet<String> hs = new HashSet<>(Arrays.asList(arrayData));
       System.out.println(hs);

//1.3
        Map<String, Integer> counter = new HashMap<>();
        for (String w : arrayData)
        {
            if (!counter.containsKey(w))
            {
                counter.put(w, 0);
            }
            counter.put(w, counter.get(w) + 1);
        }
        for (String w : counter.keySet())
        {
            System.out.println(w + " встречается " + counter.get(w) + " раз ");
        }


        //вторую часть не очень понял, а может не успел, т.к. естественно приходится делать в посл. момент...

    }
}
