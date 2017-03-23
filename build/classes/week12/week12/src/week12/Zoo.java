/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
import java.io.*;
import java.util.*;
/**
 *
 * @author 15992gs
 */
public class Zoo {
    
    private String databaseFilename = "zoo.txt";
    private File databaseFile;
    private String[] animals = new String[1000];
    private int animalsCount=0;

    public Zoo() {
        databaseFile = new File(databaseFilename);
        initialize();
    }
    
  // reads animals from database
  private void initialize(){
    if (databaseFile.exists()){
      try {
        Scanner in = new Scanner(databaseFile);

        animalsCount = in.nextInt();
        for (int i=0; i<animalsCount; i++)
          animals[i] = in.next();

        in.close();

        System.out.println(animalsCount + " animals read from the database.");
      } catch (FileNotFoundException e){
        System.out.println("Error: Can't read. File not found: " + e);
      }
    } else {
      System.out.println("File not found. animalsCount is 0.");
    }
  }

  public void save(){
    try {
      PrintWriter out = new PrintWriter(databaseFile);

      out.println(animalsCount);
      for (int i=0;i<animalsCount;++i)
        out.println(animals[i]);

      out.close();

      System.out.println(animalsCount + " animals saved to the database.");
    } catch (FileNotFoundException e){
      System.out.println("Error: Can't save. File not found: " + e);
    }
  }

  public void addAnimal(String name){
    // implement here...
    // don't add same animal twice

    save(); // after changing lets save
  }

  public void removeAnimal(String name){
    // implement here...

    save(); // after changing lets save
  }

  public void printAnimals(){
    // implement here...
  }
}
