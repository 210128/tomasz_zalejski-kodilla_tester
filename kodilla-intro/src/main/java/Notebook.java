public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void  checkPrice() {
        if (this.price < 600){
            System.out.println("This notebook is very cheap");
        }   else if (this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is lightweight");
        } else if (this.weight < 2000) {
            System.out.println("This notebook is not to heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }

    }
    public void checkYear() {
        if (this.year < 2008 && this.price < 1000) {
            System.out.println("The device is old and cheap");
        } else if (this.year < 2016 && this.price < 2000) {
            System.out.println("The device is not very old and inexpensive");
        } else {
        System.out.println("The device is quite new and expensive");
        }
    }
}
