package com.github.seet61.codeRun.select;

public class SelectSort {
    /**
     * Суть алгоритма заключается в последовательном переборе всех чисел и выборе наименьшего элемента,
     * который мы возьмём и поменяем местами с крайним элементом слева (0 элементом).
     *
     * Данный алгоритм превосходит пузырьковую сортировку,
     * ведь тут количество необходимых перестановок сокращается с O(N²) до O(N):
     * мы не гоняем один элемент через весь список, но тем не менее, количество сравнений остается O(N²).
     */

    public static void sort(int[] array) {
        // цикл от начала в конец
        for (int i = 0; i < array.length; i++) {
            // запоминаем минимум
            int min = i;

            // цикл с позиции которую еще не отсортировали в конец
            for (int j = i+1; j < array.length; j++) {
                // если текущий элемент меньше чем значение на позиции min то обновляем значение min
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // вставка отссортиованного числа, в положеную ему ячейку
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
