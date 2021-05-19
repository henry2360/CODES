package chapterFive;


public class PIValue {
    public static void main (String args[]){
        double pi = 4;
        double fraction = 3.0;
        double number;
        for ( int i = 1 ; i <= 200000 ; i++ ){

            number= 4.0/fraction;

            if ( i % 2 == 0 )
                pi += number;
            else
                pi -= number;

            System.out.println("The pi Term and value"+i +" "+ pi);

            if (pi<=3.1415)
                System.out.println("the value of pi"+pi);
            fraction+= 2.0;

        }

        System.exit(0);
    }
}