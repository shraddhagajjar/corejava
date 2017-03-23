package week12;

public class testZoo {
   
	 public static void addAnimals(){
	     
	   Zoo npu_zoo = new Zoo();

	   npu_zoo.addAnimal("cat");
	   npu_zoo.addAnimal("dog");
	   npu_zoo.addAnimal("worm");
	   npu_zoo.addAnimal("snake");

	   npu_zoo.printAnimals();
	 }
	 public static void removeAnimals(){
	     Zoo npu_zoo = new Zoo();
	     npu_zoo.removeAnimal("dog");
		 }

	 public static void justPrintAnimals(){
	   Zoo npu_zoo = new Zoo();

	   npu_zoo.printAnimals();
	 }

	 public static void main(String[] args) {
	    addAnimals();  
	    
	    removeAnimals();

	   justPrintAnimals();
	 }
	}


