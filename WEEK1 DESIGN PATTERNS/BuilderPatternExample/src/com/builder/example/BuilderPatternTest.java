package com.builder.example;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer with custom configuration using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG")
                .setPowerSupply("750W")
                .setCaseType("Mid Tower")
                .build();

        // Create another Computer with different configuration
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        // Print the configurations
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
