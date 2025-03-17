package bloodtestscheduler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cosmin
 */
public class Patient {
    private String name;    
    private int age;
    private String gpDetails;
    private boolean fromHospital;
    
    public Patient(String name, int age, String gpDetails, boolean fromHospital){
        this.name = name;
        this.age = age;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(boolean fromHospital) {
        this.fromHospital = fromHospital;
    }
    
    
    
    
}
