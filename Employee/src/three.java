public class three extends first
{
    public three(int years) {
        super(years);
    }

    public String getVacationForm() {
        return "pink";
    }

    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    public double getSalary() {
        return super.getSalary() + 5000 * getYears();
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
