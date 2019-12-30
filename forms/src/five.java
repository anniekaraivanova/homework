public class five
{
    public static void main(String[] args) {

        two circ= new two(14.0);
        three rect= new three(5, 10);
        four tri = new four(3, 11, 15);

        one[] form = {circ, tri, rect};
        for (int i= 0; i<form.length; i++) {
            printInfo(form[i]);
        }
    }

    public static void printInfo(one s) {
        System.out.println("The shape : " + s);
        System.out.println("area : " + s.area());
        System.out.println("perimeter : " + s.perimeter());
        System.out.println();
    }
}
