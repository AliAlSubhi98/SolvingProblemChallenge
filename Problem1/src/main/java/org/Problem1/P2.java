package org.Problem1;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem: Evaluate the value of an arithmetic expression in Reverse Polish
        Notation. Valid operators are +, -, *, /. Each operand may be an integer or another
        expression.
        For example:
        ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
        ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/
public class P2 {
    public static void Solve() {

        String[] arithmeticExpression = new String[]{"4", "13", "5", "/", "+"};
        ArrayList<Integer> Result = new ArrayList<>();
         //System.out.println(Arrays.toString(arithmeticExpression));

        for(int i=0 ; i< arithmeticExpression.length ; i++) {
            //System.out.println(arithmeticExpression[i]);

            int total = 0;
            if (arithmeticExpression[i].equals("+")) {

                //System.out.println(arithmeticExpression[i]); // check the [+ * / -]

                    total = Result.get(Result.size()-1) + Result.get(Result.size()-2);
                    Result.remove(Result.size()-1);
                    Result.remove(Result.size()-1);
                    Result.add(total);

            }else if (arithmeticExpression[i].equals("*")) {
                //System.out.println(arithmeticExpression[i]); // check the [+ * / -]

                    total = Result.get(Result.size()-1) * Result.get(Result.size()-2);
                    Result.remove(Result.size()-1);
                    Result.remove(Result.size()-1);
                    Result.add(total);

            } else if (arithmeticExpression[i].equals("-")) {
                total = Result.get(Result.size()-2) - Result.get(Result.size()-1);
                Result.remove(Result.size()-1);
                Result.remove(Result.size()-1);
                Result.add(total);


            }else if (arithmeticExpression[i].equals("/")) {
                total = Result.get(Result.size()-2) / Result.get(Result.size()-1);
                Result.remove(Result.size()-1);
                Result.remove(Result.size()-1);
                Result.add(total);


            } else {
                Result.add(Integer.parseInt(arithmeticExpression[i]));
                //System.out.println(Arrays.asList(Result));
            }

        }

        //System.out.println(Arrays.asList(Result));
        System.out.println(Result.get(0));


    }
}
