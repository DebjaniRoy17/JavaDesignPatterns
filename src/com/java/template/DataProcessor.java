package com.java.template;

public abstract class DataProcessor {

    public void readProcessSave(){
        readData();
        processData();
        saveData();
    }
    public abstract void readData();// we had to create abstract functions for these because they were in the subclass but are NOT present in subclass
    public abstract void processData();

    public void saveData(){
        System.out.println("Save Data to DB");
    }
}
