package Simulator;

import java.io.*;
import java.util.*;

public class Logger {
    public static ArrayList<String> logMessage = new ArrayList<>();
    private static File logTofile = null;
    private static FileWriter logFile = null;
    private static BufferedWriter logWrite = null;

    public static void writeToFile(){
        try {
            logTofile = new File("Simulator.txt");
            logFile = new FileWriter(logTofile, true);
            logWrite = new BufferedWriter(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLog(String s){
        try {
            logWrite.write(s);
            logWrite.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeLogger(){
        if (logWrite != null) {
            try {
                logWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
