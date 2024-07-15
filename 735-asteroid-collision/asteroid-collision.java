class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();

        for(int a :asteroids){
            while(!stack.isEmpty() && a<0 && stack.peek()>0){
                int sum = a+ stack.peek();
                if(sum<0){
                    stack.pop();
                }
                else if(sum>0){
                    a =0;
                    break;
                }else{
                    stack.pop();
                    a = 0;
                }
            }

            if(a!=0){
                stack.push(a);
            }
        }

        int s = stack.size();

        int ans[] = new int[s];

        for(int i=s-1; i>=0; i--){
            ans[i] = stack.pop();
        }

        return ans;

    }
}