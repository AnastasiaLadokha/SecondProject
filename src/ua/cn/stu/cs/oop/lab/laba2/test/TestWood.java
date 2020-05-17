package ua.cn.stu.cs.oop.lab.laba2.test;

import ua.cn.stu.cs.oop.lab.laba2.model.Wood;
import ua.cn.stu.cs.oop.lab.laba2.store.WoodDirectory;

public class TestWood {
    public static void main(String[] args) {
        WoodDirectory wd = new WoodDirectory();
        System.out.println(wd.get(3) + "\n");
        Wood w = new Wood(4, "Дуб", 1f);
        if (wd.add(w))
            System.out.println(wd);
        if ((!wd.add(w)))
            System.out.println(w + "вже існує!\n");
    }
}
