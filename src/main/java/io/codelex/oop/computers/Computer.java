package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    private String cpu;
    private int ram;
    private String gpu;
    private String company;
    private String model;

    public Computer(String cpu, int ram, String gpu, String company, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.company = company;
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "cpu='" + cpu + '\'' +
                        " ram=" + ram + "GB" +
                        " gpu='" + gpu + '\'' +
                        " company='" + company + '\'' +
                        " model='" + model + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(cpu, computer.cpu) && Objects.equals(gpu, computer.gpu) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, gpu, company, model);
    }
}
