public class minuti {
    public static void main(String[] args) {
        //Дано натуральное число T, которое представляет длительность прошедшего времени в секундах
        //вывести значение в виде HHч ММмин SSс
        int t = 687034;
        int h;
        int m;
        int s;
        h = t/3600;
        m = (t-(h*3600))/60;
        s = t - ((h*3600) + (m*60));
        System.out.println(h+"ч "+ m +"мин " + s+"сек");

    }
}
