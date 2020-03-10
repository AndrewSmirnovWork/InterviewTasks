
import java.util.Stack;

//Проверить валидность расстановки скобочек в выражении.
//
//Скобки могут быть всех трех видов - ()[]{}.
//
//На вход программа или функция должна принимать строку, а на выходе ответить правильно ли расставлены скобочки в ней.
//
//Те есть открывающиеся скобочки корректно закрываются скобочкой того же вида.
//
//Например:
//
//"([])" - true
//"{[(]}"- false
public class Brackets {

    public static boolean bracketSequence(String s) {

        char[] symbols = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int counter = 0;

        for (char c : symbols) {
            counter++;

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {

                if (!stack.isEmpty()) {
                    char fromStack = stack.peek();
                    if ((c == ')' && fromStack == '(') ||
                            (c == '}' && fromStack == '{') ||
                            (c == ']' && fromStack == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.add(c);
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
