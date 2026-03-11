package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int anInt = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++anInt] = in;
    }

        public boolean callCheck() {
            return anInt == -1;
        }
        
            public boolean isFull() {
                return anInt == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return numbers[anInt];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return numbers[anInt--];
                    }

}
