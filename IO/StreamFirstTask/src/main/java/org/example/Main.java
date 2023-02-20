package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int character;
        int countAppears=0;

        try (FileReader reader = new FileReader("xanadu.txt")){


            Scanner scanner=new Scanner(System.in);

            char symbol = scanner.next().charAt(0);

            scanner.close();

            while( (character=reader.read()) !=-1   ){

                    if(character==symbol){
                        countAppears++;

                    }
            }

            System.out.println("Character "+symbol+" appears "+countAppears +" time(-s)");


        }
        catch (Exception ex){
            System.out.println("Something went wrong, exception "+ex.getMessage());
        }





    }
}