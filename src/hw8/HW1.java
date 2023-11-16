package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HW1 {
    public static void main(String[] args) {
        // 建立一個Collection物件
        Collection<Object> myCollection = new ArrayList<>();

        // 加入不同型別的元素
        myCollection.add(new Integer(100));
        myCollection.add(new Double(3.14));
        myCollection.add(new Long(21L));
        myCollection.add(new Short("100"));
        myCollection.add(new Double(5.1));
        myCollection.add("Kitty");
        myCollection.add(new Integer(100));
        myCollection.add(new Object());
        myCollection.add("Snoopy");
        myCollection.add(new BigInteger("1000"));

        // 印出所有元素 (使用Iterator)
        System.out.println("印出所有元素 (使用Iterator):");
        Iterator<Object> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 移除不是java.lang.Number相關的物件
        removeNonNumberObjects(myCollection);

        // 再次印出所有元素 (使用傳統for迴圈)
        System.out.println("\n再次印出所有元素 (使用傳統for迴圈):");
        for (Object element : myCollection) {
            System.out.println(element);
        }

        // 再次印出所有元素 (使用foreach)
        System.out.println("\n再次印出所有元素 (使用foreach):");
        myCollection.forEach(System.out::println);
    }

    // 移除不是java.lang.Number相關的物件
    private static void removeNonNumberObjects(Collection<Object> collection) {
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (!(element instanceof Number)) {
                iterator.remove();
            }
        }
    }
}