package test;

import java.util.ArrayList;
public class MyCollection {
public static void main(String[] args) {

      Fruit f1 = (new Fruit("사과", "빨강"));
      Fruit f2 = (new Fruit("메론", "초록"));
      Fruit f3 = (new Fruit("포도", "보라"));
      
      ArrayList<Fruit> list = new ArrayList<Fruit>();

      list.add(f1);
      list.add(f2);
      list.add(f3);
      
      for(int i = 0; i < list.size(); i++) {
      }
      System.out.println(list);
}
}
