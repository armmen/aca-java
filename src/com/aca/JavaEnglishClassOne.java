
package com.aca;


public class JavaEnglishClassOne extends  Object {
    static int count;

    Object obj;
    JavaEnglishClassOne() {
        JavaEnglishClassOne.count++;

    }
    JavaEnglishClassOne(double d) {
        count++;

    }
    private int a;
    int b;


    public static class SuperClass {
        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        int number;
        SuperClass(int number) {
            this.number = number;
        }
        void doThing() {
            System.out.println(number);
        }

    }


    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass(1);
        SuperClass obj2 = new SuperClass(2);
        swap(obj1, obj2);
        obj1.doThing();
        obj2.doThing();
    }

    private static void swap(SuperClass obj1, SuperClass obj2) {
        int temp = obj2.getNumber();
        obj2.setNumber(obj1.getNumber());
        obj1.setNumber(temp);
    }

    private static JavaEnglishClassOne getJavaEnglishClassOne() {
        JavaEnglishClassOne obj = new JavaEnglishClassOne();
        obj = new JavaEnglishClassOne();
        obj = new JavaEnglishClassOne();
        obj = new JavaEnglishClassOne();
        obj = new JavaEnglishClassOne();
        return obj;
    }
}