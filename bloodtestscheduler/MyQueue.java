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
public class MyQueue implements QueueInterface{
    
    private ArrayList<Patient> qQueue;
    
    //constructor
    public MyQueue(){
        qQueue = new ArrayList<Patient>();
    }
    
    //check if queue is empty
    public boolean isEmpty(){
        return qQueue.isEmpty();
    }
    
    //get size of queue
    public int size(){
        return qQueue.size();
    }
    
    //get patient at front
    public Patient frontElement() {
        if (qQueue.size() > 0) {
            return qQueue.get(0);
        } else {
            return null;
        }
    }

    //add patient to queue
    public void enqueue(Object element) {
        qQueue.add((Patient) element);
    }

    //remove patient at front of queue
    public Patient dequeue() {
        if (qQueue.size() > 0) {
            return qQueue.remove(0);
        } else {
            return null;
        }
    }
    
    
}
