package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int counterY=0;counterY<=height;counterY++){
            if(counterY==0||counterY==height){
                for (int counterX=0;counterX<=length-1;counterX++) {
                    System.out.print(8);
                }
                System.out.println();
            }
            if(counterY>0&&counterY<height-1){
                System.out.print(8);
                for (int counter=1;counter<length-1;counter++){
                    System.out.print(" ");
                }
                System.out.println(8);
            }
        }

    }
}
