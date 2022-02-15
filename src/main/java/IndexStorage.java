/*Создайте класс `IndexStorage` с тремя методами -
`size()`,
`get(int index)`
и `reverse`. Пусть размер заполняется конструктором,
а `get` возвращает то же, что и в прошлом задании (т.е. индекс или -индекс в зависимости от чётности).
Напишите метод `reverse()`, который возвращает массив,
заполненный элементами в обратном порядке. Сделайте этот класс без хранения массивов в полях.

Создайте ему наследника `ArrayIndexStorage`, который бы принимал в конструкторе один параметр
- массив интов, в котором хранил бы все данные.
`get(int index)` должен возвращать значение ячейки массива под номером этого индекса.
Обеспечьте корректную работоспособность всех методов, причём сделайте оба класса так,
чтобы для этого не пришлось переопределять `reverse` в `ArrayIndexStorage`*/

public class IndexStorage {

    private int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return (index % 2 == 0) ? index : -index;
    }

    public int[] reverse() {
        int[] arrx = new int[size];

        for (int i = 0; i < size; i++) {
            arrx[i] = get(size - i - 1);
        }

        return arrx;
    }
}
