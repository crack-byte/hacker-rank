package com.crackbyte.practice.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.crackbyte.utils.Constants.PATTERN;

public class PrintInReverse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        List<Integer> a = new ArrayList<>();
        SinglyLinkedListNode node = head;
        while (node != null) {
            a.add(0,node.data);
            node = node.next;
        }
        a.forEach(System.out::println);
    }

    // Complete the reversePrint function below.

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip(PATTERN);
        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            scanner.skip(PATTERN);
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip(PATTERN);
                llist.insertNode(llistItem);
            }
            reversePrint(llist.head);
        }
        scanner.close();
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }
}
