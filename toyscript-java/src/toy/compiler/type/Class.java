package toy.compiler.type;

import toy.compiler.Scope;

public class Class extends Scope implements Type {
    //父类
    private Class parentClass = null; //= rootClass;


    @Override
    public boolean isType(Type type) {
        return false;
    }
}