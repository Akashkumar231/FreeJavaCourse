import java.io.*;
public class FileDemo
{
  public static void main(String [] args) throws IOException
  {
   /*
      File f = new File("Abc.txt");
      System.out.println(f.exists());
      f.createNewFile();
      System.out.println(f.exists());

    */
//
//      File f  = new File("CreatedNewFolder");
//      System.out.println(f.exists());
//      f.mkdir();
//      System.out.println(f.exists());

//      FileWriter fw = new FileWriter("Abc.txt",true);
//      fw.write('a');
//      fw.write('k');
//      fw.write('a');
//      fw.write('s');
//      fw.write('h');
//      fw.write(" is a good boy");
//      fw.write('c');
//      fw.write(100);
//      fw.write('\n');
//      fw.flush();
//      fw.close();
     /*
      File f = new File("Abc.txt");

      FileReader fr = new FileReader(f);
      char [] char_Array = new char[(int)f.length()];
      fr.read(char_Array);
     /*

      while(i!=-1){
          System.out.print((char)i);
          i=fr.read();
      }
            for(char ch : char_Array){
          System.out.print(ch);
      }

      */

      /*

       FileWriter fw = new FileWriter("Hello.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Akash");
      bw.write('\n');
      bw.write("is a Good Boy");
      bw.newLine();
      bw.write(" How are you");
      char [] ch = new char[]{'K','U','M','A','R'};
      bw.write(ch);
      bw.flush();
      bw.close();

       */
//     FileReader fr = new FileReader("Hello.txt");
//     BufferedReader br = new BufferedReader(fr);
//     br.read();
//     String line = br.readLine();
//     while(line!=null){
//         System.out.println(line);
//         line = br.readLine();
//     }
//     br.close();

      FileWriter fw = new FileWriter("Abc.txt");
      PrintWriter pw = new PrintWriter(fw);
      pw.write(97);
      pw.println(100);
      pw.println(true);
//      pw.println(c);
      pw.println('c');
      pw.println("AkashKUmar Yadav");
      pw.flush();
      pw.close();
  }
}
