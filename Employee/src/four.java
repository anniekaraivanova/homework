public class four extends first
{
    public four(int years) {
        super(years);
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0;}
}
