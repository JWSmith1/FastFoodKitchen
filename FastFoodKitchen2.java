import java.util.ArrayList;

/**
 * Fast Food Kitchen Part B Class
 *
 * ITSC 1213 Module 2
 *
 * @author Jacob Smith
 * @version Spring 22
 */


public class FastFoodKitchen2 {
    private ArrayList<BurgerOrder> orderList = new ArrayList<>();
    private static int nextOrderNum = 0;

    // Getter for nextOrderNum

    /**
     *
     * @return Returns the next order number
     */
    public int getNextOrderNum(){
        return nextOrderNum;
    }

    // Method to increment variable next order num

    /**
     * Increments the nextOrderNumber by 1
     */
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }

    // FastFoodKitchen Constructor

    /**
     * Adding 3 intital orders to ArrayList: orderList, increments nextOrderNum after adding each order
     */
    public FastFoodKitchen2(){
        BurgerOrder order1 = new BurgerOrder(3,5,4, 10, false, 1);
        BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
        BurgerOrder order3 = new BurgerOrder(1,1,0,2,false,3);
        orderList.add(order1);
        FastFoodKitchen2.incrementNextOrderNum();
        orderList.add(order2);
        FastFoodKitchen2.incrementNextOrderNum();
        orderList.add(order3);
        FastFoodKitchen2.incrementNextOrderNum();

    }

    // Add order method

    /**
     *
     * @param ham Hamburgers for order
     * @param cheese Cheese Burgers for order
     * @param veggie VeggieBurgers for order
     * @param soda Sodas for order
     * @param toGo Determines if order is to go or not
     * @return Returns the nextOrderNumber for Customer
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        BurgerOrder newOrder = new BurgerOrder(ham, cheese, veggie, soda, toGo, 4);
        orderList.add(newOrder);
        FastFoodKitchen2.incrementNextOrderNum();
        return nextOrderNum;

    }

    // Cancel Last Order Method

    /**
     *
     * @return Returns true if orderList is larger than 1 and cancels last order, returns false if orderList has no current orders
     */
    public boolean cancelLastOrder(){
        if (orderList.size() > 1){
            orderList.remove(orderList.size() - 1);
            nextOrderNum--;
            return true;
        }
        else if (orderList.size() == 0){
            return false;
        }
        return false;
    }

    // Number of orders pending method

    /**
     *
     * @return Returns number of orders pending to customer
     */
    public int getNumOrdersPending(){
        return orderList.size();
    }

    @Override
    public String toString() {
        return "FastFoodKitchen2{" +
                "orderList=" + orderList +
                '}';
    }

    /**
     *
     * @param orderID Integer passed to check agaisnt order numbers of OrderList
     * @return Returns 1 if order number matches the orderID, 0 if it does not
     */
    public int isOrderDone(int orderID){
        int iD = 0;
        for (int i = 0; i <= orderList.size() -1; i++){
            if (orderList.get(i).getOrderNum() == orderID) {
                iD = 1;
                return iD;
            }
            else if (orderList.get(i).getOrderNum() != orderID){
                return iD;
            }


        }
        return iD;
    }

    /**
     *
     * @param orderID Integer passed to check against order numbers of orderlist to cancel
     * @return Returns true if orderID matches an ordernumber and cancels that order, false if it does not
     */
    public boolean cancelOrder(int orderID){
        for (int i = 0; i <= orderList.size() - 1; i++){
            if (orderID == orderList.indexOf(i)){
                orderList.remove(i);
                return true;
            }

        }
        return false;
    }
}
