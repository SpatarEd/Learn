import java.text.DecimalFormat;

public class LearnMain {
    public static void main(String[] args) {
        //Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой части).
        //Поменять местами дробную и целую части числа и вывести полученное значение на экран.
        double r = 970.376;
        int celaia = (int) (r/1);
        int drobna = (int) Math.round ((r%celaia*1000));
        System.out.print(drobna +"."+ celaia);


    }
}
