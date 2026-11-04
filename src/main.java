

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


     static void QuantityReduce(String search,String[] products ,int[] quantity, int qty,int[] price,String[] purchasedProducts,int[] setQty,int[] setPrice){
         boolean isVaildSearch = false;
         for(int x = 0;x<products.length;x++){
             if(search.trim().equalsIgnoreCase(products[x].trim())){
                 System.out.println( " Product :  " + products[x]);
                 System.out.println(products[x] + " has available total " + quantity[x]);
                 System.out.println(products[x] + " has price Rs " + price[x]);
                 if(qty<0){
                     System.out.println("You have set quantity invalid please try again !");
                     break;
                 }
                 if(qty<=quantity[x]){
                     quantity[x]=quantity[x]-qty;
                     System.out.println("Now you have set quantity : " + qty);
                     System.out.println("Available stock quantity " + quantity[x] + " for " + products[x]);
                 }
                 isVaildSearch = true;
                 break;
             }
         }
         if(!isVaildSearch){
             System.out.println(" Invalid search ");
         }
     }
     static void PurchaseProduct(String search,String[] products,int[] price ,int[] quantity, int qty, String[]  purchasedProducts,int[] setQty,int[] setPrice, int[] setQuantity ,int[] totalPrice,  String[][] MultiplePurchase ,int y,  int[][] purchasedQuantity,  int[][] purchasedPrice){
              for(int x = 0;x<products.length;x++){
                  if(search.trim().equalsIgnoreCase(products[x].trim())){
                      System.out.println("You have purchased succesfully ");
                      purchasedProducts[x] = search;
                      setPrice[x] = price[x];
                      setQty[x] = qty;
                      purchasedQuantity[y][x] = setQty[x];
                      MultiplePurchase[y][x] =  purchasedProducts[x];
                      purchasedPrice[y][x] = setPrice[x];

                      setQuantity[x] = quantity[x];
                      totalPrice[x] = setPrice[x]*setQty[x];
                      System.out.println();
                      System.out.println("******************");
                      System.out.println("Product : " + purchasedProducts[x]);
                      System.out.println("Set quantity : " + setQty[x]);
                      System.out.println("Price: " + setPrice[x]);
                      System.out.println("TotalPrice: " + totalPrice[x]);
                      System.out.println("******************");


                  }
              }
     }
     static void TotalBillCalculate( int[] setQty,  int[] setPrice,  String[] purchasedProducts,int totallimit,int[] totalPrice ){

         for(int x = 0;x<totallimit;x++){
             if(setPrice[x]!=0){
                 System.out.println("Product: " + "          " + " Quantity : " + "         " + "Price : " + "        " + "Total Price: ");
                 System.out.println(purchasedProducts[x] + "             " +  setQty[x] + "                  " + setPrice[x] + "                      " + totalPrice [x]);
             }

         }
     }
     static void CheckingStock(String[] products,int[] quantity,int totalline){
        for(int x = 0;x<totalline;x++){
            System.out.println(products[x] + " has " + quantity[x] + " stocks" );
        }
     }
     static void OutOfStockProduct(String[] products,int[] quantity,int totallimit){
           boolean stockOut = false;
           for(int x = 0;x<totallimit;x++){
               if(quantity[x]==0){
                   System.out.println(products[x] + " has " + quantity[x]);
                   stockOut = true;
               }
           }
           if(!stockOut){
               System.out.println("There are no stock of out");
           }
     }
     static void ExpensiveProduct(String[] products,int[] price){
          int expensive = price[0];
          String productName = products[0];
          for(int x = 1;x<price.length;x++){
              if(price[x]>expensive){
                 expensive = price[x];
                 productName = products[x];
              }
          }
         System.out.println("The expensive product : " + productName + " has price " + expensive);
     }
  static void CheapestProduct(String[] products,int[] price){
      int cheapest = price[0];
      String productName = products[0];
      for(int x = 1;x<price.length;x++){
          if(price[x]<cheapest){
              cheapest = price[x];
              productName = products[x];
          }
      }
      System.out.println("The cheapest product : " + productName + " has price " + cheapest);
  }
  static void CustomerData(String name,String email,String phoneNumber){
      System.out.println("************Customer Bill**************");
      System.out.println();
      System.out.println("Customer's name : " + name);
      System.out.println("Customer's email : " + email);
      System.out.println("Customer's phoneNumber : " + phoneNumber);
      System.out.println();
      System.out.println("**************************************");
  }
  static  void TotalSales(int[] price,int[] setQty ){
         int totalSales  = 0;
         for(int x = 0;x< price.length;x++){
             totalSales = totalSales + price[x]*setQty[x];
         }
      System.out.println("Total Sales : " + totalSales);
  }





    public static void main(String[] args) {
        System.out.println("******************** Mini-Supermarket/Inventory System *********************");
        String[] customer = new String[5];
        String[][] MultiplePurchase = new String[5][5];
        int[][] purchasedQuantity = new int[5][5];
        int[][] purchasedPrice = new int[5][5];
        String[] products = new String[5];
        String[] FirstData = new String[3];
        int[] price = new int[5];
        int[] quantity = new int[5];

        for (int y = 0; y < 5; y++) {
            Scanner input = new Scanner(System.in);
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

            for (int i = 0; i < 3; i++) {
                System.out.print(FirstData[i] + "  ");
            }
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.println(products[j] + "          " + price[j] + "                  " + quantity[j] + "                  ");
            }
            System.out.println();
            System.out.println("**************************************");
            System.out.print("Enter your name : ");
            String name = input.nextLine();
            customer[y] = name;
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
            String[] purchasedProducts = new String[totallimit];
            int[] setQty = new int[totallimit];
            int[] setPrice = new int[totallimit];
            int[] totalPrice = new int[totallimit];
            int[] setQuantity = new int[totallimit];

            int choice = 0;
            while (choice != 12) {
                System.out.print("Enter choice : ");
                choice = input.nextInt();
                if (choice == 1) {
                    input.nextLine();
                    System.out.print("Enter search : ");
                    String search = input.nextLine();
                    SearchProduct(search, products, price, quantity, FirstData);
                } else if (choice == 2) {
                    input.nextLine();
                    System.out.print("Enter search : ");
                    String search = input.nextLine();
                    System.out.print("Enter quantity you want : ");
                    int qty = input.nextInt();
                    QuantityReduce(search, products, quantity, qty, price, purchasedProducts, setQty, setPrice);
                } else if (choice == 3) {
                    input.nextLine();
                    System.out.print("Enter search : ");
                    String search = input.nextLine();
                    System.out.print("Enter quantity you want : ");
                    int qty = input.nextInt();
                    PurchaseProduct( search, products, price , quantity, qty, purchasedProducts, setQty, setPrice, setQuantity , totalPrice,  MultiplePurchase , y, purchasedQuantity, purchasedPrice);
                }
                else if (choice == 4) {
                    System.out.println("***************Total bill calculate********************");
                    System.out.println();
                    CustomerData(name, email, phoneNumber);
                    TotalBillCalculate(setQty, setPrice, purchasedProducts, totallimit, totalPrice);
                    int sum = 0;
                    for (int x = 0; x < totalPrice.length; x++) {
                        sum = sum + totalPrice[x];
                    }

                    System.out.println("Grand Total : " + sum);


                } else if (choice == 5) {
                    System.out.println("**************Stock of Products***************");
                    System.out.println();
                    CheckingStock(products, quantity, totallimit);
                } else if (choice == 6) {
                    System.out.println("***************Out-of-stock products*****************");
                    OutOfStockProduct(products, quantity, totallimit);
                } else if (choice == 7) {
                    System.out.println("***************Most expensive product*************");
                    ExpensiveProduct(products, price);

                } else if (choice == 8) {
                    System.out.println("****************Cheapest product****************");
                    CheapestProduct(products, price);

                } else if (choice == 9) {
                    System.out.println("*************Total sales************");
                    TotalSales(price, setQty);
                }
            }
            System.out.println("*******************");
        }
    }

}
