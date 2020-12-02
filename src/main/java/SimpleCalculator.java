public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }
    public int pow(int a, int b) {
        int answer = a;
        for(int i = 1; i < b; ++i){
            answer *= a;
        }
        return answer;
    }
    public static final void main(String[] args) {
        System.out.println("Hey there CIS350.");
    }

}
