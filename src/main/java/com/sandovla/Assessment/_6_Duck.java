package com.sandovla.Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public final class _6_Duck {

    private String name;
    private List<_6_Duck> ducklings;

    public _6_Duck(String name, List<_6_Duck> ducklings) {
        this.name = name;
        this.ducklings = new ArrayList<_6_Duck>(ducklings);
    }

    public String getName() { return name; }
    public List<_6_Duck> getDucklings() { return ducklings; }

    public String hasDucklings(Predicate<_6_Duck> p) {
        return p.test(this) ? "Quack Quack": "";
    }

}
