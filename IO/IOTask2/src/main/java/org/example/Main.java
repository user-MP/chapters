package org.example;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;




public class Main {


    public static int getPieceOfData(Path file) throws IOException {

        int value=0;

        try (FileChannel channel = (FileChannel) Files.newByteChannel(file)) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

            channel.position(buffer.getLong(0));

            value=buffer.getInt(0);


        } catch (Exception ex) {

            System.out.println(ex.getMessage());


        }
        return value;
    }



    public static void main(String[] args) throws IOException {
        Path file = Paths.get("src/main/java/datafile.htm");

        int num = Main.getPieceOfData(file);
        System.out.println("The value is " + num);
    }
}
