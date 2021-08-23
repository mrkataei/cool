package gen;

import java.util.Hashtable;

public class SymbolTable {
    Hashtable hashtable=new Hashtable();

    ClassDec classDec[]=new ClassDec[1000];
    public void  insert (ClassDec dec){
        int i=0;
            while (true){
                if (classDec[i] == null ){
                    classDec[i]=dec;
                    break;
                }
                else i++;
            }
            getString();
    }

    public void getString (){

        System.out.println(classDec[0].kind);
    }
}
