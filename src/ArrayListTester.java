import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(0);

        List<Integer> myList2 = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            myList2.add(i*i);

            System.out.println("Rozmiar myList: " + myList.size());
            System.out.println("Rozmiar myList2: " + myList2.size());



/*

        System.out.println("Rozmiar naszej listy: " + myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.remove(0)); //pokazuje co usuwa, aby nie pokazywało to trzeba dać rmyList.remove(0) czyli pozycję na liście 0
        System.out.println(myList.get(0));
*/

   /*     myList.clear();
        System.out.println("Rozmiar naszej listy po wyzerowaniu: " + myList.size());
*/

/*

        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(new Object());
        arrayList.add("siedem");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        System.out.println((int)arrayList.get(0) + (String)arrayList.add(2)); to nie działa

*/
/*
        List<Integer> myList = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(0);

        for (int i = 0; i <myList.size(); i++) {
            System.out.println("Liczba: " + myList.get(i));

            System.out.println();
        }
        */

/*

        for (Integer i : myList) {
            System.out.println("Liczba: " + i);
*/
/*


        }

        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()) {  //nie zwraca wartości tytlko infomuje czy jest jakaś wartość
            if ( iterator.next() == 18) {
                iterator.remove();
            }
            System.out.println("Liczba: " + iterator.next());
        }

        for (Integer i : myList) {
        System.out.println("Liczba: " + i);


*/

//        ListIterator<Integer> listIterator = myList


        Object[] arr1 = myList.toArray();

    /*
        Integer[] arr2 = new Integer[myList.size()];
        arr2 = myList.toArray(arr2);

 */
      /*

        Integer[] arr2 = myList.toArray[myList.size()];


        System.out.println(arr2[1]);



        for(Integer i : arr2) {
            System.out.println(i);

*/



        }

    }



}
