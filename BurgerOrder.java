/**
 * BurgerOrder Class
 *
 * ITSC 1213 Module 2
 *
 * @author Jacob Smith
 * @version Spring 22
 */

public class BurgerOrder {

    private int numHamburgers = 0;
    private int numCheeseBurgers = 0;
    private int numVeggieBurgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 0;

    // Getter for variable numHamburgers

    /**
     *
     * @return Number of Hamburgers
     */
    public int getNumHamburgers(){
        return numHamburgers;
    }

    // Setter for numHamburgers, checks if new value is less than 0

    /**
     *
     * @param x Integer for updating value of hamburgers in order
     * @return new value of Hamburgers
     */
    public int setNumHamburgers(int x){
        if (x < 0){
            System.out.println("Error, value must be greater than 0.");
            return numHamburgers;
        }
        else{
            numHamburgers = x;

        }

        return numHamburgers;
    }

    // Getter for variable numCheeseBurgers

    /**
     *
     * @return Number of CheeseBurgers
     */
    public int getNumCheeseBurgers(){
        return numCheeseBurgers;
    }

    // Setter for numCheeseBurgers, checks if new value is less than 0

    /**
     *
     * @param x Integer passed to change number of cheeseburgers for order
     * @return New value for Number of CheeseBurgers
     */
    public int setNumCheeseBurgers(int x){
        if (x < 0){
            System.out.println("Error, value must be greater than 0.");
            return numCheeseBurgers;
        }
        else{
            numCheeseBurgers = x;

        }

        return numCheeseBurgers;
    }

    // Getter for variable numVeggieBurgers

    /**
     *
     * @return Number of VeggieBurgers
     */
    public int getNumVeggieBurgers(){
        return numVeggieBurgers;
    }

    // Setter for numVeggieBurgers, checks if new value is less than 0

    /**
     *
     * @param x Integer passed to change value of veggieburgers
     * @return New Value for Number of Veggie Burgers
     */
    public int setNumVeggieBurgers(int x){
        if (x < 0){
            System.out.println("Error, value must be greater than 0.");
            return numVeggieBurgers;
        }
        else{
            numVeggieBurgers = x;

        }

        return numVeggieBurgers;
    }

    // Getter for variable numSodas

    /**
     *
     * @return Number of Sodas
     */
    public int getNumSodas(){

        return numSodas;
    }

    // Setter for numSodas, checks if new value is less than 0

    /**
     *
     * @param x Integer passed to change number of sodas for order
     * @return New Value for Number of Sodas
     */
    public int setSodas(int x){
        if (x < 0){
            System.out.println("Error, value must be greater than 0.");
            return numSodas;
        }
        else{
            numSodas = x;

        }

        return numSodas;
    }

    // Getter for OrderToGo

    /**
     *
     * @return Returns if order is to go or not
     */
    public boolean getOrderToGo(){

        return orderToGo;
    }

    // Setter for OrderToGo

    /**
     *
     * @param go boolean passed to change from to go or not
     * @return Sets order to go or not to go
     */
    public boolean setOrderToGo(boolean go){

        return orderToGo = go;
    }

    // Getter for OrderNum

    /**
     *
     * @return Returns the current order number
     */
    public int getOrderNum(){
        return orderNum;
    }

    // Setter for OrderNum

    /**
     *
     * @param x Interger passed as new value for order number
     * @return Sets new value for the current order number
     */
    public int setOrderNum(int x){

        return orderNum = x;
    }

    // Constructor

    /**
     *
     * @param hamBurger Value of Hamburgers for order
     * @param cheeseBurger Value of CheeseBurgers for order
     * @param veggieBurger Value of VeggieBurgers for order
     * @param soda Value of sodas for order
     * @param toGo Determines if order is to go or not
     * @param numOrder Current order number
     */
    public BurgerOrder(int hamBurger, int cheeseBurger, int veggieBurger, int soda, boolean toGo, int numOrder){
        numHamburgers = hamBurger;
        numCheeseBurgers = cheeseBurger;
        numVeggieBurgers = veggieBurger;
        numSodas = soda;
        orderToGo = toGo;
        orderNum = numOrder;

    }

    public int getTotalBurgers(){
        return getNumCheeseBurgers() + getNumVeggieBurgers() + getNumHamburgers();
    }


    @Override
    public String toString() {
        return "BurgerOrder{" +
                "numHamburgers=" + numHamburgers +
                ", numCheeseBurgers=" + numCheeseBurgers +
                ", numVeggieBurgers=" + numVeggieBurgers +
                ", numSodas=" + numSodas +
                ", orderToGo=" + orderToGo +
                ", orderNum=" + orderNum +
                '}';
    }


}
