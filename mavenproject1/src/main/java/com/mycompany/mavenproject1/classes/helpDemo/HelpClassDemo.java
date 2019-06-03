package com.mycompany.mavenproject1.classes.helpDemo;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;
        Help hlpodj = new Help();

        for (;;) {
            do {
                hlpodj.showmenu();

                choice = (char) System.in.read();


                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }while ( !hlpodj.isvalid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hlpodj.helpon(choice);
        }

    }

}