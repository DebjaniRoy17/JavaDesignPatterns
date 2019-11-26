package com.java.builder2;

public class Computer {

    //required params
    private String ram;
    private String rom;


    //optional params
    private boolean isGraphicCardEnabled;


    private Computer(Builder builder) {
        this.ram = builder.ram;
        this.rom = builder.rom;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }


    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

        public static class Builder {
            private String ram;
            private String rom;
            private boolean isGraphicCardEnabled;

            public Builder(String ram, String rom) {
                this.ram = ram;
                this.rom = rom;
            }

            public Builder(String rom) {
                this.rom = rom;

            }

            public Builder setGraphicCardEnabled(boolean graphicCardEnabled) {
                isGraphicCardEnabled = graphicCardEnabled;
                return this;            }

            public Computer build(){
                return new Computer(this);
            }

        }

}
