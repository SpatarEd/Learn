public class Treugolniki {
    public static void main(String[] args) {
        //Заданы два угла треугольника, проверить: существует он и является ли прямоугольным.
        int a = 190;
        int b = 87;
        int c;
        c = 180 -(a+b);
        int summaUglov = a+b+c;
        boolean suchestvuet= summaUglov==180 && 0<a && 0<b && 0<c;
        if (suchestvuet == true){
            System.out.println("треугольник существует ");
        }
        else System.out.println("треугольник не существует ");
        boolean priamougolnii = a==90||b==90||c==90;

            System.out.println("Прямоугольный? "+ priamougolnii);
    }
}
