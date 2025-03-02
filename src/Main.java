public class Main
{
    public static void main(String[] args)
    {
// первое задание
        byte a=1;
        short b=2;
        int c=3;
        long d=4L;
        float f=3.14f;
        double g=256.36;
        System.out.println("Значение переменной a с типом byte = "+a);
        System.out.println("Значение переменной b с типом short = "+b);
        System.out.println("Значение переменной c с типом int = "+c);
        System.out.println("Значение переменной d с типом long = "+d);
        System.out.println("Значение переменной f с типом float = "+f);
        System.out.println("Значение переменной g с типом double = "+g);
        System.out.println();

// 2-е задание
        byte a2=67;
        short b2=27897, b3=-159, b4=569;
        long d2=987678965549L;
        float f2=2.786f, f3=27.12f;

// 3-е задание
        byte ludPavl=23, annaSerg=27, ekatAndr=30;
        short copyBook=480;
        System.out.println("на каждого ученика по "+copyBook/(ludPavl+annaSerg+ekatAndr)+" тетрадей");
        System.out.println();

// 4-е задание
        int day=(24*60)/2;
        System.out.println("За 20 минут машина произвела "+(20/2)*16+" штук бутылок");
        System.out.println("За сутки машина произвела "+day*16+" штук бутылок");
        System.out.println("За 3-е суток машина произвела "+(3*day)*16+" штук бутылок");
        System.out.println("За месяц машина произвела "+(31*day)*16+" штук бутылок");
        System.out.println();

// 5-е задание
        byte classRoom=120/(2+4);
        byte white=2;
        byte brawn=4;
        System.out.println("В школе, где "+classRoom+" классов, нужно "+classRoom*white+" банок белой краски и "+classRoom*brawn+" банок коричневой краски");
        System.out.println();

// 6-е задание
        short bananas=5*80;
        short milk=105*2;
        short iceCream=100*2;
        short egg=70*4;
        System.out.println("Вес спортзавтрака в граммах - "+(bananas+milk+iceCream+egg));
        float massaKg=0.001f;
        massaKg *=(bananas+milk+iceCream+egg);
        System.out.println("Вес спортзавтрака в килограммах - "+massaKg);
        System.out.println();

// 7-е задание
        float days250Gr=0.25f;
        float days500Gr=0.5f;
        System.out.println(7/days250Gr+" дней уйдет на похудение при потере 250 грамм в день");
        System.out.println(7/days500Gr+" дней уйдет на похудение при потере 500 грамм в день");
        System.out.println();

// 8-е задание
        int masha=67760;
        int denis=83690;
        int kristy=76230;
        System.out.println("Маша теперь получает "+(masha+masha*0.1)+" рублей. Годовой доход вырос на "+(masha*1.2)+" рублей");
        System.out.println("Денис теперь получает "+(denis+denis*0.1)+" рублей. Годовой доход вырос на "+(denis*1.2)+" рублей");
        System.out.println("Кристина теперь получает "+(kristy+kristy*0.1)+" рублей. Годовой доход вырос на "+(kristy*1.2)+" рублей");
        System.out.println();

    }
}