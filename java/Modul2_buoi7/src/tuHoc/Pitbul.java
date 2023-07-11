package tuHoc;

public class Pitbul extends Dog implements CanSuTu, DiVeSinh {

    
    public void run() {
        System.out.println("tuHoc.Pitbul run");
    }

    public static void main(String[] args) {
        Dog[] arrDog = new Dog[6];
        arrDog[0] = new BecGie();
        arrDog[1] = new NgaoTang();
        arrDog[2] = new Pitbul();
        arrDog[3] = new BecGie();
        arrDog[4] = new Pitbul();
        arrDog[5] = new Dog() {
            @Override
            public void run() {

            }
        };

        ((BecGie)arrDog[0]).sua();
        BecGie dog2 = new BecGie();
        Dog dog1 = new BecGie();
        dog1.luck(3);
        dog1.luck(3.3);
//        dog1 = (tuHoc.Dog) dog1;
//        dog2 = (tuHoc.Dog) dog2;

        // ví dụ về đa hình: duyệt 1 mảng có kiểu là tuHoc.Dog
        // nhưng mỗi phần tử lại thực hiện phương thức run() khác nhau
        // từ đó ta sẽ có được nhiều hình thái trong cùng một mảng có kiểu là tuHoc.Dog. Đó gọi là đa hình
        // sử dụng thông qua kế thừa (extends) và ghi đè phương thức (overriding).
        for (int i = 0; i < arrDog.length; i++) {
            arrDog[i].run();
        }

        System.out.println("---------------");
        Dog pit = new Pitbul();

        ((CanSuTu) pit).can();
        ((CanSuTu) pit).gam();
        ((DiVeSinh) pit).diVeSinh();

    }

    @Override
    public void can() {
        System.out.println("tuHoc.Pitbul can");
    }

    @Override
    public String gam() {
        System.out.println("Putbul gam");
        return "sdfsdfa";
    }

    @Override
    public void diVeSinh() {

    }
}
