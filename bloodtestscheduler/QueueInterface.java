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
    // Check if the queue is empty
    public boolean isEmpty();

    // Get the size of the queue
    public int size();

    // Get the front element of the queue
    public Object frontElement();

    // Add an element to the queue
    public void enqueue(int priorityKey, Patient patient);
    // Remove and return the front element of the queue
    public Object dequeue();
}
