/*
 * c2024  Carter Arribas using a template by Dr. Courtney Brown
 * Class: LinkedListMelody
 * Description: Linked List Melody that is going to play a melody given to it
 * 
 */


package com.linked_list_music_template;

public class LinkedListMelody implements Drawable {

   
    private MelodyNode head;
    private MelodyNode curPlayingNode;

     //fill in this class
     public void draw()
     {
         //fill this in to play melody
     }

    public void insertAtStart(MelodyNode node) {
        node.setNext(head);
        head = node;
    }

    public void insertAtEnd(MelodyNode node) {
        if (head == null) {
            head = node;
        } else {
            MelodyNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void print() {
        MelodyNode current = head;
        while (current != null) {
            System.out.print(current.getMelodyIndex() + " ");
            current = current.getNext();
        }
    }

    public void play() {
        // Implementation TBA
    }

    public void loop(boolean loop_) {
        // Implementation TBA
    }

    public void stop() {
        // Implementation TBA
    }

    public void weave(MelodyNode node, int count, int skip) {
        // Implementation TBA
    }

    // Additional methods based on user specification
    public void clear() {
        head = null;
    }

    public void reverse() {
        // Implementation TBA
    }

    public boolean isEmpty() {
        return head == null;
    }
}
