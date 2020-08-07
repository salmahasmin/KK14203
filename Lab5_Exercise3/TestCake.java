//NAME : SALMAH BINTI ASMIN
//MATRIC NO. : BI19110102

import java.text.DecimalFormat;

class Cake{
   DecimalFormat df = new DecimalFormat("0.00");
   String name;
   String[] topping = new String[5];
   String[] toppingOrder = new String[5];
   double priceSmall, priceMedium, priceBig, totalPrice;
   int size, quantity;
   
   Cake(String cake_name){
      this.name = cake_name;
   }
   
   void setCake(String[] Topping, double PriceSmall, double PriceMedium, double PriceBig){
      this.topping = Topping;
      this.priceSmall = PriceSmall;
      this.priceMedium = PriceMedium;
      this.priceBig = PriceBig;
   }
   
   void orderCake(String[] ToppingOrder, int Quantity, int Size){
      this.toppingOrder = ToppingOrder;
      this.quantity = Quantity;
      this.size = Size;
   }
   
   double getSizePrice(){
      if(size==1){
         return priceSmall;
      }
      else if(size==2){
         return priceMedium;
      }
      else{
         return priceBig;
      }
   }
   
   double getTotalPrice(){
      totalPrice = getSizePrice() * quantity + (toppingOrder.length*10);
      return totalPrice;
   }
   
   String getSize(){
      if(size==1){
         return "Small";
      }
      else if(size==2){
         return "Medium";
      }
      else if(size==3){
         return "Big";
      }
      else{
         return "Size Unavailable.";
      }
   }
   
   void printCake(){
      System.out.println("----------------------------------------------------");
      System.out.println("\t\t\t\t\t\tCake Menu\t\t\t\t\t\t");
      System.out.println("----------------------------------------------------");
      System.out.println(name + " cake with available toppings: ");
      
      for(int i=0; i<topping.length; i++){
         System.out.println((i+1) + ") " + topping[i]);
      }
      
      System.out.println("\nPrice: ");
      System.out.println("[1] Small  : RM " + df.format(priceSmall));
      System.out.println("[2] Medium : RM " + df.format(priceMedium));
      System.out.println("[3] Big    : RM " + df.format(priceBig));
   }
   
   void printOrder(){
      System.out.println("\n");
      System.out.println("Cake Order Detail: ");
      System.out.println("----------------------------------------------------");
      System.out.print("Topping : ");
      
      for(int i=0; i<toppingOrder.length; i++){
         System.out.print((i+1) + ") " + toppingOrder[i] + " ");
      }
      
      System.out.println("\nSize    : " + getSize());
      System.out.println("----------------------------------------------------");
      System.out.println("Total Price: RM " + df.format(getTotalPrice()));
      System.out.println("----------------------------------------------------");
   }
}

class BlackForest extends Cake{
   BlackForest(String cake_name){
      super(cake_name);
   }
   
   void setCake(String[] Topping, double PriceSmall, double PriceMedium, double PriceBig){
      this.topping = Topping;
      this.priceSmall = PriceSmall;
      this.priceMedium = PriceMedium;
      this.priceBig = PriceBig;
   }
}

public class TestCake{
   public static void main(String args[]){
      
      Cake c = new BlackForest("BlackForest");
      String[] topping = {"Chocolate", "Cherries", "Whipped Cream"};
      c.setCake(topping, 45.00, 65.00, 80.00);
      c.printCake();
      
      String[] order = {"Chocolate", "Cherries"};
      c.orderCake(order, 1, 2);
      c.printOrder();
   }
}