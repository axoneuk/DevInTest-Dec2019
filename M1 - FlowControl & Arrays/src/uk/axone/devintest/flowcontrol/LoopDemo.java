package uk.axone.devintest.flowcontrol;

public class LoopDemo {

    //Calculate the sum of the first n numbers
    // sum = 1 + 2 +3 +4 ...+ n

    int sum;
    int count;


    public int useDoWhile(int n){
        sum = 0;
        count = 0;

        //loop starts here
        do{
            sum = sum + count;
            count++;
        } while (count <= n);
        //loop ends

        return sum;
    }

    public int useWhile(int n){
        sum =0;
        count =0;

        //loop starts
        while(count <= n){
            sum += count;//sum = sum + count;
            count ++;
        }

        return sum;
    }

    public int useFor(int n){
        sum =0;

        for(int count = 0;  count <= n; count ++){
            sum = sum + count;
        }

        return sum;
    }

    public static void main(String[] args) {
        LoopDemo lDemo = new LoopDemo();

        int num = lDemo.useDoWhile(5);
        System.out.println(num);

        System.out.println(lDemo.useWhile(5));



    }


}
