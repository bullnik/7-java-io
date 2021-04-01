package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы
        // (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int previous = System.in.read();
        if (previous == -1) {
            return;
        }
        int current = System.in.read();

        while (current != -1) {
            if (!(previous == 13 && current == 10)) {
                System.out.write(previous);
            }

            previous = current;
            current = System.in.read();
        }
        System.out.write(previous);

        System.out.flush();
    }
}
