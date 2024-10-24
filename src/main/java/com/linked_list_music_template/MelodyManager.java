//Carter arribas
//CRCP III 
//Melody Manager Class



package com.linked_list_music_template;

import java.util.ArrayList;

public class MelodyManager {
    ArrayList<MelodyPlayer> players;
    ArrayList<MidiFileToNotes> midiNotes;

    MelodyManager(){
        players = new ArrayList<>();
        midiNotes = new ArrayList<>();
    }

    //Plays midi file, ie sends to synth
    public void playMelodies(){

        assert(players != null);
            for(int i = 0;i < players.size();i++){
                players.get(i).play();
            }
    }//End Play melodies

    void addMidiFile(String filepath){
        
        int curIndex = players.size();
        players.add( new MelodyPlayer(120, "Bus 1"));
        midiNotes.add(new MidiFileToNotes(filepath));

        int noteCount = midiNotes.get(curIndex).getPitchArray().size();//Gets the number of notes
        assert(noteCount > 0);//Ask about this assert function

        players.get(curIndex).setMelody(midiNotes.get(curIndex).getPitchArray());
        players.get(curIndex).setRhythm(midiNotes.get(curIndex).getRhythmArray());
        players.get(curIndex).setStartTimes(midiNotes.get(curIndex).getStartTimeArray());
        players.get(curIndex).setToEnd();//Make sure it doesnt start when we dont want it to
    }//End Midi Add file

    void start(int index){
        players.get(index).reset();
    }//End Start

}
