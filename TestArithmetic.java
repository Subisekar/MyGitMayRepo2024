package javaBasics;
public class TestArithmetic {

    int int_a=34; int int_b=44;
    static float percent_Data=80.78f;
    public static void main(String[] args) {
        // classname object_name = new className();
        TestArithmetic testArithmetic = new TestArithmetic();
        testArithmetic.doAdditionForIntegers(); 
        testArithmetic.doSubractionForIntegers();
        testArithmetic.doMultipilicationForIntegers();
        testArithmetic.FindModuloForIntegers();

    }
     void doAdditionForIntegers(){
        System.out.println("The Addition result is "+( int_a+int_b));
        System.out.println("The Float result is "+percent_Data);

    }
     void doSubractionForIntegers(){
        System.out.println("The Subraction result is "+ (int_a-int_b));

    }
     void doMultipilicationForIntegers(){
        System.out.println("The Multiplication result is "+ int_a*int_b);

     }
      void FindModuloForIntegers(){
        System.out.println("The reminder result is "+ int_b%int_b);

      }
    
}
