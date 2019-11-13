package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String pathToFile = "D:\\Downloads\\INPUT";
      Scanner scanner = new Scanner(System.in);
      try{
          int n = scanner.nextInt();
      }catch(InputMismatchException e){
          System.out.println("Error!");
      }

        File file = new File(pathToFile);
        try (Scanner sc = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

    }
}
