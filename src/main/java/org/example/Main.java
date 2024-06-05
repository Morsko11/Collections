package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // ПЕРВЫЙ СПОСОБ ДОБАВЛЕНИЯ
        list.add("ss");
        // ВТОРОЙ СПОСОБ ДОБАВЛЕНИЯ
        ArrayList<String> arrayList = new ArrayList<>() {
            {
                add("22");
                add("33");
                add("32");
            }
        };
        // ТРЕТИЙ СПОСОБО ДОБАВЛЕНИЯ
        Collections.addAll(list, "22", "223", "42141");
        // ЧЕТРВЕРТЫЙ СПОСОБ ДОБАВЛЕНИЯ нельзя менять размер
        List<String> list1 = List.of("224", "4242", "5125125");
        // Основные методы работы с List
        /*
        add
        get - получение элемента по индексу
        remove - удаление обьекта по индексу или обьетку
        set - присваивание значение
        contains - содержит ли лист какой то обьект
        sort - сортировка
        */
        List<Integer> l = new ArrayList<>() {{
            add(12);
            add(28);
            add(31);
            add(54);
            add(75);
        }};
        int sum = 0;
        for (Integer i : l) {
            if (i % 2 == 0) sum = sum + i;
        }
        //     System.out.println(sum);
        ArrayList<String> ll = new ArrayList<>() {{
            add("22");
            add("33");
            add("44");
        }};
        ArrayList<Integer> i2 = new ArrayList<>();
        for (int i = 0; i < ll.size(); i++) {
            i2.add(Integer.parseInt(ll.get(i)));
        }
        //   System.out.println(i2);

        LinkedList<Integer> i3 = new LinkedList<>();
        i3.add(0);
        i3.add(2);
        i3.add(3);
        i3.add(4);
        i3.add(0);
        i3.add(3);
        int count = 0;
        String sss = "";
        for (int i = 0; i < i3.size(); i++) {
            sss = sss + i3.get(i).toString() + " - ";

        }
        //   System.out.println(sss);

        List<String> lis = new ArrayList<>();
        lis.add("AB");
        lis.add("CD");
        lis.add("EF");
        lis.add("GS");
        lis.add("OP");
        List<Character> listchar = new ArrayList<>();

        for (String s : lis) {
            char[] s1 = s.toCharArray();
            for (int i = 0; i < s1.length; i++) {
                listchar.add(s1[i]);
            }
        }
        //   System.out.println(listchar);

        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < listchar.size(); i++) {
            str.add(listchar.get(i).toString());
        }
        //  System.out.println("Массив стрингов " + str);


        List<String> l3 = new ArrayList<>();
        l3.add("1");
        l3.add("2");
        l3.add("3");
        List<String> l4 = new ArrayList<>();
        l4.add("4");
        l4.add("5");
        l4.add("6");
        List<String> lnew = new ArrayList<>();
        int cou = 0;
        for (int i = 0; i < l3.size() * 2; i++) {
            if (cou < l3.size()) {
                lnew.add(l3.get(i));
                cou++;
            } else {
                lnew.add(l4.get(i - l3.size()));
            }

        }

        //System.out.println(lnew);
        int c = 0;
        List<Integer> listin = new ArrayList<>();
        List<Integer> listin2 = new ArrayList<>();
        Collections.addAll(listin, 1, 2, 3, 4, 5);
        Collections.addAll(listin2, 1, 6);
        for (int i = 0; i < listin.size(); i++) {
            for (int j = 0; j < listin2.size(); j++) {

                if (listin.get(i) == listin2.get(j)) {
                    c++;
                }
            }
        }
        if (c == listin2.size()) {
            //   System.out.println(true);
        } else {
            //   System.out.println(false);
        }

        List<Integer> vec = new Vector<>();
        Collections.addAll(vec, 322, 441, 512, 123, 753);
        for (int i = 0; i < vec.size(); i++) {
            for (int j = 0; j < vec.get(i).toString().length(); j++) {
                if (vec.get(i).toString().charAt(j) == '1') {
                    //  System.out.println(vec.get(i));
                }
            }
        }


        List<Character> charlist = new ArrayList<>();
        Collections.addAll(charlist, 'a', 'b', 'c', 'd', 'e', 'f');
        List<String> strlist = new ArrayList<>();
        for (int i = 0; i < charlist.size() / 2; i++) {
            strlist.add(charlist.get(i).toString() + charlist.get(i + 1).toString());
        }
        //System.out.println(strlist);

        List<String> stri = new ArrayList<>();
        Collections.addAll(stri, "11", "2", "3", "4", "5", "6");
        for (int i = 0; i < stri.size(); i++) {
            //   System.out.println(stri.get(i).charAt(0)+0);
        }

        Stack<String> sta = new Stack<>();

        sta.push("Str");
        sta.push("FGs");
        sta.push("2");
        sta.push("22");


        Stack<Integer> stack = new Stack<>();
        Collections.addAll(stack, 1, 2, 3, 4, 5, 21, 123, 53, -4);
        Metod metod = new Metod();
        // System.out.println(metod.met(stack).toString());

        Kartgame kartgame = new Kartgame();
        Stack<Karta> kart = new Stack<>();
        Collections.addAll(kart, new Karta("6"), new Karta("7"), new Karta("8"), new Karta("9"), new Karta("10"), new Karta("valet"), new Karta("Dama"), new Karta("Korol"));
        Stack<Karta> sbros = new Stack<>();
        kartgame.setKoloda(kart);
        kartgame.setSbros(sbros);
        System.out.println(kartgame.takekart());
        System.out.println(kartgame.takekart());
        System.out.println(kartgame.takekart());
        kartgame.sbros(kartgame.takekart());
        kartgame.sbros(kartgame.takekart());
        kartgame.sbros(kartgame.takekart());
        System.out.println("карты в сбросе ");
        System.out.println(kartgame.getSbros().pop());
        System.out.println(kartgame.getSbros().pop());
        System.out.println(kartgame.getSbros().pop());
//----------------------------------------------------
    }
}
