public interface Checker {

    void check(String s, boolean login) throws WrongPasswordException, WrongLoginException;
}
