

//        ������� 2.2
//        �������� ���������, ������� ����� �������� ��� ���� ������������� ����� �����,
//        ������������ ������� ����� ����� �������� value.
//        ��������, ���� ������ ����� 6, ��������� ������ ������ ��������� ���������:
//        1*6
//        2*3
//        3*2
//        6*1
//        ������������ �� ����������:
//        ��� ��������� ��������� ����������� ��� ����� for � ����, ��������� � ������.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("������� ������������� ����� �����:");
        int value = new Scanner(System.in).nextInt();

        for (int a = 1; a <= value; a++) {

            for (int b = 1; b <= value; b++) {

                if (a * b == value) {
                    int result = value / a;
                    System.out.println("���� ����� �����: " + a + "*" + result);
                }
            }
        }
    }
}