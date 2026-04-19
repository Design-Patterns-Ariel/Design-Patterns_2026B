package Week03;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    static void main() {
        int[] arr = new int[]{5, 45, 1, 365, 85, -5, 12, 0};
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if(arr[i]<arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("name->" + new Random().nextInt(10, 50), "id->" + new Random().nextInt(10, 50), new Random().nextInt(10, 50));
        }
        System.out.println(students[0].compareTo(students[1]));
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        Arrays.sort(students);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Star Wars", 2.7, 2021));
        list.add(new Movie("Star Wars", 2.7, 2020));
        list.add(new Movie("Empire Strikes Back", 8.7, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        printList(list);
        NameCompare nameCompare = new NameCompare();
        RatingCompare ratingCompare = new RatingCompare();
        YearCompare yearCompare = new YearCompare();
        Comparator<Movie> compare = nameCompare.thenComparing(ratingCompare);
        Comparator<Movie> compareWithYear = nameCompare.thenComparing(ratingCompare).thenComparing(yearCompare);
        System.out.println("-------------------------------------");
        Collections.sort(list, compareWithYear);
        printList(list);
    }

    private static void printList(ArrayList<Movie> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
