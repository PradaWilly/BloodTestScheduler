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
    
    private ArrayList<PQElement> qQueue;
    
    
    //constructor
    public MyQueue(){
        qQueue = new ArrayList<>();    
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
        return qQueue.isEmpty() ? null : (Patient) qQueue.get(0).getElement();
    }

    //add patient to queue
     public void enqueue(int priorityKey, Patient patient) {
        int insertIndex = findInsertPosition(priorityKey);
        PQElement newElement = new PQElement(priorityKey, patient);
        
        if (insertIndex >= qQueue.size()) {
            qQueue.add(newElement); // append to end if highest priority
        } else {
            qQueue.add(insertIndex, newElement); // insert normally
        }
    }
     
     // find correct position to inser in queue
    private int findInsertPosition(int priorityKey) {
        for (int i = 0; i < qQueue.size(); i++) {
            if (qQueue.get(i).getPriorityKey() > priorityKey) {
                return i; //insert before lower priority
            }
        }
        return qQueue.size(); // insert at the end
    }

    
    //remove patient at front of queue
    public Patient dequeue() {
        return qQueue.isEmpty() ? null: (Patient) qQueue.remove(0).getElement();
    }

    public ArrayList<PQElement> getqQueue() {
        return qQueue;
    }
    
    
    
}
