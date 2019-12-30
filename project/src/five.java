public class five
{
    public static void main(String[] args) {

        one[] pity = {new two(), new four(), new three(), new one()};

        for (int i= 0; i< pity.length; i++) {
            System.out.println(pity[i]);
            pity[i].method1();
            pity[i].method2();
            System.out.println();
        }
    }
}
