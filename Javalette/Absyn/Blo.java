package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class Blo extends Block {
  public final ListStmt liststmt_;

  public Blo(ListStmt p1) { liststmt_ = p1; }

  public <R,A> R accept(Javalette.Absyn.Block.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.Blo) {
      Javalette.Absyn.Blo x = (Javalette.Absyn.Blo)o;
      return this.liststmt_.equals(x.liststmt_);
    }
    return false;
  }

  public int hashCode() {
    return this.liststmt_.hashCode();
  }


}
