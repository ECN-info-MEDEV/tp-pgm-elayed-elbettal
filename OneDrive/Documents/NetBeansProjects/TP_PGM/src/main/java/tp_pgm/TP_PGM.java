/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tp_pgm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author ebous
 */
public class TP_PGM {

    public static void main(String[] args) throws Exception {

        FileInputStream f = new FileInputStream("C:\\ELBETTAL\\option info si\\MEDEV\\ImagesTestPGM\\baboon.pgm");
        Scanner d = new Scanner(f);
        d.nextLine();  //first line contains P2
        d.nextLine(); // second line contains #
        String line = d.nextLine();  //third line contains height and width
        Scanner s = new Scanner(line);
        int width = s.nextInt();
        int height = s.nextInt();
        line = d.nextLine();  //forth line contains maxVal
        s = new Scanner(line);
        int maxVal = s.nextInt();
        int[][] image = new int[height][width];
        System.out.println(maxVal);
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < height; j++) {
                image[i][j] = d.nextInt();
            }
        }

        d = new Scanner(System.in);

        System.out.print("Enter the file name: ");

        String fileName = d.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            PrintStream ps = new PrintStream(fos);// Write the .pgm header (P2, width height, maxVal)
            ps.println("P2");
            ps.println("#");
            ps.println( height+ " "  + width );
            ps.println(maxVal);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width ; j++) {
                    ps.print(image[i][j]);
                    // Separate numbers by space
                    ps.print(" ");
                }
                // Make each image line a separate text line for
                // easier viewing in a text editor
                ps.println();
            }

            ps.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    int x=1;

}
