
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class xxx {
	 public static void main(String[] args) throws IOException {
         File file = new File("E:\\Program Data\\qq\\yq_in.txt");
         String[] prov = new String[1000];
         String[] city = new String[1000];
         String[] num = new String[1000];
         Scanner cin = new Scanner(file);
         int flag = 0;

         int len;
         for(len = 0; cin.hasNext();len++) {
             prov[len] = cin.next();
             city[len] = cin.next();
             num[len] = cin.next();
             flag++;
         }

         len = prov.length;

         for(int i = 0; i < flag; i++) {
             System.out.println(prov[i] + "\t" + city[i] + "\t" + num[i]);
         }

         FileOutputStream fp = new FileOutputStream("E:\\Program Data\\qq\\yq_linxin.txt");
         PrintStream fpp = new PrintStream(fp);
         String temp = "0";

         for(int i = 0; i < flag; i++) {
             if (!temp.equals(prov[i])) {
             	if (i != 0)	fpp.println();
                 fpp.println(prov[i] + "\t");
                 temp = prov[i];
             }
             fpp.println(city[i] + "\t" + num[i]);
             
         }
         fp.close();
         cin.close();
     }
}
