package composition;

public class Main {
    public static void main(String[] args) {
        Firm firm1 = new Firm("31983721893", "Openline");
        firm1.createDepartment("ACC1", "Accountant");
        firm1.createDepartment("SAL1", "Sales");
        System.out.println(firm1);
        firm1.removeDepartment(0);
        firm1.removeDepartment(1);
        System.out.println(firm1);
        firm1.createDepartment("AAA", "Ajds");
        System.out.println(firm1);
        firm1.createDepartment("BBB", "sdadas");
        firm1.createDepartment("CCC", "dsada");
        firm1.removeDepartment(3);
        System.out.println(firm1);
        firm1.createDepartment("DDD", "dsadas");
        firm1.createDepartment("AADDS", "dsadas");
        System.out.println(firm1);
        System.out.println(firm1.findDepartmentByName("dsadas"));
    }
}
