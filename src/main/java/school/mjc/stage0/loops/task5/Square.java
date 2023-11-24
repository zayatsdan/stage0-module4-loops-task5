package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
             for (int counterY=0;counterY<=sideLength;counterY++){
                if(counterY==0||counterY==sideLength){
                    for (int counterX=0;counterX<=sideLength-1;counterX++) {
                        System.out.print(8);
                    }
                    System.out.println();
                }
                if(counterY>0&&counterY<sideLength-1){
                    System.out.print(8);
                    for (int counter=1;counter<sideLength-1;counter++){
                        System.out.print(" ");
                    }
                    System.out.println(8);
                }
            }

        

    }
}
