/**
 * Item class keeps record of item names, prices, and quantity of items of the stocks in essentials.
 * The class uses setters and getters to set new items and return them.
 * @param ItemName, price, quantity are the parameters the program takes in
 *
 * @return This program returns ItemName, price, and quantity of Items in the shop.
 *
 * @author Afsanat Ineza
 *          Farida Eleshin
 */


public class Items {
    /**
     declaring instance variables
     **/
    String ItemName;
    int price;
    int quantity;

    /**
     default constructor
     **/
    public Items(){
        this.ItemName=null;
        this.price=0;
        this.quantity=0;
    }


    /*
    an alternative constructor
     */

    public Items(String name,int price,int quantity ){
        this.ItemName=name;
        this.price=price;
        this.quantity=quantity;
    }

    /*
    getter methods
     */
    public String getItemName(){ return ItemName; }
    public int getPrice(){ return price; }
    public int getquantity(){ return quantity; }

    /*
    setter methods
     */

    public void setProdName(String name){ ItemName=name;}
    public void setPrice(int newPrice){ price=newPrice;}
    public void setQuantity(int newquantity){ quantity=newquantity;}

    //This method increases the quantity of a product in stock
    public void increaseQuantity(int increase){
        quantity+=increase;
    }

    // This method prints details of a certain item
    public String printMethod(){
        return ItemName + "\t" + price + "\tGHC"  + quantity + "\n";
    }

}
