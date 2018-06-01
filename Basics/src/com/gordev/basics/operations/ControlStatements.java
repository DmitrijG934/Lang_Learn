package com.gordev.basics.operations;

public class ControlStatements {

    private static int getInput() throws java.io.IOException {
        int result = 0;
        System.out.println("Enter value: ");
        try {
                java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
                result = Integer.parseInt(in.readLine());

        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws java.io.IOException {
        outer :
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                if(j > i) continue outer;
                System.out.print(i * j);
            }
            System.out.println();
        }
    }
}
