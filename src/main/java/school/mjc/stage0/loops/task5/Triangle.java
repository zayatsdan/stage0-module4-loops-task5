package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int counterClock=0;
        for( int counterY=0; counterY<cathetusLength;counterY++){
            if(counterY==cathetusLength-1){
                for(int counterX=0;counterX<cathetusLength;counterX++){
                    System.out.print(8);
                }
                System.out.println();
                continue;
            }
            System.out.print(8);
            for(int empty=0;empty<counterClock-1;empty++){
                System.out.print(" ");
            }
            if(counterY+1!=cathetusLength&&counterY!=0) {
                System.out.print(8);
            }
            for (int empty=cathetusLength-counterClock-2;empty>=0;empty--){
                System.out.print(" ");
            }
            counterClock++;
            System.out.println();
        }

        
        
    }
}
