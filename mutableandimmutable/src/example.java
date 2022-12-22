public class example {

    private String name;

    example(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
}
class example2{
    private final String surname;
    example2(final String surname) {
        this.surname = surname;
    }
    public final String getSurname() {
        return surname;
    }
}