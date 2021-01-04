/*
Создать два проекта, в которых продемонстрировать два способа создания линейного однонаправленного списка (с головы и с хвоста)
согласно примеру 2 из второго раздела.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком.
 */

package Lab08_05;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Node.createHead(7);
        Node.createTail(5);
    }
}

class Node {
    protected int value;
    protected Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    protected static void createHead(int size) {
        Node head=new Node(0, null);
        Node tail = head;
        for (int i = 0; i < size-1; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
        System.out.println("Формирование односвязного списка от головы:");
        printNodeLinkedList(head);
    }

    protected static void createTail(int size) {
        Node head1=null;
        for (int i = size-1; i>=0; i--) {
            head1=new Node(i, head1);
        }
        System.out.println("Формирование односвязного списка от хвоста:");
        printNodeLinkedList(head1);
    }

    protected static void printNodeLinkedList(Node head){
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println("\n");
    }
}