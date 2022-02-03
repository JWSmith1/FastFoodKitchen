import java.util.ArrayList;
import java.util.Collections;

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
        for (int i = 0; i <= orderList.size() - 1; i++)
            if (orderID == orderList.indexOf(i)) {
                orderList.remove(i);
                return true;
            }
        return false;
    }

    /**
     *
     * @param orderID target for sequential search to find in the orderList
     * @return The position of the orderID in the orderList or -1 if it is not found
     */
    public int findOrderSeq(int orderID){
        for (int i = 0; i <= orderList.size() -1; i++){
            if (orderID == orderList.get(i).getOrderNum()) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     */
    public void selectionSort(){
        for (int i = 0; i < orderList.size() -1; i++){
            int minIndex = i;
            for (int j = i + 1; j < orderList.size(); j++){
                if (orderList.get(j).getTotalBurgers() < orderList.get(minIndex).getTotalBurgers()){
                    minIndex = j;
                }

            }
            // Swapping element i with new value of minIndex given in if statement in OrderList
            Collections.swap(orderList, i, minIndex);
        }
    }

    public void insertionSort(){
        if (orderList.size() != 0){
            for (int i = 1; i < orderList.size(); i++){
                int pointer = i;
                int totalBurg = orderList.get(i).getTotalBurgers();
                //tempOrder = orderList.get(i);
                while (pointer > 0 && (totalBurg < orderList.get(pointer - 1).getTotalBurgers())){
                    BurgerOrder temp = orderList.remove(pointer -1);
                    orderList.add(pointer, temp);
                    pointer--;

                }
            }
        }
    }

    /**
     *
     * @param orderID used to search OrderList for position
     * @return returns the current position in orderList
     */
    public int findOrderBin(int orderID){
        int left = 0;
        int right = orderList.size() -1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (orderID == orderList.get(middle).getOrderNum()){
                return middle;
            }
            else if (orderID > orderList.get(middle).getOrderNum()){
                left = middle + 1;
            }
            else if (orderID < orderList.get(middle).getOrderNum()){
                right = middle - 1;
            }
            else {
                return -1;
            }
        }
        return -1;

    }




    /**
     *
     * @return Returns orderList
     */
    public ArrayList<BurgerOrder> getOrderList(){
        return orderList;
    }


}
