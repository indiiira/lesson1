package tasks;
import java.util.Scanner;
import java.util.SortedMap;


public class Task3 {
    public static double tarakanSpeed(double s){
        return s*27.777778;
    }

    public static int countM(String text, String str)
    {

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("INTEGER"+ Integer.MAX_VALUE+" "+ Integer.MIN_VALUE);
        System.out.println("BYTE"+ Byte.MAX_VALUE+" "+ Byte.MIN_VALUE);
        System.out.println("FLOAT"+ Float.MAX_VALUE+" "+ Float.MIN_VALUE);
        System.out.println("LONG"+ Long.MAX_VALUE+" "+ Long.MIN_VALUE);
        System.out.println("CHAR"+ Character.MAX_VALUE+" "+ Character.MIN_VALUE);
        System.out.println("SHORT"+ Short.MAX_VALUE+" "+ Short.MIN_VALUE);
        System.out.println("DOUBLE "+ Double.MAX_VALUE+" "+ Double.MIN_VALUE);
        System.out.println("Задание 2");
        System.out.println("Введите имя");
        Scanner console=new Scanner(System.in);
        String name=console.next();
        System.out.println("Введите город");
        String city=console.next();
        System.out.println("Сколько вам лет");
        int age=console.nextInt();
        System.out.println("Введите PINCOD");
        int code=console.nextInt();
        System.out.println("Имя "+name+"\nГород "+city+"\nВозраст "+age+" \nПинкод "+code);
        System.out.println("Задание 3");
        System.out.println("Введите строку");
        String s=console.next();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println(result);
        System.out.println("Задание 4");

        String text = "AABCCAAADCBBAADBBC";
        String str = "AA";

        int count = countM(text, str);
        System.out.println(count);
        System.out.println("Задание 5");
        System.out.println("Введите скорость таракана км/ч");
        double v=console.nextDouble();

        System.out.println("Скорость в м/с "+tarakanSpeed(v));
        System.out.println("Задание 6");
        System.out.println("Введите возраст отца и сына");
        int father=console.nextInt();
        int son=console.nextInt();
        int raznica=0;
        while (2*son!=father & father>0){
            raznica+=1;
            father-=1;

        }
        System.out.println("Возраст отца, когда он был старше своего сына "+ father);
        System.out.println("Задание 7");
        System.out.println("Введите среднюю цену ");
        int normPrice = console.nextInt();
        System.out.println("Введите скидку");
        double sale = console.nextDouble();
        sale=sale/100;
        System.out.println("Введите стомость отпуска");
        double hoilday= console.nextDouble();

        double economy=sale*normPrice;
        double countViski=hoilday/economy;
        System.out.println("Бутылок виски равно "+ Math.round(countViski));















    }
}
