package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        StringBuilder string = new StringBuilder();
        for(Integer g : firstNumber){
            string.append(g.toString());
        }
        string.reverse();
        String str1 = string.toString();
        Integer num = Integer.parseInt(str1);

        StringBuilder string2 = new StringBuilder();
        for(Integer x : secondNumber){
            string2.append(x.toString());
        }
        string2.reverse();
        String str2 = string2.toString();
        Integer num2 = Integer.parseInt(str2);

        return num + num2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {

        Iterator<T> iterator = list.iterator();
        int n = 0;
        while(iterator.hasNext()){
            iterator.next();
            if (n % 2 == 1)
                iterator.remove();
            n++;
        }
        return list;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */

    public <T> List<T> getBounds(List<T> list) {
        List<T> newList = new List<T>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<T> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T1> T1[] toArray(T1[] a) {
                return null;
            }

            @Override
            public boolean add(T t) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends T> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends T> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public T get(int index) {
                return null;
            }

            @Override
            public T set(int index, T element) {
                return null;
            }

            @Override
            public void add(int index, T element) {

            }

            @Override
            public T remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<T> listIterator() {
                return null;
            }

            @Override
            public ListIterator<T> listIterator(int index) {
                return null;
            }

            @Override
            public List<T> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        if(list.isEmpty()){
            return newList;
        } else if (list.size() == 1){
            newList.add(list.get(0));
            return newList;
        } else {
            newList.add(list.get(0));
            newList.add(list.get(list.size() - 1));
            return newList;
        }
    }
}
