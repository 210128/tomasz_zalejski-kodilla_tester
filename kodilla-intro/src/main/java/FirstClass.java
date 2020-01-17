public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.weight + notebook.price);
        Notebook heavyNotebook = new Notebook(2000, 500, 2015);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        Notebook odlNotebook = new Notebook(1200, 800, 2010);
        System.out.println(odlNotebook.weight);
        System.out.println(odlNotebook.price);
        notebook.checkPrice();
        heavyNotebook.checkPrice();
        odlNotebook.checkPrice();
        notebook.checkWeight();
        heavyNotebook.checkWeight();
        odlNotebook.checkWeight();
    }
}
