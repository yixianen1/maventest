package com.yixainen;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("mysql驱动初始化成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
