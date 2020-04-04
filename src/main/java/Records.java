import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Records {
        ArrayList<String[]> records = new ArrayList<>();
        File file = new File("src/records.txt");
        public Records(){
            try{
                Scanner sc = new Scanner(file);// читаем из файла в ArrayList
                while (sc.hasNextLine()) {
                    String s = sc.nextLine();
                    records.add(s.split(" "));
                }
                sc.close();

            }catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
        public void writeFile(ArrayList<String[]> records) {//Записываем в файл
            try{
                PrintWriter pw = new PrintWriter(file);
                for(String[] s : records){
                    for(int i=0; i<s.length; i++){
                        pw.printf("%s ", s[i]);
                    }
                    pw.print("\n");
                }
                pw.close();
            }catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
}
