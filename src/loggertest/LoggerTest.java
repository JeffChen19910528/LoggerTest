/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loggertest;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 *
 * @author JeffChen
 */
public class LoggerTest {

    /**
     * @param args the command line arguments
     */
    private static Logger logger = Logger.getLogger(LoggerTest.class.getName());
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileHandler fileHandler = new FileHandler("c:/Logs/test.log");
        logger.addHandler(fileHandler);
        logger.info("Test");
    }
    
}
