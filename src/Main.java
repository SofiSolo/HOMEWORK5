public class Main {
    public static void main(String[] args) {
        System.out.println( "Домашнее задание 5");

        //Задание 1

        int age = 16;
        if (age >= 18) {
            System.out.println("Ура! Поздравляем, ты совершеннолетний!");}
        if (age < 18)
        {
            System.out.println(" Подрасти ещё немного!");}
        // задание 2
        short schoolAge  = 50;
        if (schoolAge >=7 && schoolAge<18){
            System.out.println(" Пора идти в школу!");}

        if (schoolAge>=18 && schoolAge<24)
        {
            System.out.println(" Можно поступать в университет!");}

        if(schoolAge >= 24)

        {
            System.out.println(" Вот, теперь точно пора работать!");}
        // задание 3

        int totalSeats= 102;
        int seat=60;
       int standingPlace = totalSeats- seat;
        System.out.println( " Всего стоячих мест " + standingPlace);
        int men = 113;
        if ( men <= seat ) {
            System.out.println(" Есть сидячее место");}
        if ( men >= seat && men <= 102){
            System.out.println( " Остались только стоячие места ");
            if ( men > 102){
                System.out.println( " Мест нет, вагон полностью заполнен!");


            }

        }

        }


        }











