package hello;

public class Calculator {
    private int ans;

    public int add(int a) {
        ans += a;
        return ans;
    }

    public int sub(int b) {
        ans -= b;
        return ans;
    }
}
