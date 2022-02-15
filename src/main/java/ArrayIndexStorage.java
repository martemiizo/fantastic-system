public class ArrayIndexStorage extends IndexStorage {

    private int[] arrx;

    public ArrayIndexStorage(int[] arrx) {
        super(arrx.length);
        this.arrx = arrx;
    }

    public int get(int index) {
        return arrx[index];
    }

}
