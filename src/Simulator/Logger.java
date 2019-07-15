package Simulator;

import java.io.*;
import java.util.*;

public class Logger {
    public static ArrayList<String> logMessage = new ArrayList<>();
    private static File logTofile = null;
    private static FileWriter logFile = null;
    private static BufferedWriter logWrite = null;

    public static void writeToFile(){
        FileWriter logFile = null;
        try {
            logFile = new FileWriter("Simulator.txt", true);
            BufferedWriter logWrite = new BufferedWriter(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLog(String s){
        logMessage.add(s);
    }
}
