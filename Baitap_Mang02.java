
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Baitap_Mang02 {

    public static class Menu {

        public static void displayMenu(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------- Menu -------------------------");
        System.out.println("1. Tính trung bình cộng các số lẻ ở vị trí chẵn");
        System.out.println("2. Tìm số lớn nhất trong mảng vừa nhập");
        System.out.println("3. Tìm số lớn thứ hai trong mảng vừa nhập");
        System.out.println("4. Tìm vị trí số nhỏ nhất trong mảng");
        System.out.println("5. Đếm các số chính phương có trong mảng");
        System.out.println("6. Hiện thị các số nguyên tố có trong mảng lên màn hình");
        System.out.println("7. Thay thế các phần tử âm có trong mảng bằng giá trị 0");
        System.out.println("8. Thay thế các phần tử ở vị trí là số nguyên tố thành số 0");
        System.out.println("9. Xóa các phần tử âm có trong mảng");
        System.out.println("10. Đảo ngược mảng");
        System.out.println("11. Thêm phần tử vào vị trí X trong mảng");
        System.out.println("12. Xóa các phần tử X trong mảng");
        System.out.println("13. Sắp xếp mảng đã nhập theo thứ tự tăng dần");
        System.out.println("14. Thoát");
        
        }  
    }

    public static class ChucNang1{
        public static void chucNang1(){
            int[] arr = Array.arr;
            float avg = 0;
            int count = 0;
            //Vd  arr[] = {2,6,8,4,9,7,5,1,3} ;
            //Số lẻ: arr[i] % 2 != 0 
            //Vị trí chẵn: i lẻ

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0 && arr[i] % 2 != 0) {
                    avg += arr[i];
                    count++;

                }               
            }
            System.out.println("\n");
            System.out.println("Trung bình cộng các số lẻ ở vị trí chẵn: " + (avg/count));
        }
    }

    public static class ChucNang2 {

        public static void chucNang2(){
            int[] arr = Array.arr;
            int Max = 0;

            //int arr[] = {2,6,8,4,9,7,5,1,3} ;
            for (int i = 0; i < arr.length; i++) {
                
                if (Max < arr[i]) {
                    Max = arr[i];
                }
            }
            System.out.println("\n");
            System.out.println("Số lớn nhất trong mảng: " + Max);
        }
    }

    //Tìm số lớn thứ hai trong mảng vừa nhập

    public static class ChucNang3{
        public static void chucNang3(){
            int[] arr = Array.arr;
            int Max = 0;
            int ndMax = 0;
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                temp = Max;
                if (Max < arr[i]) {
                    Max = arr[i];
                    ndMax = temp;
                }
            }
           System.out.println("\n");
           System.out.println("Số lớn thứ 2 trong mảng là: " + ndMax);
        }
    }


    //Tìm vị trí số nhỏ nhất trong mảng
    public static class ChucNang4 {
        public static void chucNang4()
        {

            //VD: int[] arr = {4,2,7,5,1,9,10};
            int[] arr = Array.arr;
            int pos = 0;
            int bien = 0;
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                bien = arr[i];
                if (bien < temp) {
                    pos = i+1;
                }
                temp = bien;
            }
            System.out.println("Vị trí số nhỏ nhất trong mảng: " + pos);
        }
        
    }
    

    public class ChucNang5{
        public static void chucNang5(){
            //Đếm các số chính phương có trong mảng
            //SCP: là bình phương của 1 số nguyên

            int[] arr = Array.arr;
            //VD: int[] arr = {4,2,7,5,1,9,10};
            //Số chính phương là 4 = 2x2; 9 = 3x3
            int count = 0;
            
            for (int i = 0; i < arr.length; i++) {
                double check =(Math.sqrt(arr[i]));
                if (check % 3 == 0 || check % 3 == 1 || check % 4 == 0 || check % 4 == 1 || check == 2) {
                    count++;
                    System.out.println(arr[i]);
                }
            }
            System.out.println("\n");
            System.out.println("Có " + count + " số chính phương");



        }
    }


        //Hiện thị các số nguyên tố có trong mảng lên màn hình
        public class ChucNang6 {
            public static void chucNang6()
            {
                
                int[] arr = Array.arr;

                for (int i : arr) {
                    System.out.println(i);
                }
            }
            
        }

        //Thay thế các phần tử âm có trong mảng bằng giá trị 0
        public class ChucNang7 {
            public static void chucNang7()
            {
                //Vd: int[] arr = {4,-9,16,-25,1,-3,5,7};
                int[] arr = Array.arr;

               for (int i = 0; i < arr.length; i++) {
                 
                     if (arr[i] < 0) {
                         arr[i] = 0;                      
                     }
                     System.out.println(arr[i]);
                    }
               }
            }

        //Thay thế các phần tử ở vị trí là số nguyên tố thành số 0
        public class ChucNang8 {
            public static void chucNang8()
            {
                //Vd: int[] arr = {4,9,16,25,1,3,5,7};
                //Số nguyên tố là số chỉ chia hết cho 1 và chính nó
                //=> SNT là 3,5,7
                int[] arr = Array.arr;
                boolean check = true;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] <= 1) {
                        check = false; //stn lớn hơn 1
                    }
                    else if (arr[i] == 2 || arr[i] == 3) 
                    {
                        check = true;
                    }
                    else if (arr[i] % 2 == 0) // check các số chẵn vì số chẵn có nhiều hơn 2 ước
                    {
                        check = false;
                    }
                    else
                    {
                        for (int j = 3; j < Math.sqrt(arr[i]); j += 2) //j = 3 vì đã check hết số chẵn 
                        //bé hơn 3 đến căn bậc 2 của số đó vì nếu phần tử chia hết cho bất cứ số nào trong khoảng này thì ko phải là snt
                        //j += 2 vì nếu chia cho 4 có nghĩa là chia hết cho 2, mà như vậy thì sai điều kiện trên
                        {
                            if (arr[i] % j ==  0) {
                                check = true;
                            }
                        }
                    }
                    if (check) {
                        arr[i] = 0;
                    }
                    System.out.println(arr[i]);
                }
            }
        }

        //Xóa các phần tử âm có trong mảng
        public static class ChucNang9 {
            public static void chucNang9(){
                int[] arr = Array.arr;

                ArrayList arrayList = new ArrayList<>(); //Tạo đối tượng arraylist

                for (int i : arr) 
                {
                    if (i > 0) //đk nếu i > 0 thì thêm vào arraylist
                    {
                        arrayList.add(i);
                    }
                }
                System.out.println(arrayList);
            }           
        }

        //Đảo ngược mảng
        public static class ChucNang10 {
            public static void chucNang10()
            {
                int[] arr = Array.arr;
                //vd: int[] arr = {2,3,5,7,11,13,12,14,6,9};
                for (int i = 0, j = arr.length -1; i < j; i++, j--) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));                
            }     
        }



    public static class Array{

        public static int[] arr;

        public static void NhapMang(){
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Nhập số phần tử trong mảng");
                if (sc.hasNextInt()) {
                    int n1 = sc.nextInt();
                    arr = new int[n1];

                    for (int i = 0; i < n1; i++) {
                        System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1));
                        while (!sc.hasNextInt()) {
                            System.out.println("Nhập ko hợp lệ");
                            System.out.println("Nhập giá trị cho phần tử thứ " + (i + 1));
                            sc.next();
                        }
                        int n2 = sc.nextInt();
                        arr[i] = n2;
                    }
                    System.out.print("arr[]= { ");
                    for (int i = 0; i < arr.length; i++) {                      
                        System.out.print(arr[i] + "; ");
                    }
                    System.out.print(" }");
                    break;
                }
                else
                {
                    System.out.println("Nhập số nguyên");
                    sc.next();
                }
            }


            


            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Array.NhapMang();
        //ChucNang1.chucNang1();
        ChucNang2.chucNang2();
        
        
        

        













    }
}

