package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class EApp extends Expr {
  public final String ident_;
  public final ListExpr listexpr_;

  public EApp(String p1, ListExpr p2) { ident_ = p1; listexpr_ = p2; }

  public <R,A> R accept(Javalette.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.EApp) {
      Javalette.Absyn.EApp x = (Javalette.Absyn.EApp)o;
      return this.ident_.equals(x.ident_) && this.listexpr_.equals(x.listexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.listexpr_.hashCode();
  }


}
