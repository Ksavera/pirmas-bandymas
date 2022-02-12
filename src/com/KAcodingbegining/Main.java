package com.KAcodingbegining;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // byte [-127,128], short [-32k, 32k], int, Long (L), float(F), double, boolean(true/false), char('A', bet gali but ir zenklas pvz '%')

        //- Concat two string “Hello” and “World” to get result “Hello World”
        String str1 = "Hello" +" " + "World";
        System.out.println(str1);
        //lyg moshas kazka buvo rodes, bet tarpo vieta berods googlinau kaip padaryt. makes sence.

        //Uzduotis: From string “     Hello   “ get result “Hello”
        String str2 = "    Hello    ";
        System.out.println(str2.trim());
        //ieskau kaip uzdet kabutes. nes uzduoty buvo parasyta kad outcome turi but "Hello". Nerandu :/

        String str3 = "Independence";
        //Uzduotis: all upper cases “INDEPENDENCE”
        System.out.println(str3.toUpperCase(Locale.ROOT));
        //easy. moshas

        //Uzduotis: all lower cases “independence”
        System.out.println(str3.toLowerCase(Locale.ROOT));
        //easy moshas

        //Uzduotis:get first symbol “I”
        System.out.println(str3.charAt(0));
        //su google. ilgokai uztrukau. bilenkaip dziaugiaus kai gavos.

        //Uzduotis: get string “dep”
        System.out.println(str3.substring(2,5));

        //Uzduotis: get string “DEP” (note that methods can be chained, if not clear try google smth like (chain string methods in java’)
        System.out.println(str3.substring(2,5).toUpperCase(Locale.ROOT));
        /* Be google pagalbos. pamenu ismasciau, kad padejus taska turetu susijungt funkcijos ir jei ismes kazkokias opcijas pabandysiu ir gavos.
        Ai be to tu buvai rases, kad gali but chained.
         */

        //Uzduotis:get last symbol that is e
        System.out.println(str3.charAt(11));
        //cia isskaiciavau. bet tikrai nesamone. nes neskaiciuosi rankiniu budu kiek raidziu yra zodyje. turejo but kitas budas. Tai googlinau ir raau toki.
        System.out.println(str3.charAt(str3.length()-1));

        //Uzduotis: get index where e letter used first	(result should be 3)
        char ch = 'e';
        int posOfE = str3.indexOf(ch);
        System.out.println(posOfE);

        String raide = "e";
        System.out.println(str3.indexOf(raide));
        /* paskutines 3 eilutes isgooglinau. nzn ar gerai.
        tikejaus kad galima parasy vienoj "sout" eilutej, nes visos kitos uzduotys su viena println eilute.
        Aciu uz patarima. gavosi ir su string.
         */

        //uzduotis:check if string begins with “An” (result should be boolean value)
        System.out.println(str3.startsWith("An"));
        //Sita googlinaus. Is pradziu sunkiai. bet po to kazkur uzmaciau sita sprendima ir velgi lyg ir buvau jau macius kazkur.
        //check if string begins with “In”	(result should be boolean value)
        System.out.println(str3.startsWith("In"));
        //	check if string ends with “dance” (result should be boolean value)
        System.out.println(str3.endsWith("dance"));
        //	check what is index of letter “c” (result should be number)
        System.out.println(str3.indexOf("c"));
        //	check if string contains “pend”
        System.out.println(str3.contains("pend"));
        //Check if string “labas” is equal “Labas”. Think if it is clear why, relates a bit with naming rules
        System.out.println("labas"=="Labas");
        //Labas can be a string name. labas can be variable name

        //Uzduotis: Create two variables word1 with value “Hello” and word2 with value “World and print them like this (each bullet point represents one result and treat like separate task:
        //— “Hello World”
        //— “HelloWorld”
        String word1 = "Hello";
        String word2 = "World";

        System.out.print(word1);
        System.out.print(word2);

        System.out.println(word1);
        System.out.println(word2);
        //print() neperkelia kursoriaus i nauja eilute. Spausdina toj pacioj.

        /* task for printf() Create two variables age with value 10 and name with value John.
        Try to print and get following result “My name is John and my age is 10” using printf().
        You will need to understand how to use placeholders for this
         */
        int age = 10;
        String name = "John";
        PrintStream printf = System.out.printf("My name is %s and my age is %d","John",10);
        //to use exact names, values at the end.


    }
}
