public class six
{
    public static void main(String[] args) {

        //Polymorphisum 1..
        first person = new three(3);
        System.out.println(person.getSalary());
        System.out.println(person.getVacationForm());

        //Polymorphisum 2..
        first[] employees = {new three(3),
                new five(2),
                new four(4),
                new two(1)};

        for (int i= 0; i< employees.length; i++) {
            System.out.println("salary = " + employees[i].getSalary());
            System.out.println("vacation days = " + employees[i].getVacationDays());
            System.out.println();
        }
    }
}
