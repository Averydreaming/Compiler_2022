import AST.RootNode;
import FrontEnd.ASTBuilder;
import FrontEnd.SemanticChecker;
import FrontEnd.SymbolCollector;
import FrontEnd.TypeCollector;
import Util.MxErrorListener;
import Util.Scope;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MxLexer;
import parser.MxParser;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
 		//CharStream input = CharStreams.fromFileName("D:\\A\\array-3.mx");//新建一个CharStream读取数
        InputStream input = System.in;
               try {
                   MxLexer lexer = new MxLexer(input);
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(new MxErrorListener());
                    MxParser parser = new MxParser(new CommonTokenStream(lexer));
                    parser.removeErrorListeners();
                    parser.addErrorListener(new MxErrorListener());
                    ParseTree parseTreeRoot = parser.programs();
                    ASTBuilder astBuilder = new ASTBuilder();
                    RootNode root;
                    root = (RootNode) astBuilder.visit(parseTreeRoot);
                    Scope global = new Scope(null);
                    new SymbolCollector(global).visit(root);
                    new TypeCollector(global).visit(root);
                    global.var_map.clear();
                    new SemanticChecker(global).visit(root);
                }
                catch (Error er) {
                    System.err.println(er.toString());
                    throw new RuntimeException();
                }
    }
}
