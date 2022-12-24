package Задачи;
import java.util.Scanner;
import java.util.ArrayDeque;

public class test {
    public static void main(String[] args) 
    {
       
        int [][] Map = new int [10][10];
        Map [0][0] = 12; 
        Map [0][1] = 0; 
        Map [0][2] = 32; 
        Map [0][3] = 15; 
        Map [0][4] = 41; 

        ArrayDeque <Integer> CoordQueue = new ArrayDeque<Integer>(); 
        CoordQueue.addLast(Map[0][0]);
        CoordQueue.addLast(0);
        CoordQueue.addLast(-5);
        CoordQueue.addLast(Map[0][3]);
        CoordQueue.addLast(Map[0][2]);
        CoordQueue.addLast(21);
        System.out.print(CoordQueue);
        int x = CoordQueue.pollFirst();
        int y = CoordQueue.pollFirst();
        System.out.print("\n");
        System.out.print(CoordQueue);
        System.out.print("\n");
        System.out.printf("x - %d\ny - %d\n",x , y);
    }




}

/* 

E getFirst(): возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException

E getLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false

boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

E peekFirst(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

E peekLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null

E pollFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null

E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null

E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

void push(E element): добавляет элемент в самое начало очереди

E removeFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

E removeLast(): возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.

boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.*/