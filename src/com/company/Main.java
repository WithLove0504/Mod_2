package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            T1();
            T2();
            T3();
            T4();
            T5();
            T6();
            T7();
            T8();
            T9();
            T10();
    }

    public static void T1() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        String repeat = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeat += (s1.charAt(i));
            }
        }
        System.out.println(repeat);
    }

    public static void T2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(max - min);
    }

    public static void T3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double cp = 1.0 * sum / n;
        if (cp % 1 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void T4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + sum + " ");
            sum += arr[j];
        }
    }

    public static void T5() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        int m = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '.') {
                System.out.print(m);
                m = 0;
                i = -1;
            } else {
                m += 1;
            }
        }
        if (m != 0) {
            System.out.print(0);
        }
    }

    public static void T6() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 1; i < x; i++) {
            c = a;
            a += b;
            b = c;
        }
        if (x == 0) {
            System.out.print(0);
        } else {
            System.out.print(a);
        }

    }

    public static void T7() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        boolean m = true;
        if ((s.length() != 5) )
            m = false;
        for (int i = 0; i < 5; i++) {
            if (Character.isDigit(s.charAt(i)) == false)
                m = false;
        }
            System.out.print(m);

    }
    public static void T8() {
        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();
        String l = sc.nextLine();
        String s = sc.nextLine();
        if (l.charAt(0) == s.charAt(s.length() - 1) && l.charAt(l.length() - 1) == s.charAt(0)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
    public static void T9() {
        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Префикс:" + isPrefix(s1,s2));
        System.out.println("Cуффикс:" + isSuffix(s1,s2));
    }
    public static boolean isPrefix(String str1, String str2) {
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean isSuffix(String str1, String str2) {
        int h = 1;
        for (int i = str1.length() - str2.length() + 1; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(h))
                return false;
            h++;
        }
        return true;
    }
    public static void T10() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                n += 3;
            }
            else
                n -= 1;
        }
        System.out.print(n);
    }
}
