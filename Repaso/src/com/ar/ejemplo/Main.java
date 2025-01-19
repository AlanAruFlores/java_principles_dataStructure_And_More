package com.ar.ejemplo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		//Primitive and Non-Primitive data type
		int number = 10;
		System.out.println(number);
		
		Integer number2 = 10;
		float fNumber = number2.floatValue();
		
		System.out.println(fNumber);
		
		
		//Pointers in java: We can't declare point in java because it's not supported
		
		//Default Values in java;
		byte b = 0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		boolean bn = false;
		String sg = null;
		char c = 0 ;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(c);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bn);
		System.out.println(sg);
		
		
		/*
		 * A wrapper class in Java is a class that wraps up a primitive type of data 
		 * and adds methods to you. This allows primitive types to be treated as objects
		 * 
		 * Need: The wrapper class is an object class that encapsulates
		 *  the primitive data types, and we need them for the following reasons:
		
		    Wrapper classes are final and immutable
		    Provides methods like valueOf(), parseInt(), etc.
		    It provides the feature of autoboxing and unboxing
		 * */
		
		
		Integer iw; Double dw; Byte bw; Long lw;
		
		/*
		 * Class Variable / Static variable:
		 * Is a variable that is declared inside of the class but outside of all (constructors, methods, etc)
		 * This allow us to reduce the space of memory to use when we use POO
		 * */
		
		
		
		/*
		 * Instance Variable:
		 * A class variable without a static modifier known as an instance variable is
		 * typically shared by all instances of the class. 
		 * These variables can have distinct values among several objects
		 * */
		
		
		
		/*FileInputStream / FileOutputStream
		 * 
		 * FileInputStream is used to read data from a file, one byte at a time.
		 * To create a FileInputStream object, you must pass the path to the file you want 
		 * to read as a constructor argument.

			FileOutputStream is used to write data to a file, one byte at a time. 
			It can be used to write any type of file, including text files, image files, 
			and audio files. To create a FileOutputStream object, you must pass the path 
			to the file you want to write to as a constructor argument.
		 * 
		 * */
		
		//fInputExample();
		//fOutputExample();
		
		/*
		 * Kind of operators in java:
		 * All types of operators in Java are mentioned below:

			Arithmetic Operators --> + , - , *, /
			Unary Operators -->  !, - Ex: var v = -1, var b = !true
			Assignment Operator --> =
			Relational Operators --> <= , < ,> , >= , == , !=
			Logical Operators --> AND (&&) , OR (||), NOT (!)
			Ternary Operator
		 * */
		
		
		/*
		 * Array: 
		 * fixed length data structure, this is saved in the heap memory. And his elements
		 * is saved in a sequence of address memories.
		 * 
		 * It's have two types: Unidimensianl, Bidimensional
		 *
		 */
			int [] arr = {1,2,3,4}; // unidimentional
			int [][] arr2 = {{1,2,3,4}, //bidimentional
							 {2,3,4,5}};
	
		
		/*Programming oriented object
		 * 
		 * Principles:
		 * 1.Abstraction --> is the mental proccess to think the classes, the properties of them,
		 * 		the methods of them for our system.
		 * 
		 * 2.Encapsulation --> is the proccess to encapsulate the properties of the class 
		 * 		to make sure our security and avoid to access them directly.
		 * 
		 * 
		 * 3.Inherance --> process where we want to inherance the properties and methods to child 
		 * 		classes
		 * 
		 * 
		 * 4.Polymorphism --> process that exists if previously there is a inherance process. 
		 * 		And this is usefult to change the behaviour.
		 * 
		 * 
		 * 
		 * Class --> Abstraction of something to the reality
		 * Object --> Instance of the class that has its own properties and methods
		 * Constructor  --> is a special method to initialize objects. The default constructor
		 * 	has empty parameters
		 
		 
		 	Interface --> An interface in Java is a collection of static final variables
		 	 and abstract methods that define the contract or agreement for a set of linked classes
		 
		 * */
	
		 /*
		  * What is a DBMS(Sistema gestor de base de datos)? 
		  * 
		  * DBMS stands for Database Management System, is a set of applications or programs that enable 
		  * users to create and maintain a database. DBMS provides a tool or an interface for performing 
		  * various operations such as inserting, deleting, updating, etc. into a database. It is software
		  *  that enables the storage of data more compactly and securely as compared to a file-based system
		  * */
	
	}
	
	
	
	public static void fInputExample() {
		
		try (FileInputStream fin = new FileInputStream("saludo.txt")){
			
			int data;
			//Each byte is taken, and then is parse as a char value
			while((data=fin.read()) != -1) {
				System.out.print((char)data);
			}			
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void fOutputExample() {
		String content = "Nuevo contenido del nuevo archivo creado";
		
		try(FileOutputStream fout = new FileOutputStream("archivoNuevo.txt")){
			
			//transform the string to bytes
			byte[] bytes = content.getBytes();
			
			//Each byte is gonna to write into the file txt
			Arrays.asList(bytes).stream().forEach(b->{
				try {
					fout.write(b);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			fout.close();	
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
