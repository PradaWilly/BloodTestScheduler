/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Cosmin
 */
public interface QueueInterface {
    //check if the queue is empty
    public boolean isEmpty();

    //get size of the queue
    public int size();

    //get front element of the queue
    public Object frontElement();

    //add element to the queue
    public void enqueue(int priorityKey, Patient patient);
    //remove front element of the queue
    public Object dequeue();
}
