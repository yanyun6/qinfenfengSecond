package qinfenfengfirst;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Datebase db = new Datebase();
        ArrayList<Animal> abc = new ArrayList<Animal>();
        db.add(new dog("dog","male",7,65));
        db.add(new Animal("st", "male", 5));
        db.add(new Animal("cat", "male", 3));
        System.out.println("如果想进行数据修改，请输入1，否则输入0");
        t=in.nextInt();
        while(t==1){
            System.out.print("如果添加新动物信息，请输入1" + "\n" + "如果删除动物信息，请输入2" + "\n" + "如果想修改动物信息，请输入3" + "\n" + "如果想查找动物信息，请输入4" + "\n");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入姓名，性别，年龄");
                    String s = in.next();
                    String k = in.next();
                    int b = in.nextInt();
                    db.add(new Animal(s, k, b));
                    break;
                case 2:
                    System.out.println("请输入想要删除第几行的动物");
                    int c = in.nextInt();
                    db.remove(c);
                    break;
                case 3:
                    System.out.println("请输入想要修改第几行动物的信息");
                    int d = in.nextInt();
                    System.out.println("请重新输入姓名，性别，年龄");
                    String x = in.next();
                    String z = in.next();
                    int f = in.nextInt();
                    Animal sg = new Animal(x, z, f);
                    db.set(d, sg);
                    break;
                case 4:
                    System.out.println("请输入想要查找第几行动物的信息");
                    int j = in.nextInt();
                    db.get(j);
                    break;
                default:
                    System.out.println("输入异常");
                    System.out.println("if you want to finish the operation,please input finish");
                    break;
            }
            System.out.println("如果结束修改，请输入0;继续修改请输入1");
            int i;
            i=in.nextInt();
            t=i;
        }
        for (Animal aa : db.getAnimals()){//在Main类中重新建立一个集合abc，将 Datebase类里的集合复制到abc集合里
            abc.add(aa.get());
        }
        Collections.sort(abc);//Collections类
        System.out.println("动物年龄正序排序：");
        for (Animal num : abc) {
            System.out.println(num);
        }

    }
}