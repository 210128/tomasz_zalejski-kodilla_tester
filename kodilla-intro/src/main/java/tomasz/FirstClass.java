package tomasz;

public class FirstClass {

    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1001, 2018);
        System.out.println(notebook.weight + notebook.price);

        Notebook heavyNotebook = new Notebook(2000, 500, 2015);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);

        Notebook oldNotebook = new Notebook(1200, 800, 2010);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);

        notebook.checkPrice();
        heavyNotebook.checkPrice();
        oldNotebook.checkPrice();

        notebook.checkWeight();
        heavyNotebook.checkWeight();
        oldNotebook.checkWeight();

        notebook.checkYear();
        heavyNotebook.checkYear();
        oldNotebook.checkYear();

        LeapYear nowyRok = new LeapYear(2020);
        LeapYear millenium = new LeapYear(2000);
        LeapYear future = new LeapYear(2300);

        /*TODO: REVIEW kdrzazga
        *  Pls provide a better message
        *  When user receives 'true true false' on the output he
        *  doesn't know what it refers to*/
        System.out.println(nowyRok.checkLeapYear());
        System.out.println(millenium.checkLeapYear());
        System.out.println(future.checkLeapYear());
    }
}
