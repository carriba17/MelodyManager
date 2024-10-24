package com.linked_list_music_template;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class LinkedListMelodyManager extends MelodyManager {

    static FileSystem sys = FileSystems.getDefault();
    static String prependPath = "mid" +  sys.getSeparator();
    static String appendType = ".mid" +  sys.getSeparator();



}
