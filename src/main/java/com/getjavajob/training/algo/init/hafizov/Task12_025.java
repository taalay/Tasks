package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 18.07.2015.
 */
public class Task12_025 {
    public static void main(String[] args) {
        showArr(fillArrOfA());
        showArr(fillArrOfB());
        showArr(fillArrOfV());
        showArr(fillArrOfG());
        showArr(fillArrOfD());
        showArr(fillArrOfE());
        showArr(fillArrOfJ());
        showArr(fillArrOfZ());
        showArr(fillArrOfI());
        showArr(fillArrOfK());
        showArr(fillArrOfL());
        showArr(fillArrOfM());
        showArr(fillArrOfN());
        showArr(fillArrOfO());
        showArr(fillArrOfP());
        showArr(fillArrOfR());

    }

    public static int[][] fillArrOfA() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfB() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfV() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                arr[i][j] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfG() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                arr[j][i] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfD() {
        boolean switcher = true;
        int[][] arr = new int[10][12];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            if (switcher) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = x++;
                    switcher = false;
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    arr[i][j] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfE() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr[0].length; i++) {
            if (switcher) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = x++;
                    switcher = false;
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    arr[j][i] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfJ() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfZ() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfI() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                arr[i][j] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfK() {
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 9; i >= 0; i--) {
            for (int j = 11; j >= 0; j--) {
                arr[j][i] = x++;
            }
        }
        return arr;
    }

    public static int[][] fillArrOfL() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (switcher) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = x++;
                    switcher = false;
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    arr[i][j] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfM() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            if (switcher) {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    arr[i][j] = x++;
                    switcher = false;
                }
            } else {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfN() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr[0].length - 1; i >= 0; i--) {
            if (switcher) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = x++;
                    switcher = false;
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    arr[j][i] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfO() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = 0; i < arr[0].length; i++) {
            if (switcher) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    arr[j][i] = x++;
                    switcher = false;
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfP() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (switcher) {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    arr[i][j] = x++;
                    switcher = false;
                }
            } else {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static int[][] fillArrOfR() {
        boolean switcher = true;
        int[][] arr = new int[12][10];
        int x = 1;
        for (int i = arr[0].length - 1; i >= 0; i--) {
            if (switcher) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    arr[j][i] = x++;
                    switcher = false;
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    arr[j][i] = x++;
                    switcher = true;
                }
            }
        }
        return arr;
    }

    public static void showArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
