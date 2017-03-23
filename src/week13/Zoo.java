/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;
import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author shraddha
 */
public class Zoo {
    private  String filename = "C:\\Users\\shraddha\\Desktop\\M.S\\1st sem\\Java lab\\assignments\\CS480_FALL2015_15992\\build\\classes\\week13\\zoo.txt";
    private  File dbfile;
    private String[] animalname = new String[1000];
    private int animalcount = 0;
    public Zoo() {
        dbfile = new File(filename);
        initialized();
    }
    private void initialized()
    {
        if(dbfile.exists())
        {
            try
            {
                
                Scanner in = new Scanner(dbfile);
                animalcount = in.nextInt();
                for(int i=0; i<animalcount;i++)
                {
                    animalname[i] = in.next();
                }
                in.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found " +e);
            }
        }
        else
        {
            System.out.println("File not found");
        }
    }
    public void save()
    {
        try
        {
            PrintWriter out = new PrintWriter(dbfile);
            out.println(animalcount);
            for(int i=0;i<animalcount;i++)
            {
               out.println(animalname[i]);
            }
            out.close();
            System.out.println("Animal names are saved in database total nubmer = " +animalcount);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found " +e);
        }
    }
    public void addanimal(String name)
    {
        /*
        Charset charset = Charset.forName("US-ASCII");
        Path file = Paths.get(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.append(name);
         
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        } */
            try
            {
              
            String newData = " Java is super cool!";
            FileWriter fileWritter = new FileWriter(filename, true);
            BufferedWriter bwr = new BufferedWriter(fileWritter);
            
            bwr.write(name);
            bwr.write(" ");
            bwr.close();
            animalcount++;
            animalname[animalcount] = name;
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
               
    }
        
    public void removeAnimal(String name)
    {
        int index = java.util.Arrays.asList(animalname).indexOf(name);
        if(index!= -1)
        {
            for(int i=0;i<animalname.length-1;i++)
            {
                animalname[i] = animalname[i+1];
            }
            animalcount--;
            save();
        }
    }
    public void printAnimal()
    {
        Path file = Paths.get(filename);
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
                System.out.println("Total number of Animals you entered are " +animalcount);
        }
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
    }
}
