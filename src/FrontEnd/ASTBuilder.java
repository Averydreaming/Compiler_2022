package FrontEnd;

import AST.*;
import Util.error.syntaxError;
import Util.position;
import org.antlr.v4.runtime.ParserRuleContext;
import parser.MxBaseVisitor;
import parser.MxParser;
import java.util.ArrayList;
//ctx 是在cst中的位置 返回的是ast中的node
public class ASTBuilder extends MxBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitPrograms(MxParser.ProgramsContext ctx) {
        RootNode res = new RootNode(new position(ctx));
        if (ctx.programsimple() != null) {
            for (ParserRuleContext x : ctx.programsimple()) {
                ASTNode tmp = visit(x);
                if (tmp instanceof VardefstmtNode) res.body.addAll(((VardefstmtNode) tmp).varlist);//确保定义节点均为VardefstmtNode
                else res.body.add(tmp);
            }
        }
        return res;
    }
    @Override
    public ASTNode visitProgramsimple(MxParser.ProgramsimpleContext ctx) {
        if (ctx.varDef() != null) return visit(ctx.varDef());
        else if (ctx.funcDef() != null) return visit(ctx.funcDef());
        else return visit(ctx.classDef());
    }



    @Override
    public ASTNode visitClassDef(MxParser.ClassDefContext ctx) {
        ClassdefNode res = new ClassdefNode(new position(ctx), ctx.ID().getText());
        for (ParserRuleContext i : ctx.varDef()) {
            VardefstmtNode tmp = (VardefstmtNode) visit(i);
            res.varlist.addAll(tmp.varlist);
        }
        for (ParserRuleContext i : ctx.funcDef()) {
            FunctiondefNode tmp = (FunctiondefNode) visit(i);
            res.funclist.add(tmp);
        }
        if (ctx.classDefstruct().size() != 0) res.constructor = (FunctiondefNode) visit(ctx.classDefstruct().get(0));
        return res;
    }

    @Override
    public ASTNode visitFuncDef(MxParser.FuncDefContext ctx) {
        FunctiondefNode res = new FunctiondefNode(new position(ctx), ctx.returntype() == null ? null : (TypeNode) visit(ctx.returntype()), ctx.ID().getText(), ctx.paraList() == null ? (new ArrayList<>()) : ((VardefstmtNode) visit(ctx.paraList())).varlist, (PartstmtNode ) visit(ctx.part()));
        return res;
    }


    @Override
    public ASTNode visitVarDef(MxParser.VarDefContext ctx) {
        VardefstmtNode res = new VardefstmtNode(new position(ctx));
        TypeNode _type = (TypeNode) visit(ctx.type());
        for (ParserRuleContext x : ctx.varDefsimple()) {
            VardefsubstmtNode tmp = (VardefsubstmtNode) visit(x);
            tmp.type = _type;
            res.varlist.add(tmp);
        }
        return res;
    }

    @Override
    public ASTNode visitVarDefsimple(MxParser.VarDefsimpleContext ctx) {
        return new VardefsubstmtNode(new position(ctx), ctx.ID().getText(), ctx.expr() == null ? null : (ExprNode) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitParaList(MxParser.ParaListContext ctx) {
        VardefstmtNode res = new VardefstmtNode(new position(ctx));
        for (ParserRuleContext x : ctx.para()) {
            VardefsubstmtNode tmp = (VardefsubstmtNode) visit(x);
            res.varlist.add(tmp);
        }
        return res;
    }

    @Override
    public ASTNode visitPara(MxParser.ParaContext ctx) {
        VardefsubstmtNode res = new VardefsubstmtNode(new position(ctx), ctx.ID().getText(), null);
        res.type = (TypeNode) visit(ctx.type());
        return res;
    }

    @Override
    public ASTNode visitClassDefstruct(MxParser.ClassDefstructContext ctx) {
        return new FunctiondefNode(new position(ctx), null, ctx.ID().getText(), new ArrayList<>(), (PartstmtNode ) visit(ctx.part()));
    }

    @Override
    public ASTNode visitPartstmt(MxParser.PartstmtContext ctx) {
        PartstmtNode  res = new PartstmtNode (new position(ctx));
        if (ctx.part().stmt() != null) {
            for (ParserRuleContext x : ctx.part().stmt())
                res.stmtlist.add((StmtNode) visit(x));
        }
        return res;
    }

    @Override
    public ASTNode visitVarDefstmt(MxParser.VarDefstmtContext ctx) {
        return visit(ctx.varDef());
    }

    @Override
    public ASTNode visitIfstmt(MxParser.IfstmtContext ctx) {
        return new IfstmtNode(new position(ctx), (ExprNode) visit(ctx.expr()), (StmtNode) visit(ctx.st1), ctx.st2 == null ? null : (StmtNode) visit(ctx.st2));
    }

    @Override
    public ASTNode visitForstmt(MxParser.ForstmtContext ctx) {
        return new ForstmtNode(new position(ctx), ctx.expr1 == null ? null : (ExprNode) visit(ctx.expr1), ctx.expr2 == null ? null : (ExprNode) visit(ctx.expr2), ctx.expr3 == null ? null : (ExprNode) visit(ctx.expr3), (StmtNode) visit(ctx.stmt()));
    }

    @Override
    public ASTNode visitWhilestmt(MxParser.WhilestmtContext ctx) {
        return new WhilestmtNode(new position(ctx), (ExprNode) visit(ctx.expr()), (StmtNode) visit(ctx.stmt()));
    }

    @Override
    public ASTNode visitReturnstmt(MxParser.ReturnstmtContext ctx) {
        return new ReturnstmtNode(new position(ctx), ctx.expr() == null ? null : (ExprNode) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitContinuestmt(MxParser.ContinuestmtContext ctx) {
        return new ContinuestmtNode(new position(ctx));
    }

    @Override
    public ASTNode visitBreakstmt(MxParser.BreakstmtContext ctx) {
        return new BreakstmtNode(new position(ctx));
    }

    @Override
    public ASTNode visitExprstmt(MxParser.ExprstmtContext ctx) {
        return new ExprstmtNode(new position(ctx), (ExprNode) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitNullstmt(MxParser.NullstmtContext ctx) {
        return new EmptystmtNode(new position(ctx));
    }

    @Override
    public ASTNode visitPart(MxParser.PartContext ctx) {
        PartstmtNode  res = new PartstmtNode (new position(ctx));
        if (ctx.stmt() != null) {
            for (ParserRuleContext x : ctx.stmt())
                res.stmtlist.add((StmtNode) visit(x));
        }
        return res;
    }

    @Override
    public ASTNode visitArraynewformat(MxParser.ArraynewformatContext ctx) {
        TypeNode _type = (TypeNode) visit(ctx.basictype());
        ArrayList<ExprNode> _exprlist = new ArrayList<>();
        for (ParserRuleContext x : ctx.expr())
            _exprlist.add((ExprNode) visit(x));
        return new NewexprNode(new position(ctx), _type, (ctx.getChildCount() - ctx.expr().size() - 1) / 2, _exprlist);
    }
    @Override
    public ASTNode visitErrornewformat(MxParser.ErrornewformatContext ctx) {
        throw new syntaxError("Errornewformat", new position(ctx));
    }

    @Override
    public ASTNode visitClassnewformat(MxParser.ClassnewformatContext ctx) {
        return new NewexprNode(new position(ctx), (TypeNode) visit(ctx.basictype()), 0, null);
    }

    @Override
    public ASTNode visitBasicnewformat(MxParser.BasicnewformatContext ctx) {
        return new NewexprNode(new position(ctx), (TypeNode) visit(ctx.basictype()), 0, null);
    }
//expr
    @Override
    public ASTNode visitBinaryexpr(MxParser.BinaryexprContext ctx) {
        ExprNode src1 = (ExprNode) visit(ctx.src1), src2 = (ExprNode) visit(ctx.src2);
        String op = ctx.op.getText();
        BinaryexprNode res = new BinaryexprNode(new position(ctx), src1, src2, op);
        return res;
    }
    
    @Override
    public ASTNode visitSuffixexpr(MxParser.SuffixexprContext ctx) {
        return new SuffixexprNode(new position(ctx), (ExprNode) visit(ctx.expr()), ctx.op.getText());
    }

    @Override
    public ASTNode visitPrefixexpr(MxParser.PrefixexprContext ctx) {
        return new PrefixexprNode(new position(ctx), (ExprNode) visit(ctx.expr()), ctx.op.getText());
    }
    @Override
    public ASTNode visitConstexpr(MxParser.ConstexprContext ctx) {
        return visit(ctx.constant());
    }

    @Override
    public ASTNode visitNewexpr(MxParser.NewexprContext ctx) {
        return visit(ctx.newformat());
    }

    @Override
    public ASTNode visitClassexpr(MxParser.ClassexprContext ctx) {
        return new ClassexprNode(new position(ctx), (ExprNode) visit(ctx.expr()), ctx.ID().getText());
    }

    @Override
    public ASTNode visitThisexpr(MxParser.ThisexprContext ctx) {
        return new ThisexprNode(new position(ctx));
    }

    @Override
    public ASTNode visitSubexpr(MxParser.SubexprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitIdexpr(MxParser.IdexprContext ctx) {
        return new VarexprNode(new position(ctx), ctx.ID().getText());
    }

    @Override
    public ASTNode visitArrexpr(MxParser.ArrexprContext ctx) {
        return new ArrexprNode(new position(ctx), (ExprNode) visit(ctx.expr1), (ExprNode) visit(ctx.expr2));
    }

    @Override
    public ASTNode visitFuncexpr(MxParser.FuncexprContext ctx) {
        ExprNode _expr = (ExprNode) visit(ctx.expr());
        if (_expr instanceof ClassexprNode) {
            _expr.assign = false;
            ((ClassexprNode) _expr).flag_func = true;
        }
        return new FuncexprNode(new position(ctx), _expr, ctx.exprList() == null ? new ExprlistexprNode(new position(ctx)) : (ExprlistexprNode) visit(ctx.exprList()));
    }

    @Override
    public ASTNode visitExprList(MxParser.ExprListContext ctx) {
        ExprlistexprNode res = new ExprlistexprNode(new position(ctx));
        for (ParserRuleContext x : ctx.expr())
            res.exprlist.add((ExprNode) visit(x));
        return res;
    }
//Type
    @Override
    public ASTNode visitBasictype(MxParser.BasictypeContext ctx) {
        return new TypeNode(new position(ctx), ctx.getText(), 0);
    }

    @Override
    public ASTNode visitType(MxParser.TypeContext ctx) {
        return new TypeNode(new position(ctx), ctx.basictype().getText(), (ctx.getChildCount() - 1) / 2);
    }

    @Override
    public ASTNode visitReturntype(MxParser.ReturntypeContext ctx) {
        if (ctx.type() != null) return visit(ctx.type());
        else return new TypeNode(new position(ctx), ctx.Void().getText(), 0);
    }

    @Override
    public ASTNode visitConstant(MxParser.ConstantContext ctx) {
        if (ctx.Integers() != null) return new IntexprNode(new position(ctx), Integer.parseInt(ctx.Integers().getText()));
        else if (ctx.Strings() != null) return new StringexprNode(new position(ctx), ctx.Strings().getText());
        else if (ctx.Bools() != null)  return new BoolexprNode(new position(ctx), Boolean.parseBoolean(ctx.Bools().getText()));
        else return new NullexprNode(new position(ctx));
    }

    private class VarDefStmtContext {
    }
}