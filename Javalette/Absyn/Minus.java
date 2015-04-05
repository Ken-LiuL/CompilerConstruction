package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class Minus extends AddOp {

  public Minus() { }

  public <R,A> R accept(Javalette.Absyn.AddOp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.Minus) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
