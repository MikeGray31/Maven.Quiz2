package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] result = new Integer[array1.length + array2.length];
        for(int i = 0; i < result.length; i++) {
            if(i < array1.length) result[i] = array1[i];
            else result[i] = array2[i - array1.length];
        }
        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i < array.length - index) result[i] = array[i + index];
            else result[i] = array[i - (array.length - index)];
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] array = this.merge(array1, array2);
        return this.countOccurrence2(array, valueToEvaluate);
    }

    public Integer countOccurrence2(Integer[] array, Integer valueToEvaluate) {
        Integer counter = 0;
        for(Integer i : array) if(i == valueToEvaluate) counter++;
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Integer result = 0;
        for(Integer i : array) {
            if (countOccurrence2(array, i) > result) result = i;
        }
        return result;
    }


}
