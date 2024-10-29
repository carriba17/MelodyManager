package com.linked_list_music_template;

public class MelodyNode {

    private MelodyManager melodyManager;
    private MelodyNode next;
    private int whichMelody;

    public MelodyNode(MelodyManager melodyManager, int whichMelody) {
        this.melodyManager = melodyManager;
        this.whichMelody = whichMelody;
        this.next = null;
    }

    public MelodyNode getNext() {
        return next;
    }

    public void setNext(MelodyNode next) {
        this.next = next;
    }

    public void start() {
        //melodyManager.playMelody(whichMelody);
    }

    public MelodyNode copy() {
        return new MelodyNode(melodyManager, whichMelody);
    }

    public int getMelodyIndex() {
        return whichMelody;
    }

}
