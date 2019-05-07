package com.sapient.it.lib;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class DataDependent {
	
	int count=0;
	
	 public String[] readFromCSV() throws IOException{
         String[] str = null;
         // This will load csv file 
          CSVReader reader = new CSVReader(new FileReader("./Resources/Feature.csv"));
         
          // this will load content into list
           List<String[]> li=reader.readAll();
           System.out.println("Total rows which we have is "+li.size());
                     
          // create Iterator reference
           Iterator<String[]>i1= li.iterator();
             
          // Iterate all values 
          while(i1.hasNext()){
              
                str=i1.next();
            
          for(int i=0;i<str.length;i++)
         {
            System.out.println(" "+str[i]);
         }
             
         }
         return str;
  }
	 
	/* @DataProvider(name = "test1")
     public Object[] provider( ) throws InterruptedException, IOException
     {

         Object[] returnObject ;

         String[] checkpoint = readFromCSV();

         count = count + 1;

         returnObject = new Object[]{checkpoint };
         return returnObject;
     }*/
	 
	 public void writeIntoCSV(String[] data) throws IOException{
         String csv = "./Resources/Feature.csv";
         CSVWriter writer = new CSVWriter(new FileWriter(csv));

         writer.writeNext(data);

         writer.close();     
   }

}
