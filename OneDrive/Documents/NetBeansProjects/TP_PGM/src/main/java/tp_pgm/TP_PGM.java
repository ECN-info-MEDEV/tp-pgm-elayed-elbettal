/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tp_pgm;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.Scanner;

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
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                image[i][j] = d.nextInt();
                System.out.println(image[i][j]);
            }
        }

    }

}



