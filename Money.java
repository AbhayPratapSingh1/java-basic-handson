// Money.java
public class Money {
  final int value;
  Money(int amount){
    this.value = amount;
  }
  public Money add(Money money){
    return new Money(this.value + money.value);
  }
  public Money minus(Money money){
    return new Money(this.value - money.value);
  }
}