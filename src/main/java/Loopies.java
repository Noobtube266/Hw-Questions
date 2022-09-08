public class Loopies {
    public static void main(String[] args) {
        String[] names = {"Justice", "Alex", "Jerome", "Cornelius"};
        int[] ints = {1, 2, 3, 4, 5};
        int[] numbers = {5, 10, 15, 20, 25};


        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        /*System.out.println(extractAllOddNumbers(numbers));*/
       /* System.out.println(contains(String[] names, String element));*/
    }

    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;

    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[3];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[2];
    }

    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int x = 0;
        for (int i = 0; i < ints.length; i++) {
            x += ints[i];
        }
        return x / ints.length;

    }

    //Question 8
    /*public static String extractAllOddNumbers(int[] numbers) {
    int element = 0;
        int position = 0;
        String oddNumbers = " ";
        while(position < numbers.length){
        element = numbers[position];
        position++;
        if(element%2 !=0){
            oddNumbers = oddNumbers * element +",";
        }

            }
        return oddNumbers;*/
        /*return null;*/
    }
    /*public static void main(String[] args){*//*
    int[] numbers = {5, 10, 15, 20, 25};

        for(
    int i = 0;
    i<numbers.length;i++)

    {
        if (numbers[i] % 2 != 0) {
            System.out.println(numbers[i]);*/
     /*   }
    }*/
//}
    //Question 9
    /*public static String extractAllEvenNumbers(int[] numbers) {
     public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }*/
    //Question 10
    /*public static boolean contains(String[] names, String element) {
        int element = 0;
        int position = 0;
        String oddNumbers = " ";
        while(position < numbers.length){
        element = numbers[position];
        position++;
        if(element%2 !=0){
            oddNumbers =oddNumbers * element +",";
        }

            }
        return oddNumbers;*/
    






