package Chapter4_5.Practice;

public interface Final {
    public static /*final*/ void finalMethod(){ // Modifier 'final' not allowed here
        System.out.println();
    }
    // They belong to the interface itself and cannot be overridden,
    // so they already behave like final methods implicitly. (in case of static)
    // However, explicitly marking them as final is redundant and disallowed. IN INTERFACE
}
 class Final2 {
    public static final void finalMethod(){ // Valid for class
        System.out.println();
    }
}
