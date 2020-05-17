package ua.cn.stu.cs.oop.lab.laba2.test;

import ua.cn.stu.cs.oop.lab.laba2.model.Timber;
import ua.cn.stu.cs.oop.lab.laba2.store.ProductStore;
import ua.cn.stu.cs.oop.lab.laba2.store.WoodDirectory;

public class TestApp {
    private WoodDirectory woodDirectory = new WoodDirectory();
    private ProductStore productStore = new ProductStore();

    private void startApp() {

        productStore.add(new Timber(woodDirectory.get(0), 5f, 0.5f, 0.4f));
        productStore.add(new Timber(woodDirectory.get(1), 10f, 0.5f, 0.4f));
        System.out.println(woodDirectory);
        System.out.println(productStore);
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight() {
        float fullWeight = 0;
        for (Timber timber : productStore.getArr()) {
            fullWeight += timber.weight();
        }
        return fullWeight;
    }

    public static void main(String[] args) {
        TestApp app = new TestApp();
        app.startApp();
    }
}
