import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import  java.io.IOException;
import  gen.*;

public class Compiler {
    public static void  main (String [] args) throws  IOException {
        CharStream stream = CharStreams.fromFileName("sampels//codes.cl");
        COOLLexer lexer =new COOLLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParser parser =new COOLParser(tokens);
        ParseTreeWalker walker=new ParseTreeWalker();
        COOLListener listener =new COOLBaseListener();
        walker.walk(listener ,parser.program());

    }
}
