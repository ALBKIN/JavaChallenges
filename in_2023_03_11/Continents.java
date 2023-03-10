// LEARN JAVA / Continents and Cities

/*
Ten zajebiaszczy kawałek kodu wyświetli nam nazwę kontynentu i jego największego miasta w oparciu o wartość zmiennej!
Smerfastycznie! I to wszystko na switchu!!1!111
*/

package in_2023_03_11;

public class Continents {

    public static void main(String[] args) {
        int continent = 4;
        switch (continent) {
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined continent!");
                break;
        }
    }
}