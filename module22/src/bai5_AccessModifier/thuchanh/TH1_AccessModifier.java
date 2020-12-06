package bai5_AccessModifier.thuchanh;

public class TH1_AccessModifier {
    public static void main(String[] args) {

    }

    class A{

        private int data=40;

        private void msg(){System.out.println("Hello java");}

    }



    public class Simple{

        public  void main(String args[]){

            A obj=new A();

            System.out.println(obj.data);//Compile Time Error

            obj.msg();//Compile Time Error

        }

    }



}
