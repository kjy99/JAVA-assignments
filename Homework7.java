abstract class Printer
{
    String model;
    int PrintedCount;
    int availableCount;

    Printer(String model, int availableCount)
    {
        this.model=model;
        this.availableCount=availableCount;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer
{
    InkjetPrinter(String model, int availableCount)
    {
        super(model, availableCount);
    }
    @Override
    boolean print()
    {
        if(super.availableCount==0)
        {
            System.out.printf(super.model+":"+(super.PrintedCount+1)+"메쩨 인쇄 실패-잉크 부족.\n");
            return false;
        }
        else
        {
            --super.availableCount;
            ++super.PrintedCount;
            return true;
        }
    }
}

class LaserPrinter extends Printer
{
    LaserPrinter(String model, int availableCount)
    {
        super(model, availableCount);
    }
    @Override
    boolean print()
    {
        if(super.availableCount==0)
        {
            System.out.printf(super.model + ":" + (super.PrintedCount+1) + "메쩨 인쇄 실패-토너 부족.\n");
            return false;
        }
        else
        {
            --super.availableCount;
            ++super.PrintedCount;
            return true;
        }
    }
}

public class Homework7
{
    public static void main(String[] args)
    {
        InkjetPrinter inkjet=new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser =new LaserPrinter("Canon MFC643Cdw",1500);
        while(inkjet.print());
        while(laser.print());
    }
}
