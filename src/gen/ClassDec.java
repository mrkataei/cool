package gen;


public class ClassDec {
    String name;
    String type;
    String kind;

    public ClassDec(String text, String text1, String aClass) {
        this.name=name;
        this.type=type;
        this.kind=kind;
    }


    public String getName (){
        return this.name;
    }
    public String getType (){
        return this.type;
    }
    public String getKind (){
        return this.kind;
    }
    public String getString(){
        return " [identifier=" + name + ", type=" + type + ", kind=" + kind + "]";
    }
}
