

import java.util.Scanner;

public class main {

     static void SearchProduct(String search,String[] products,int[] price,int[] quantity,String[] FirstData){
         boolean isSearch = false;
           for(int x = 0;x<products.length;x++){
               if(search.trim().equalsIgnoreCase(products[x].trim())){
                   System.out.println(FirstData[0]  + "  " + FirstData[1]  + "  " + FirstData[2] + "  ");
                   System.out.println(products[x] + "             " + price[x] + "                            " + quantity[x] + "           ");
                   isSearch = true;
                   break;
               }
           }
           if(!isSearch){
               System.out.println("Invaild choice");
           }
     }


     static void QuantityReduce(String search,String[] product ,int[] quantity, int qty){
         boolean isVaildSearch = false;
         for(int x = 0;x<product.length;x++){
             if(search.trim().equalsIgnoreCase(product[x].trim())){
                 System.out.println( " Product :  " + product[x]);
                 System.out.println(product[x] + " has available total " + quantity[x]);
                 if(qty<=quantity[x]){
                     quantity[x]=quantity[x]-qty;
                     System.out.println("Now you have set quantity : " + qty);
                     System.out.println("Available stock quantity " + quantity[x] + " for " + product[x]);
                 }
                 isVaildSearch = true;
                 break;
             }
         }
         if(!isVaildSearch){
             System.out.println(" Invalid search ");
         }
     }
     static void PurchaseProduct(String search,String[] product ,int[] quantity, int qty){
         boolean isVaildSearch = false;
         for(int x = 0;x<product.length;x++){
             if(search.trim().equalsIgnoreCase(product[x].trim())){
                 System.out.println(product[x] + " has available total " + quantity[x]);
                 if(qty<=quantity[x]){
                     quantity[x]=quantity[x]-qty;
                     System.out.println("Now you have set quantity : " + qty);
                     System.out.println(" Purchase successfully! ");
                     System.out.println("Available stock quantity " + quantity[x] + " for " + product[x]);

                 }
                 isVaildSearch = true;
                 break;
             }
         }
         if(!isVaildSearch){
             System.out.println(" Invalid search ");
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
        products[0] = " Rice ";
        products[1] = " Milk ";
        products[2] = " Bread  ";
        products[3] = " Eggs  ";
        products[4] = " Juice  ";
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
        System.out.println("**************************************");
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your email : ");
        String email = input.nextLine();
        System.out.print("Enter your address : ");
        String address = input.nextLine();
        System.out.print("Enter your phone number : ");
        String phoneNumber = input.nextLine();
        System.out.println();
        System.out.println("*********************************");
        System.out.println("Name : " + name);
        System.out.println("Email Address : " + email);
        System.out.println("Address : " + address);
        System.out.println("phone number : " + phoneNumber);
        System.out.println("**********************************");
        System.out.println();
        System.out.println("*********************************");
        System.out.println("1. Product search ");
        System.out.println("2. Quantity reduce ");
        System.out.println("3. Product purchase ");
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
        System.out.println("You have limit only purchased 4 items in once ");
        int totallimit = 5;
        int[] purchasedQuantity = new int[totallimit];
        int choice = 0;
        while(choice!=12){
            System.out.print("Enter choice : ");
             choice = input.nextInt();
             if(choice == 1){
                 input.nextLine();
                 System.out.print("Enter search : ");
                 String search = input.nextLine();
                 SearchProduct(search,products, price, quantity,FirstData);
             }
             else if(choice == 2){
                 input.nextLine();
                 System.out.print("Enter search : ");
                 String search = input.nextLine();
                 System.out.println("Enter quantity you want : ");
                 int qty = input.nextInt();
                 QuantityReduce(search, products , quantity, qty);
             }
             else if(choice == 3){
                 input.nextLine();
                 System.out.print("Enter search : ");
                 String search = input.nextLine();
                 System.out.print("Enter quantity you want : ");
                 int qty = input.nextInt();
                 PurchaseProduct(search,products ,quantity, qty);

             }
             else if(choice == 4){

             }



        }








    }
}
