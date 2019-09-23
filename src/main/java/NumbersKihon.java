import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        int a;
        int b;
        return Integer.max(a,b);

    }

    @Override
    protected int returnTheMinimumValueOfInt() {


    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {

        return a%b;
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
        return 
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
        throw new UnsupportedOperationException();
    }
}
