package com.java.template;

public class TestExcel {

    public static void main(String[] args) {

        ExcelFile excel = new ExcelFile();
        excel.readProcessSave();

        TextFile text = new TextFile();
        text.readProcessSave();
    }
}
