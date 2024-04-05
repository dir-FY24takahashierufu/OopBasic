package campany;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var Employee = new Employee("鈴木","営業部","課長",100);
        
        //インスタンスメソッドの呼び出し
        Employee.report();
        Employee.report(2);
        
        //１行空ける
        System.out.println("");
        
        //インスタンスの作成
        var engineer = new Employee("田中", "開発部", "一般社員", 88);
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        

    }

}
