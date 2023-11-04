package helperMethods;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class LoadSave {

    public static BufferedImage getSpriteAtlas() {

        BufferedImage img = null;
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("spriteatlas.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return img;
    }

    // Create a new lvl with default values
    public static void CreateLevel(String name, int[] idArr) {
        File newLevel = new File("res/" + name + ".txt");

        if (newLevel.exists()) {
            System.out.println("File: " + name + " already exists");
            return;
        } else {
            try {
                newLevel.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            WriteToFile(newLevel, idArr);
        }
    }

    private static void WriteToFile(File f, int[] idArr) {
        try {
            PrintWriter pw = new PrintWriter(f);
            for (Integer i : idArr) {
                pw.println(i);
            }
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save 2d int array to file
    public static void SaveLevel(String name, int[][] idArr) {
        File levelFile = new File("res/" + name + ".txt");

        if (levelFile.exists()) {
            WriteToFile(levelFile, Utilz.TowDto1DintArry(idArr));
        } else {
            System.out.println("File: " + name + " does not exists");
            return;
        }
    }

    private static ArrayList<Integer> ReadFromFile(File file) {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                list.add(Integer.parseInt(sc.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Load int array from file

    public static int[][] GetLevelData(String name) {
        File lvlFile = new File("res/" + name + ".txt");

        if (lvlFile.exists()) {
            ArrayList<Integer> list = ReadFromFile(lvlFile);
            return Utilz.ArrayListTo2Dint(list, 20, 20);

        } else {
            System.out.println("File: " + name + " does not exist");
            return null;
        }

    }

}
