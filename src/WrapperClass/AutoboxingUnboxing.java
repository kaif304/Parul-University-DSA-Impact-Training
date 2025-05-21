package WrapperClass;

import javax.swing.text.StyledEditorKit;

public class AutoboxingUnboxing {
    static void autoBoxing(){
        int intVal = 10;
        Integer wrapperIntVal = intVal;

        System.out.println(wrapperIntVal);
    }
    static void unboxing(){
        Integer wrapperInteger = 10;
        int intVal = wrapperInteger.intValue();

        System.out.println(intVal);
    }
    static void booleanAutoboxing(){
        boolean boolVal = true;
        Boolean boolObj = boolVal;

        System.out.println(boolObj);
    }
    static void booleanUnboxing(){
        Boolean boolObj = true;
        boolean boolVal = boolObj.booleanValue();

        System.out.println(boolVal);
    }

    public static void main(String[] args) {
        autoBoxing();
        unboxing();
        booleanAutoboxing();
        booleanUnboxing();
    }
}
