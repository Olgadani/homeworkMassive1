public class Main {
    public static void main(String[] args) {

                System.out.println("Task 1-1");
                int [] numbers = new int[]{1,2,3};
                double[] fractions = {1.57, 7.654, 9.986};
                int [] list = {1,2,3,4,5,6,7,8,9};
                System.out.println("Task 1-2");
                for (int i = 0; i < numbers.length; i++) {
                    if(i == numbers.length - 1){
                        System.out.println(numbers[i]);
                        break;}
                    System.out.print(numbers[i] + ",");
                }
                System.out.println();
                for (int j = 0; j < fractions.length; j++) {
                    if(j == fractions.length - 1){
                        System.out.println(fractions[j]);
                        break;}
                    System.out.print(fractions[j] + ",");
                }
                System.out.println();
                for (int k = 0; k < list.length; k++) {
                    if(k == list.length - 1){
                        System.out.println(list[k]);
                        break;}
                    System.out.print(list[k] + ",");
                }
                System.out.println("Task 1-3");
                for (int i = numbers.length - 1; i >= 0; i--) {

                    System.out.print(numbers[i] + ",");
                }
                System.out.println();
                for (int j = fractions.length - 1; j >= 0; j--) {

                    System.out.print(fractions[j] + ",");
                }
                System.out.println();
                for (int k = list.length - 1; k >= 0; k--) {

                    System.out.print(list[k] + ",");
                }
                System.out.println("");
                System.out.println("Task 1-4");
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i]%2 != 0) {
                        numbers[i] = numbers[i] + 1;
                    }
                    if(i == numbers.length - 1){
                        System.out.println(numbers[i]);
                        break;}
                    System.out.print(numbers[i] + ",");
                }
            }

    }