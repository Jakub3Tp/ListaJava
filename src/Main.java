import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Podaj wartości do wpisania na listę. " +
                "Wpisanie -1 powoduje koniec wczytywania");

        Scanner scanner = new Scanner(System.in);
        int value;
        while(true) {
            value = scanner.nextInt();
            list.addElement(value);
        }
        while(value!=-1);
        System.out.println("--------------");
        list.display();

        list.addElement(1);
        System.out.println("--------------");
        list.display();

        list.addElement(10);
        System.out.println("--------------");
        list.display();

        list.removeElement();
        System.out.println("--------------");
        list.display();
    }
}