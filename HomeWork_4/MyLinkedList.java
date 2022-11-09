import java.util.Collections;
import java.util.LinkedList;
/*
Пусть дан MyLinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
 */
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("I");
        list.add("G");
        list.add("O");
        list.add("R");
        reverse(list);
    }

    public static void reverse(LinkedList myList){
        Collections.reverse(myList);
        System.out.println(myList);
    }
}