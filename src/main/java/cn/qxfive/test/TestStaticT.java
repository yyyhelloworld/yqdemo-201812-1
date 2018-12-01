package cn.qxfive.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStaticT {
    public static <T> T get(T t){
        System.out.println();
        return t;
    }
    public static void test(List<? extends Number> objects){
        List<? extends Object> list=new ArrayList<String>();
    }

    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        test(new ArrayList<Float>());
    }
}
