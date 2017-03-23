package week12;

import java.util.*;
import java.io.*;

public class Zoo {
	
  private String databaseFilename = "C:\\Users\\shraddha\\Desktop\\M.S\\1st sem\\Java lab\\assignments\\CS480_FALL2015_15992\\build\\classes\\week12\\zoo.txt";
  private File databaseFile;

  private String[] animals = new String[1000];
  private int animalsCount = 0;

  public Zoo(){
    databaseFile = new File(databaseFilename);

    initialize();
  }

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
      
      if(Arrays.asList(animals).contains(name)){
         
      }
      else{
          int temp= animalsCount;
          animals[temp] = name;
          animalsCount++;
          save();
          }   
}

public void removeAnimal(String name){
   int index=java.util.Arrays.asList(animals).indexOf(name);
     if (index!= -1){
         for(int i = index; i < animals.length -1; i++){
              animals[i] = animals[i + 1];
             }
         
         animalsCount--;
        save();
     }                
     }

public void printAnimals(){
   for(int i=0;i<animalsCount;i++){
          System.out.println(animals[i]);
      }
}
	}
