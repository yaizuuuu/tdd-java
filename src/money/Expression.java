package money;

interface Expression {
    Expression plus(Expression added);

    Money reduce(Bank bank, String to);

    Expression times(int multiplier);
}
