import java.io.*;
import java.util.Scanner;

public abstract class Matrix {
    public int CountRow() {
        int m = 0;
        try {
            FileReader fs = new FileReader("C:\\Users\\akili\\IdeaProjects\\Matrix\\Test.txt");
            BufferedReader bfs = new BufferedReader(fs);
            while (bfs.readLine() != null) {
                m++;
            }
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }

    public int CountCol() {
        int n = 0;
        FileReader fs = null;
        try {
            fs = new FileReader("C:\\Users\\akili\\IdeaProjects\\Matrix\\Test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bfs = new BufferedReader(fs);
        try {
            Scanner sc = new Scanner(bfs.readLine());
            while (sc.hasNextDouble()){
                n++;
                sc.nextDouble();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
    public abstract void in(int m, int n);
}
