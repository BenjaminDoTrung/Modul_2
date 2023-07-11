package tuHoc;

public class BecGie extends Dog implements DiVeSinh{
    @Override
    public void run() {
        System.out.println("Becgie run");
    }

    public void sua(){
        System.out.println("tuHoc.BecGie sua");
    }

    @Override
    public void diVeSinh() {
        System.out.println("Becgie ddi ve sinh");
    }

    public class CanSuTu {
    }
}
