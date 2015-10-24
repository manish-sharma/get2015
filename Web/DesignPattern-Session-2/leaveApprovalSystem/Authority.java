/**
 * This is interface for athority  which has process leave or assign to next authority
 * @author Banwari kevat
 *
 */
public interface Authority{
          public abstract void process(int dayOfLeave);
          public abstract void setNextAuthority(Authority authority);
}
