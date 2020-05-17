package ua.cn.stu.cs.oop.lab.laba2.store;

import ua.cn.stu.cs.oop.lab.laba2.model.Timber;

import java.util.Arrays;

public class ProductStore {
    private Timber[] arr = new Timber[3];
    private int count = 0;

    public Timber[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public void add(Timber newTimber) {
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2);
        arr[count++] = newTimber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Перелік брусів:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}
