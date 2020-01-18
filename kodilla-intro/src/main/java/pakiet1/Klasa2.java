package pakiet1;

import tomasz.Notebook;

public class Klasa2 {
    public void cosTam() {
        Notebook notebook = new Notebook(0,0,0);
        notebook.price = 200;
        System.out.println(notebook.price);
    }

    public static void main(String[] args) {
       Klasa2 k2 = new Klasa2();
       k2.cosTam();
    }
}
