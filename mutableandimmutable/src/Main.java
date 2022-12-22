public class Main {
    public static void main(String[] args) {
        example obj=new example("talha");
        System.out.println(obj.getName());

        obj.setName("talha1");
        System.out.println(obj.getName());


        //immutable

        example2 obj2=new example2("ekinci");
        System.out.println(obj2.getSurname());

    }
}