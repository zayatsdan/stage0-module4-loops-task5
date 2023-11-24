package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
         int counterClock=cathetusLength-2;
        for( int counterY=0; counterY<cathetusLength;counterY++){
            if(counterY==0){
                for(int counterX=0;counterX<cathetusLength;counterX++){
                    System.out.print(8);
                }
                System.out.println();
                continue;
            }
            System.out.print(8);
            for(int empty=counterClock-1;empty>0;empty--){
                System.out.print(" ");
            }
            if(counterY+1!=cathetusLength) {
                System.out.print(8);
            }
            for (int empty=cathetusLength-counterClock-1;empty>0;empty--){
                System.out.print(" ");
            }
            counterClock--;
            System.out.println();
        }

    }
}
