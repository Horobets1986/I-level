package ua.horobets.hw11;

import java.util.Objects;

/*
СТворити узагальнений метод, який приймає два масиви та повертая масив,
 який є результатом поєднання двох масивів
 */
public class Array {


    public class ArrayList<T> {
        private Object[] array;
        private int size;
        private int currentIndex;

        ArrayList(int size) {
            this.size = size;
            array = new Object[size];
        }

        //Add element to the end of array {1,2,3} -> {1,2,3,4}
        void add(T element) {

            if (currentIndex < size) {
                array[currentIndex++] = element;
            } else {
                Object[] newArray = new Object[array.length + 1];
                System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[currentIndex++] = element;
                array = newArray;
                size++;
            }
        }

        //Add element to given position of array {1,2,3} -> {1,4,2,3}
        void add(T element, int index) {

            Object[] newArray = array;
            array = new Object[newArray.length + 1];
            for (int i = 0; i < index; i++) {
                array[i] = newArray[i];
            }
            array[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                array[i] = newArray[i];
            }
            currentIndex++;
            array = newArray;
            size++;
        }

        //
        //Returns index of the given element, if element doesnt exist return -1
        int indexOf(T element) {
            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (element == array[i]) {
                    index = i;

                }
            }
            return index;
        }

        boolean isContains(T element) {
            for (int i = 0; i < size; i++) {
                if (element.equals(array[i])) {
                    return true;
                }
            }
            return false;
        }

        T get(int index) {

            return (T) array[index];
        }

        Object remove(int index) {
            Objects.checkIndex(index, size);
            T removedElement = (T) array[index];
            System.arraycopy(array, index ++, array, index, size - index --);
            size--;
            return removedElement;

        }

        void print() {
            for (Object o : array) {
                System.out.println(o);
            }
        }
    }
}