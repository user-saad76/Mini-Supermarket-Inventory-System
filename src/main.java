

import java.util.Scanner;

public class main {

     static void SearchProduct(String search,String[] products,int[] price,int[] quantity){
         boolean isSearch = false;
           for(int x = 0;x<products.length;x++){
               if(search.equalsIgnoreCase(products[x])){
                   System.out.println(products[x] + "  " + price[x] + "  " + quantity[x] + "  ");
                   isSearch = true;
                   break;
               }
           }
           if(!isSearch){
               System.out.println("Invaild choice");
           }
     }





    public static void main(String[] args) {
        System.out.println("******************** Mini-Supermarket/Inventory System *********************");
        Scanner input = new Scanner(System.in);

        String[] products = new String[5];
        String[] FirstData = new String[3];
        int[] price = new int[5];
        int[] quantity = new int[5];
        FirstData[0] = " Product Name : ";
        FirstData[1] = " Price (Rs.) : ";
        FirstData[2] = " Available quantity :  ";
        products[0] = " 1. Rice ";
        products[1] = " 2. Milk ";
        products[2] = " 3. Bread  ";
        products[3] = " 4. Eggs  ";
        products[4] = " 5. Juice  ";
        price[0] = 250;
        price[1] = 150;
        price[2] = 180;
        price[3] = 100;
        price[4] = 120;
        quantity[0] = 5;
        quantity[1] = 8;
        quantity[2] = 4;
        quantity[3] = 9;
        quantity[4] = 5;

        for(int i = 0;i<3;i++){
             System.out.print(FirstData[i] + "  ");
        }
        System.out.println();
        for(int j = 0;j<5;j++){
            System.out.println(products[j] + "          " + price[j] + "                  " + quantity[j] + "                  ");
        }
        System.out.println();
        System.out.println("*********************************");
        System.out.println("1. Product search ");
        System.out.println("2. Product purchase ");
        System.out.println("3. Quantity reduce ");
        System.out.println("4. Total bill calculate ");
        System.out.println("5. Stock check ");
        System.out.println("6. Out-of-stock products");
        System.out.println("7. Out-of-stock products");
        System.out.println("8. Most expensive product ");
        System.out.println("9. Cheapest product ");
        System.out.println("10. Total sales calculate ");
        System.out.println("11. Customer bill display ");
        System.out.println("12. Exit ");
        System.out.println("*********************************");
        System.out.println();


        int choice = 0;
        while(choice!=10){
            System.out.print("Enter choice : ");
             choice = input.nextInt();
             if(choice == 1){
                 input.nextLine();
                 System.out.print("Enter search : ");
                 String search = input.nextLine();
                 SearchProduct(search,products, price, quantity);
             }
             else if(choice == 2){

             }


        }








    }
}
