public class Comparator<E> implements Comparable<E>{
    @Override
    public int compareTo(E elem) {
        //преобразовываем сравнимы значения в строки
        //считаем аски код каждого симовла строки и сравниваем в лексико-граф порядке
        int[] ArrayOfNums1 = new int[this.toString().length()];
        int[] ArrayOfNums2 = new int[elem.toString().length()];
        for (int i = 0; i < this.toString().length(); i++) { // для первого элемента
            int codeElem = (int) this.toString().charAt(i);
            ArrayOfNums1[i] = codeElem;
        }

        for (int i = 0; i < elem.toString().length(); i++) { // для второго элемента
            int codeElem = (int) elem.toString().charAt(i);
            ArrayOfNums2[i] = codeElem;
        }

        //сравниваем два массива
        int counter = 0;
        for (int x = 0; x < Main.min(this.toString().length(), elem.toString().length()); x++) {
            if (ArrayOfNums1[x] < ArrayOfNums2[x]) {
                return 1;
            }
            if (ArrayOfNums2[x] < ArrayOfNums1[x]) {
                return -1;
            }
            counter++;
        }
        //если мы прошли по циклу, и мин по длине элемент явл подможеством другого элемента
        if (counter == Main.min(this.toString().length(), elem.toString().length())) {
            if (this.toString().length() == elem.toString().length()) { //если строки полностью равны
                return 0;
            } else if (this.toString().length() < elem.toString().length()) { //если первая строка короче второй
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
