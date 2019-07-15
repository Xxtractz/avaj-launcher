package Simulator;

import java.io.*;
import java.util.*;

public class Logger {
    public static ArrayList<String> logMessage = new ArrayList<>();

    public static void printLog(){
        FileWriter logFile = null;
        try {
            logFile = new FileWriter("Simulator.txt", true);
            BufferedWriter logWrite = new BufferedWriter(logFile);
            for (String s: logMessage) {
                logWrite.write(s);
                logWrite.newLine();
                logWrite.flush();
            }
            logWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLog(String s){
        logMessage.add(s);
    }
}
