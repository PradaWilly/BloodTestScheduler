/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Cosmin
 */
public class PQElement {
    private int priorityKey;
    private Object element;
    
    public PQElement(int priorityKey, Object element){
        this.priorityKey = priorityKey;
        this.element = element;
    }

    public int getPriorityKey() {
        return priorityKey;
    }

    public void setPriorityKey(int priorityKey) {
        this.priorityKey = priorityKey;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    
    
    
}
