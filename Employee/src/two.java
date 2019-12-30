
    public class two extends first {

        public two(int years) {
            super(years);
        }

        public void fileLegalBriefs() {
            System.out.println("I could file all day!");
        }

        public double getSalary() {
            double baseSalary = super.getSalary();
            return baseSalary + 5000.0;
        }
    }
