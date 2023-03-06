import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Bài 1-2

        System.out.printf("Menu\n" +
                "1 .lọc theo số chẵn\n" +
                "2. Lọc theo số lẻ\n" +
                "3. Kiểm tra số nguyên tố\n"+
                "4. Kiểm tra số hoàn hảo \n"+
                "5. In số nguyên tố từ 0 đến n \n"+
                "6. In ra các ước của n và tính tổng \n"+
                "7. Thoát \n");
        System.out.println("Vui lòng chọn 1 lựa chọn");
        int option = input.nextInt();
        switch (option) {
            case 1:
                //Nội dung phương thuc lọc số chẵn
                EventFunction();
                break;
            case 2:
                //Nội dung phương thuc lọc số lẻ
                OddFunction();
                break;
            case 3:
                //Nôi dung phương thức số nguyên tố

                System.out.println("Nhập số nguyên n");
                int n= input.nextInt();
                boolean checkStatus=checkPrime(n);
                if (checkStatus){
                    System.out.println("Là số nguyên tố");
                } else{
                    System.out.println(" Ko phải là số nguyên tố");
                }
                break;
            case 4:
                // Kiểm tra số hoàn hảo
                checkPerfectNumber();
                break;
            case 5:
                // In số nguyên tố từ 0->n
                printPrime();
            case 6:
                //In ra các ước của n và tính tổng
                printDivisor();
            case 7:
                //Thoát
                System.out.println("Chương trình đã được thoát");
        }
    }

    public static void EventFunction(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số nguyên n");
        int n= input.nextInt();
        int total=0;
        System.out.println("Các số chẵn là");
        for (int i = 0; i < n; i++) {
            total+=i;
            if (i%2==0){
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n Tổng là: "+ total);
    }
    public static void OddFunction(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số nguyên n");
        int n= input.nextInt();
        int total=0;
        System.out.println("Các số lẻ là");
        for (int i = 0; i < n; i++) {
            total+=i;
            if (i%2!=0){
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n Tổng là: "+ total);
    }
    public static boolean checkPrime(int n){
        boolean flag= true;
        if (n<1){
//            System.out.println("ko phải số nguyên tố");
            flag= false;
        } else{
            for (int i = 2; i < n; i++) {
                if (n%i==0){
//                    System.out.println("Ko phải là số nguyên tố");
                    flag= false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void checkPerfectNumber(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số nguyên n");
        int n= input.nextInt();
        int total=0;
        for (int i = 1; i < (n/2+1); i++) {
            if (n%i==0){
                total+=i;
            }
        }
        if (total==n){
            System.out.println( n+ " là số hoàn hảo");
        }else{
            System.out.println(n+ " ko phải là số hoàn hảo");
        }
    }
    public static void printPrime(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số nguyên n");
        int n= input.nextInt();
        for (int i = 2; i < n; i++) {
            boolean checkStatus= checkPrime(i);
            if (checkStatus){
                System.out.print("\t"+i);
            }
        }
    }
    public static void printDivisor(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số nguyên n");
        int n= input.nextInt();
        int total=0;
        System.out.println("Ước của "+ n + " là");
        for (int i = 1; i <n-1 ; i++) {
            if (n%i==0){
                System.out.print("\t"+ i);
                total+=i;
            }
        }
        System.out.println("\nTổng các ước của "+ n +" là "+ total);
    }
}