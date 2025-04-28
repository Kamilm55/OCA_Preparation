package OCA.Chapter3;

public class StringBuilder_Pr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sb");
        StringBuilder sb2 = new StringBuilder("sb");// CharSequence
        String s1 = ""; // CharSequence

        sb.append(sb2);
        //  @Override
        //    public StringBuilder append(CharSequence s) {
        //        super.append(s);
        //        return this;
        //    }

        // Overloaded version with int
        sb.append(1);

        // What we can convert to String it is valid
        //@Override
        //    public StringBuilder append(Object obj) {
        //        return append(String.valueOf(obj));
        //    }
        // @Override
        //    public StringBuilder append(boolean b) {
        //        super.append(b);
        //        return this;
        //    }
        sb.append(false);
        sb.append(12L);
        sb.append(15.6f);// append as 15.6 without "f"

        sb.insert(0,0);
//  @Override
//    public StringBuilder insert(int offset, Object obj) {
//            super.insert(offset, obj);
//            return this;
//    }
        System.out.println(sb);
    }
}
