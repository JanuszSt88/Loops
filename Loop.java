import java.io.*;
import java.util.Scanner;

public class Loop {


    public static void main(String[] args) {

        String plik="C:....tekst.txt";
        File f=new File(plik);

        try {
            BufferedReader bSc = new BufferedReader(new FileReader(f));
            bSc.skip(1);

            while (true){
                String str = bSc.readLine();
                if (str==null) break;
                System.out.println(str);
            }
        }
        catch (Exception exc){
            System.out.println("Brak pliku wejściowego");
        }


        try {
            Scanner sc = new Scanner(f);
            sc.skip("\uFeFF");

            while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        }
        catch (Exception exc){
            System.out.println("Brak pliku wejściowego");
        }


     /*
            for(int i=1,j=1;i<5||j<3;i++, j++)
                System.out.println("i= "+i+" j= "+j);
      */
//            int m=10;                                        //  D) version
//            char c='z';
//            for (int i=10;i>0;i--){
//                if(c=='v'){ c--; continue;}
//                System.out.println(c--);
//
//            }
//            System.out.println("out");

            /*
            int m=10;                                        //  C) version
            char c='z';
            while (m-->0){
            if(c=='v'){ c--; continue;}//
            System.out.println(c--);

            }
            System.out.println("out");

            */
                /*
                    char c='a';
                    while(c<='z') {                          //  A) version
                    System.out.println(c);
                    c++;
                   }
                */

                /*
                char c='a';                                  //  B) version
                while(c<='z') System.out.println(c++);
                */

// *********
        // Mamy oto określić do jakiej parzystej potęgi n (n>=0)
        // należy podnieść podaną liczbę całkowitą a (a >1),
        // aby osiągnąć wynik co najmniej równy zadanej wielkości (którą określimy jako wartość całkowitą cel).
/*

      int cel=5;
      int a=2;
      int wynik=1;
      int potega=1;


                    // obliczyć a do kolejnej potęgi
                    // sprawdzić czy jest co najmniej równe "cel"
                    // jeżeli jest  - sprawdzić potęgę
                    // wyświetlić potęgę lub potęgę +1
        /*
                  while (true){       // A) version
                      wynik=wynik*a;
                      if (wynik >=cel) break;
                      potega++;
                      }
        */
/*
for ( int i=1; wynik<cel ;i++){   // B)version
    wynik=wynik*a;
    potega=i;}



            System.out.println("a "+a);
            System.out.println("cel "+cel);
            System.out.println("potęga pierwotna: " +potega);
            System.out.println("wynik potęgowania: "+wynik);
if (potega%2!=0) potega+=1;

            System.out.println(potega);



*/
    }
}
