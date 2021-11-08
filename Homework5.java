class PersonalComputer
{
    private Computer computer;
    private Monitor monitor;

    PersonalComputer(Computer myComputer, Monitor myMonitor)
    {
        this.computer=myComputer;
        this.monitor=myMonitor;
    }

    public void turnOn()
    {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo()
    {
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor
{
    private String monitorSize;
    private String color;
    private String power;

    String getMonitorSize()
    {
        return monitorSize;
    }

    String getColor()
    {
        return color;
    }

    String getPower()
    {
        return power;
    }

    void setMonitorSize(String monitorSize)
    {
        this.monitorSize = monitorSize;
    }

    void setColor(String color)
    {
        this.color=color;
    }

    void setPower(String power)
    {
        this.power=power;
    }

    public void turnOn()
    {
        System.out.printf("Tunring on the monitor.\n");
    }

    public void printInfo()
    {
        System.out.printf("The spec of the monitor\n");
        System.out.printf(" Size: "+monitorSize+'\n');
        System.out.printf(" Color: "+color+'\n');
        System.out.printf(" Power: "+power+'\n');
    }
}

class Computer
{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    String getCpu()
    {
        return cpu;
    }

    String getMemory()
    {
        return memory;
    }

    String getHd()
    {
        return hd;
    }

    String getColor()
    {
        return color;
    }

    String getPower()
    {
        return power;
    }

    void setCpu(String cpu)
    {
        this.cpu=cpu;
    }

    void setMemory(String memory)
    {
        this.memory=memory;
    }

    void setHd(String hd)
    {
        this.hd=hd;
    }

    void setColor(String color)
    {
        this.color=color;
    }

    void setPower(String power)
    {
        this.power=power;
    }

    public void turnOn()
    {
        System.out.printf("Tunring on the computer.\n");
    }

    public void printInfo()
    {
        System.out.printf("The spec of the computer\n");
        System.out.printf(" CPU: "+cpu+'\n');
        System.out.printf(" Memory: "+memory+'\n');
        System.out.printf(" HDD: "+hd+'\n');
        System.out.printf(" Color: "+color+'\n');
        System.out.printf(" Power: "+power+'\n');
    }
}

public class Homework5 {
    public static void main(String[] args)
    {
        Monitor myMonitor=new Monitor();
        Computer myComputer=new Computer();

        myComputer.setCpu("Core i7");
        myComputer.setMemory("16GB");
        myComputer.setHd("2TB");
        myComputer.setColor("White");
        myComputer.setPower("500W");

        myMonitor.setMonitorSize("24 inch");
        myMonitor.setColor("Black");
        myMonitor.setPower("45W");

        PersonalComputer myPersonalComputer=new PersonalComputer(myComputer, myMonitor);
        myPersonalComputer.turnOn();
        myPersonalComputer.printInfo();
    }
}
