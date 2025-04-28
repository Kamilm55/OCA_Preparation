package OCA.Chapter4_5;

class Order{
    static String result = "";
    {result += "c";}
    static
    {result += "u";}
    {result += "r";}
}

class Review_22 {
    public static void main(String[] args) {
//        On every call static init works? or once?
//        Static initialization blocks in Java are executed once when the class is loaded into memory, not on every call.
//
//        On every call static fields initialize again?
//        No, static fields are not initialized again on every call. They are initialized once when the class is loaded,
//        and their values persist for the lifetime of the class.
        System.out.print(Order.result + " ");// init "" + static init "u" -> "u "
        System.out.print(Order.result + " ");// not init again, print shared field again -> "u "
        new Order();// Statics are initialized -> result is "u",then -> "ucr"
        new Order();// Statics are initialized -> result is "ucr",then -> "ucrcr"
        System.out.print(Order.result + " ");// "ucrcr"
    }
}


