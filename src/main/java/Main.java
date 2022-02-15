import java.util.Arrays;

/*
Возьмите код из второго домашнего задания (про классы с `reverse()`),
 создайте мавен проект с этим кодом, подключите JUnit и напишите 2-3 теста.
Пришлите проект либо в виде архива, либо в виде ссылки на публичный гитхаб-репо.
 */

public class Main {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        System.out.println("Start...IndexStorage");

        IndexStorage indexStorage = new IndexStorage(SIZE);

        System.out.printf("indexStorage.length=[%d]\n", indexStorage.size());
        for (int i = 0; i < indexStorage.size(); i++) {
            System.out.printf("indexStorage[%d]=%d\n", i, indexStorage.get(i));
        }
        System.out.println("reverse()=" + Arrays.toString(indexStorage.reverse()));

        System.out.println("Start...arrayIndexStorage");

        int[] arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = indexStorage.get(i);
        }
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        //либо сразу передать готовый массив
        //ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new int[]{1,2,3,4,5});

        System.out.printf("arrayIndexStorage.length=[%d]\n", arrayIndexStorage.size());
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            System.out.printf("arrayIndexStorage[%d]=%d\n", i, arrayIndexStorage.get(i));
        }
        System.out.println("reverse()=" + Arrays.toString(arrayIndexStorage.reverse()));

    }
    // код повторяется с 12 по 16 и с 28 по 32 строки...не поняла как вынести в функцию ,
    // чтобы было красиво
}