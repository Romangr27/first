public class MyFirstApp {
    public static void main(String[] args) {
        int beernumber = 99;
        String number =" бутылки (бутылок)";
        while (beernumber > 0) {
            if (beernumber == 1) {
                number = "бутылку";
            }

                System.out.println(beernumber + " " + number + " пива на стене");
                System.out.println(beernumber + " " + number + " пива!");
                System.out.println("Возьми одну, пусти по кругу");
            beernumber = beernumber - 1;
            }
        }
    }
