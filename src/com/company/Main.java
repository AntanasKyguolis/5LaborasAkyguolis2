package com.company;

import com.company.Studentas.StudentasImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentasImpl st1 = new StudentasImpl(21341, "Jonaitis Jonas", "1994.12.21", "JAVA", 6.5);
        StudentasImpl st2 = new StudentasImpl(21342, "Petraitis Petras", "1996.01.12", "JS", 2.6);
        StudentasImpl st3 = new StudentasImpl(21343, "Bronaitis Bronius", "1994.12.17", "PHP", 3.8);
        StudentasImpl st4 = new StudentasImpl(21344, "Antanaitis Antanas", "1992.10.19", "JS", 5.5);
        StudentasImpl st5 = new StudentasImpl(21345, "Ceslovaitis Ceslovas", "1996.01.20", "JAVA", 9.8);
        StudentasImpl st6 = new StudentasImpl(21346, "Virgaitis Virgis", "1982.07.22", "PHP", 8.9);
        StudentasImpl st7 = new StudentasImpl(21347, "Stasiulaitis Stasys", "1997.02.26", "PHP", 2.3);
        StudentasImpl st8 = new StudentasImpl(21348, "Onaite Ona", "1987.05.06", "JAVA", 3.9);
        StudentasImpl st9 = new StudentasImpl(21349, "Eglaite Egle", "1981.09.12", "JAVA", 6.2);
        StudentasImpl st10 = new StudentasImpl(21350, "Pusaite Kristina", "1989.11.17", "JS", 7.8);

        List<StudentasImpl> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.add(st7);
        list.add(st8);
        list.add(st9);
        list.add(st10);

        System.out.println(" Atspausdinami visi fakulteto studentai\n");
        spausdinti(list);

        System.out.println("\n Atspausdinamas fakulteto studentų skaičius pagal grupę\n");
        gautiFakultetoStudentus("JAVA", list);

        System.out.println("\n Surikiuojami moksleiviai pagal pažangumą\n");
        Collections.sort(list);
        spausdinti(list);

        System.out.println("\n Pašalinami studentai iš sąrašo turintys neigiamus vidurkius, atspausdinamas sarašas po pakeitimo\n");
        pasalintiNeigiamus(list);
        spausdinti(list);

    }

    /**
     * funckija atspausdintanti visą sąrašą
     * @param list studentų sarašas
     */
    public static void spausdinti(List<StudentasImpl> list) {
        for (StudentasImpl stud : list) {
            System.out.println(stud.toString());
        }
    }

    /**
     * funkcija surandanti studentų skaičių pagal nurodytą grupę
     * @param grupe
     * @param list studentų sąrašas
     */
    public static void gautiFakultetoStudentus(String grupe, List<StudentasImpl> list) {
        Iterator<StudentasImpl> it = list.iterator();

        int sk = 0;
        for (int i = 0; i < list.size(); i++) {
            if (grupe.equals(it.next().getGrupe())) {
                sk++;
            }
        }
        System.out.println("Studentu skaicius grupeje '"+grupe+"' yra : " + sk);
    }

    /**
     * funkcija pašalinanti moksleivius turinčius neigiamą vidurkį
     * @param list studentų sąrašas
     */
    public static void pasalintiNeigiamus(List<StudentasImpl> list) {
        Iterator<StudentasImpl> it = list.iterator();

        while(it.hasNext()) {
            if (it.next().getVidurkis() < 4) {
                it.remove();
            }
        }
    }
}

