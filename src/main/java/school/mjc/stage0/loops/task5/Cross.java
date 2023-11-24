package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int counterX=0;counterX<=sideLength-1;counterX++) {
                for (int counterY = 0; counterY <= sideLength - 1; counterY++) {
                    if(counterX==(sideLength/2)) {
                        System.out.print(8);
                    }
                    else if (counterY == (sideLength / 2)) {
                        System.out.print(8);
                        continue;
                    }else if(counterY != (sideLength / 2)) {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }

    }
}
