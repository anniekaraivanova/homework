public class first
{
    private int years;

    public first(int years){

    }

    public int getYears() {
        return years;
    }

    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 50000.0;
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();
    }

    public String getVacationForm() {
        return "yellow";
    }

    public int getSeniorityBonus() {
        return 2 * years;
    }
}
