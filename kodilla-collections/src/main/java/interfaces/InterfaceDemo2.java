package interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDemo2 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList();
        Inner inner = new Inner3();
    }

    abstract static class Inner {
        public int ss;

        public void metoda() {

        }
    }

    static class Inner3 extends Inner {

    }
    public static interface Inner4 {
        int b = 4;

        public void getNumber(); // metoda ma istnieć ale nie może mieć "ciała"
    }
}
