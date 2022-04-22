package brute_force;

import java.util.Arrays;
import java.util.Scanner;

class Blackjack {

    public static void main(String[] args) {

        // N: 입력받을 카드의 수, M: 딜러가 지정한 수, arr: 카드에 적힌 숫자들
        Scanner in = new Scanner(System.in);
        System.out.print("first card: ");
        int N = in.nextInt();
        System.out.print("another card: ");
        int M = in.nextInt();

        int[] arr = new int[N];
        System.out.println("pick cards: ");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("arr: " + Arrays.toString(arr));

        // result
        System.out.println("result: "+ search(arr, N, M));

    }

    static int search(int[] arr, int N, int M) {
        // N개 내에서 중복없이 반복,
        // 3개 정수의 합이 M과 최대한 가까워야 함
        // ex.
        // N: 5, M: 21
        // arr: 5,6,7,8,9
        // result: 21

        int result = 0;
        for (int i=0; i<(N-2); i++) {
            for (int j=i+1; j<(N-1); j++) {
                for (int k=j+1; k<N; k++) {
                    int tempResult = arr[i] + arr[j] + arr[k];
                    if (tempResult == M) {
                        return tempResult;
                    }

                    if (result < tempResult && tempResult < M) {
                        result = tempResult;
                    }
                }
            }
        }

        return result;
    }
}