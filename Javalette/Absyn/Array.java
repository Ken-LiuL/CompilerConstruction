package Javalette.Absyn; // Java Package generated by the BNF Converter.

public class Array extends Type {
  public final Type type_;

  public Array(Type p1) { type_ = p1; }

  public <R,A> R accept(Javalette.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Javalette.Absyn.Array) {
      Javalette.Absyn.Array x = (Javalette.Absyn.Array)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}