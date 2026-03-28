class Solution {
    public boolean isValid(String s) {
        Stack<Character> stock = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stock.push(ch);
            }
            else
            {
                if(stock.isEmpty())
                {
                    return false;
                }
                char top = stock.pop();

                if((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '['))
                {
                    return false;
                }
            }
        }
        return stock.isEmpty();
    }
}