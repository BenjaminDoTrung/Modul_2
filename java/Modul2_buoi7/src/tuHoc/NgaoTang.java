package tuHoc;

public class NgaoTang extends Dog implements CanSuTu {
    @Override
    public void run() {
        System.out.println("tuHoc.NgaoTang Run");
    }

    @Override
    public void can() {
        System.out.println("tuHoc.NgaoTang Can");
    }

    @Override
    public String gam() {
        System.out.println("Ngao gam");
        return "asdaef";
    }
}
