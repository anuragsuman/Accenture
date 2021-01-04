package DataStructures.Stack;

public class TwoStackArray {

    int[] array;
    int headLeftStack;
    int headRightStack;

    public TwoStackArray(int n){
        array = new int[n];
        headLeftStack = -1;
        headRightStack = array.length;
    }

    public void pushLeft(int val){
        if(headRightStack - headLeftStack > 1)
            array[++headLeftStack] = val;
        else
            System.out.println(" Left Stack is full!!");
    }

    public void pushRight(int val){
        if(headRightStack - headLeftStack > 1){
            array[--headRightStack] = val;
        }else{
            System.out.println("Right Stack is full!!");
        }
    }

    public int popLeft(){
        if(headLeftStack > -1){
            return array[headLeftStack--];
        }else
            return 0;
    }

    public int popRight(){
        if(headRightStack < array.length){
            return array[headRightStack++];
        }else
            return 0;
    }

    public boolean isEmptyLeft(){
        return (headLeftStack == -1);
    }

    public boolean isEmptyRight(){
        return (headRightStack == array.length);
    }

    public static void main(String[] args) {
        TwoStackArray stackArray = new TwoStackArray(4);

        stackArray.pushRight(2);
        stackArray.pushLeft(1);
        stackArray.pushRight(4);
        stackArray.pushLeft(5);

        System.out.println(stackArray.popLeft());
        System.out.println(stackArray.popRight());
        System.out.println();
        for(int i : stackArray.array){
            System.out.println(i);
        }



    }


}
