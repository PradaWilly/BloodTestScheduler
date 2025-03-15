/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author Cosmin
 */
public class MyStack implements StackInterface{
    
    private ArrayList<Patient> theStack; // Stack to store Patient objects

    
     //constructor
    
    public MyStack() {
        theStack = new ArrayList<>();
    }

    //check if stack is empty
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

   //check if stack is full
    public boolean isFull() {
        return false;
    }

    //add patient to top of stack
    public void push(Object newItem) {
        theStack.add(0, (Patient) newItem); //add to the top 
    }

    //remvoe patient from top of stack
    public Patient pop() {
        if (!theStack.isEmpty()) {
            return theStack.remove(0); //remove from the top
        } else {
            return null; //stack is empty
        }
    }

    //size of stack
    public int size() {
        return theStack.size();
    }

    /**
     * Returns the last 5 patients who did not show up.
     */
    public ArrayList<Patient> getLastFiveNoShows() {
        ArrayList<Patient> lastFive = new ArrayList<>();
        int count = Math.min(theStack.size(), 5); //get last 5 patients
        for (int i = 0; i < count; i++) {
            lastFive.add(theStack.get(i));
        }
        return lastFive;
    }
}
