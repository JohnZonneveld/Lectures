package Questions;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Q20 {
  public static void main(String[] args) {
    try {
      File myObj = new File("src/Data.txt");
      Scanner myReader = new Scanner(myObj);
      System.out.println("\n\n\033[1mQ20\033[0m");
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] lineData = data.split(":");
        System.out.println("\nName: " + lineData[0] + " " + lineData[1]);
        System.out.println("Age: " + lineData[2] + " years");
        System.out.println("State: " + lineData[3] + " State");
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

