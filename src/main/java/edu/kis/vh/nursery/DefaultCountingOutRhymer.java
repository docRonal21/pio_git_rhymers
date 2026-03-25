package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    /**
     * Maksymalny rozmiar stosu.
     */
    private static final int MAX_SIZE = 12;
    /**
     * Stała reprezentująca pusty stan stosu.
     */
    private static final int EMPTY = -1;
    /**
     * Tablica przechowująca liczby na stosie.
     */
    private final int[] numbers = new int[MAX_SIZE];
    /**
     * Indeks ostatniego elementu na stosie.
     */
    private int index = EMPTY;
    /**
     * Zwraca liczbę elementów na stosie.
     * @return liczba elementów na stosie
     */
    public int getTotal() {
        return index;
    }
    /**
     * Dodaje liczbę do stosu, jeśli nie jest pełny.
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }
    /**
     * Sprawdza, czy stos jest pusty.
     * @return true jeśli pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return index == EMPTY;
    }
    /**
     * Sprawdza, czy stos jest pełny.
     * @return true jeśli pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return index == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[index];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[index--];
    }
}