
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * The usedCarList class contains various methods for car objects
 *
 * @author Raymon Qu
 */
public class UsedCarList {

    /** car ArrayList variable called inventory      */
    private ArrayList<Car> inventory;

    /** constructor to set inventory to a new Car arrayList  */
    public UsedCarList(){
        inventory = new ArrayList<Car>();
    }
    /** getter method for inventory
     * @return inventory
     * */
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    /** adds a car object to arrayList
     * @param newCar the new car object
     * */
    public void addCar(Car newCar){
        inventory.add(newCar);
    }
    /** adds a car object at a given index and moves all the car's index ahead by one
     * @param indexToAdd index where the car is going to be added
     * @param carToAdd car object that is going to be added
     * PRECONDITION: indexToAdd less than inventory size but greater than 0
     * */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }
    /** Removes a car
     * @param indexOfCarToSell index of car to be removed
     * PRECONDITION: indexOfCarToSell less than size of list but greater than 0
     * @return the car removed
     * */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car carSold = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return carSold;
    }
    /** Removes the car and returns it but does not move all the numbers
     * accordingly, instead replaces car removed with null
     * @param indexOfCarToSell index of car to be removed
     * PRECONDITION: indexOfCarToSell less than size of list but greater than 0
     * @return  the car removed
     * */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car carSold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return carSold;
    }
    /** moves a car to another position and changes the indexes of all the other cars accordingly
     * @param indexOfCarToMove index of car to move
     * @param destinationIndex destination of car that is being moved
     * PRECONDITION: indexOfCarToMove less than size of inventory and greater than 0.
     * destinationIndex less than size of inventory and greater than 0
     * */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToBeMoved = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToBeMoved);
    }




}
