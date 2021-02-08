public class ArraySum {
    public int calculation(String[][] values) {
        checkArraySize(values);
        for (int i = 0; i < values.length; i++) {
            checkArraySize(values[i]);
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try{
                    sum += Integer.parseInt(values[i][j]);
                } catch(NumberFormatException e){
                    throw new MyArraySizeException(
                            String.format("Array[%s][%s] contains no parsable value: %s",i, j, values[i][j]),
                            e
                    );
                }
            }
        }
        return sum;
    }
    private void checkArraySize(String[][] values){
        if (values.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4");
        }
    }

    private void checkArraySize(String[] values){
        if (values.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4");
        }
    }
}
