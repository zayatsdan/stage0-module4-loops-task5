package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int counterClock=height;
        for (int counterY = 0; counterY <= height-1; counterY++) {
                for( int empty1=height-counterClock; empty1>0;empty1--,empty1--){
                    System.out.print(" ");
                }
                for(int eight=counterClock;eight>0;eight--){
                    System.out.print(8);
                }
            for( int empty1=height-counterClock; empty1>0;empty1--,empty1--){
                System.out.print(" ");
            }
            System.out.println();
            if((counterY+1==height/2)&&(height%2==0)){

            }
            else if(counterY<height/2){
                    counterClock--;
                    counterClock--;
                }else if((counterY>=height/2)) {
                    counterClock++;
                    counterClock++;
                }

        }

    }
}
