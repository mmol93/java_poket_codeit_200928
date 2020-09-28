public class test1 {
    public final String name;
    public final int cp;

    public test1(String name, int cp) {
        this.name = name;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return name + "(" + cp + ")";
    }
}
