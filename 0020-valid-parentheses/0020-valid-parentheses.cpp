class Solution {
public:
    bool isValid(string s) {
        
        stack<char> str;
       
        for(int i=0; i<s.length(); i++){

            char ch = s[i];
            if(ch == '(' || ch == '{' || ch == '[')
                str.push(ch);
            else{
                if(str.empty()) return false;

                char t = str.top();
                if(ch == t+1 || ch == t+2)
                    str.pop();
                else
                    return false;
            }

        }

        return str.empty();
    }
};
