public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDEX = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int CAPACITY = 12;

    private int[] numbers = new int[CAPACITY];

    public int anInt = EMPTY_RHYMER_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++anInt] = in;
    }

        public boolean callCheck() {
            return anInt == EMPTY_RHYMER_INDEX;
        }
        
            public boolean isFull() {
                return anInt == CAPACITY - 1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_RETURN_VALUE;
                    return numbers[anInt];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_RETURN_VALUE;
                        return numbers[anInt--];
                    }

}
