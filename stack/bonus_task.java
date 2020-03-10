import java.util.Stack;

class bonus_task{
    public static void main(String args[]){
        String exp1 = new String("1+b*[(2/4)-{6+2}]+2");
        String exp2 = new String("1+b*(2/4)-{6+2]+2");
        String exp3 = new String("1+b*[(2/3)+2");
        String exp4 = new String("1+b*2/4-6)+2+2");
        
        System.out.println(checkParent(exp1));
        System.out.println(checkParent(exp2));
        System.out.println(checkParent(exp3));
        System.out.println(checkParent(exp4));


    }

    public static String checkParent(String exp){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            if(c == '{' || c == '(' || c == '[')
                stack.push(c);
            if(c == '}' || c == ')' || c == ']'){
                if(stack.isEmpty())
                    return "Incorrect";
                char last = stack.peek();
                if((c == '}' && last == '{')||(c == ')' && last == '(')||(c == ']' && last == '['))
                    stack.pop();
                else
                    return "Incorrect";
            }
        }

        if(stack.isEmpty())
            return "Correct";
        else
            return "Incorrect";

    }

    public static int evaluate(String exp){
        char[] tokens = exp.toCharArray();

        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i] >= '0' && tokens[i] <=9)
            {
                values.push(tokens[i]);
            }
            else if(tokens[i])
        }
    }




}